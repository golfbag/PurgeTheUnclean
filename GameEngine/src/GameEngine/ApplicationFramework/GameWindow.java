package GameEngine.ApplicationFramework;

import java.util.Timer;

import javax.swing.JFrame;

import GameEngine.PhysicsEngine;
import GameEngine.InputHandler.KeyHandler;
import GameEngine.InputHandler.MouseHandler;

public final class GameWindow extends JFrame {

	private boolean isRunning;
	private GamePanel gamePanel;
	private State state;
	private KeyHandler keyHandler;
	private static GameWindow instance;
	private long startTime; 
	private long lastLoopTime = System.currentTimeMillis();
	private Timer timer;
	private PhysicsEngine physicsEngine;
	private long delta;

	public void run() {
		initialize();
		startTime = System.currentTimeMillis();
		timer = new Timer();
		timer.schedule(new GameLoop(), 0, 1000 / 10);
	}

	private class GameLoop extends java.util.TimerTask {
		public void run() {
			delta = System.currentTimeMillis() - lastLoopTime;
			lastLoopTime = System.currentTimeMillis();
			update();
			draw();

			if (!isRunning) {
				timer.cancel();
			}
		}
	}

	public void initialize() {
		isRunning = true;
		gamePanel = new GamePanel(state);
		addKeyListener(keyHandler);
		addMouseListener(new MouseHandler());
	}

	public void update() {
		for (int i = state.getSprites().size() - 1; i >= 0; i--) {
			Sprite sprite = state.getSprites().get(i);
			if (!sprite.isAlive()) {
				state.removeSprite(sprite);
			} else {
				if (sprite.isCollidable())
					physicsEngine.doCollision(sprite);
				sprite.update();
				if(sprite.getHasGravity())
					physicsEngine.doGravity(sprite);
				if (sprite.getHasPhysics())
					physicsEngine.doPhysics(sprite);
				
			}
		}
	}

	public void draw() {
		gamePanel.paintComponent(getGraphics());
	}

	private GameWindow(String windowName, int windowWidth, int windowHeight,
			GameObject background, int zeroPoint, float gravity) {
		super(windowName);
		setSize(windowWidth, windowHeight);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		state = new State(background);
		keyHandler = new KeyHandler();
		physicsEngine = new PhysicsEngine(zeroPoint, gravity);
	}

	public static void createInstance(String windowName, int windowWidth,
			int windowHeight, GameObject backgrund, int zeroPoint, float gravity) {
		if (instance == null) {
			instance = new GameWindow(windowName, windowWidth, windowHeight,
					backgrund, zeroPoint, gravity);
		}
	}
	
	public long getStartTime(){
		return startTime;
	}
	
	public long getLastLoopTime(){
		return lastLoopTime;
	}

	public static GameWindow getInstance() {
		return instance;
	}

	public State getGameState() {
		return state;
	}

	public KeyHandler getInputHandler() {
		return keyHandler;
	}

	public PhysicsEngine getPhysicsEngine() {
		return physicsEngine;
	}
	public long getDelta(){
		return delta;
	}
}

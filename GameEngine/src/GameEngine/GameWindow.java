package GameEngine;

import java.util.Iterator;
import java.util.Timer;

import javax.swing.JFrame;

public final class GameWindow extends JFrame {

	private boolean isRunning;
	private GamePanel gamePanel;
	private State state;
	private KeyHandler keyHandler;
	private static GameWindow instance;
	private long startTime; 

	private Timer timer;
	private PhysicsEngine physicsEngine;

	public void run() {
		initialize();
		startTime = System.currentTimeMillis();
		timer = new Timer();
		timer.schedule(new GameLoop(), 0, 1000 / 10);
	}

	private class GameLoop extends java.util.TimerTask {
		public void run() {
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
				if (sprite.getHasPhysics())
					physicsEngine.doGravity(sprite);
			}
		}
	}

	public void draw() {
		gamePanel.paintComponent(getGraphics());
	}

	private GameWindow(String windowName, int windowWidth, int windowHeight,
			GameObject backgrund, int zeroPoint) {
		super(windowName);
		setSize(windowWidth, windowHeight);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		state = new State(backgrund);
		keyHandler = new KeyHandler();
		physicsEngine = new PhysicsEngine(zeroPoint, 6);
	}

	public static void createInstance(String windowName, int windowWidth,
			int windowHeight, GameObject backgrund, int zeroPoint) {
		if (instance == null) {
			instance = new GameWindow(windowName, windowWidth, windowHeight,
					backgrund, zeroPoint);
		}
	}
	
	public long getStartTime(){
		return startTime;
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

}

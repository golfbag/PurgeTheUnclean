package GameEngine;

import java.util.Timer;
import javax.swing.JFrame;

public final class GameWindow extends JFrame {

	private boolean isRunning;
	private GamePanel gamePanel;
	private State state;
	private InputHandler inputHandler;
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
		addKeyListener(inputHandler);

	}

	public void update() {
		for (Sprite sprite : state.getSprites()) {
			sprite.update();
			if (sprite.getHasPhysics() == true)
				physicsEngine.doGravity(sprite);
		}

	}

	public void draw() {
		gamePanel.paintComponent(getGraphics());
	}

	private GameWindow(String windowName, int windowWidth, int windowHeight,
			int zeroPoint) {
		super(windowName);
		setSize(windowWidth, windowHeight);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		state = new State();
		inputHandler = new InputHandler();
		physicsEngine = new PhysicsEngine(zeroPoint, 6);
	}

	public static void createInstance(String windowName, int windowWidth,
			int windowHeight, int zeroPoint) {
		if (instance == null) {
			instance = new GameWindow(windowName, windowWidth, windowHeight,
					zeroPoint);
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

	public InputHandler getInputHandler() {
		return inputHandler;
	}
	
	public PhysicsEngine getPhysicsEngine() {
		return physicsEngine;
	}

}

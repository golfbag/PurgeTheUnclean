package GameEngine;

import java.awt.event.KeyEvent;
import java.util.Timer;

import javax.swing.JFrame;

import TestGame.Enemy;

public final class GameWindow extends JFrame {

	private boolean isRunning;
	private GamePanel gamePanel;
	private State state;
	private InputHandler inputHandler;
	private static GameWindow instance;
	
	private Timer timer;
	private PhysicsEngine physicsEngine;
	public void run() {
		initialize();
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
		physicsEngine.setZero(400);
	}

	public void update() {
		for (Sprite sprite : state.getSprites()){
			sprite.update();
			if (sprite.getHasPhysics() == true)
				physicsEngine.doGravity(sprite);
		}
				
	}

	public void draw() {
		gamePanel.paintComponent(getGraphics());
	}

	private GameWindow(String windowName, int windowWidth, int windowHeight){
		super(windowName);
		setSize(windowWidth, windowHeight);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		state = new State();
		
		inputHandler = new InputHandler();
		physicsEngine = new PhysicsEngine();
	}
	
	public static void createInstance(String windowName, int windowWidth, int windowHeight){
		if(instance == null){
			instance = new GameWindow(windowName, windowWidth, windowHeight);
		}
	}
	
	public static GameWindow getInstance(){
		return instance;
	}

	public State getGameState() {
		return state;
	}

	public InputHandler getInputHandler() {
		return inputHandler;
	}

}

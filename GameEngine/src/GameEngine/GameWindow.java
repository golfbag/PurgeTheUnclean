package GameEngine;

import java.awt.event.KeyEvent;
import java.util.Timer;

import javax.swing.JFrame;

import TestGame.Enemy;

public final class GameWindow extends JFrame {

	private static boolean isRunning;
	private static GamePanel gamePanel;
	private static State state;
	private static InputHandler inputHandler;
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
	
	public static GameWindow getInstance(String windowName, int width, int height){

		return new GameWindow(windowName, width, height);
	}

	public static State getGameState() {
		return state;
	}

	public static InputHandler getInputHandler() {
		return inputHandler;
	}

}

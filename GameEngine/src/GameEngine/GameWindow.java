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

	public void run() {
		initialize();
		timer = new Timer();
		timer.schedule(new GameLoop(), 0, 1000 / 30);
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
		for (Sprite sprite : state.getSprites())
			sprite.update();
	}

	public void draw() {
		gamePanel.paint(getGraphics());
	}

	private GameWindow(String windowName, int width, int height) {
		super(windowName);
		setSize(width, height);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		state = new State();
		inputHandler = new InputHandler();
	}

	public static GameWindow getInstance(String windowName, int width,
			int height) {
		return new GameWindow(windowName, width, height);
	}

	public static State getGameState() {
		return state;
	}

	public static InputHandler getInputHandler() {
		return inputHandler;
	}

}

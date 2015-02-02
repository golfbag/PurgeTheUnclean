package GameEngine;

import java.awt.event.KeyEvent;

import javax.swing.JFrame;

import TestGame.Enemy;

public class GameWindow extends JFrame {
	
	private boolean isRunning;
	private GamePanel gamePanel;
	private State state;
	private InputHandler inputHandler;
	
	public void run() {
		initialize();
		while (isRunning) {
			update();
			draw();
		}
	}
	
	public void initialize() {
		isRunning = true;
		gamePanel = new GamePanel(state);
		gamePanel.addKeyListener(inputHandler);
	}

	public void update() {
		for (Sprite sprite: state.getSprites())
			sprite.update();
	}

	public void draw() {
		gamePanel.paint(getGraphics());
	}

	public GameWindow(String windowName, int width, int height){
		super(windowName);
		setSize(width, height);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		state = new State();
		inputHandler = new InputHandler();
	}
	
	public State getGameState(){
		return this.state;
	}
	
	public InputHandler getInputHandler(){
		return inputHandler;
	}

}

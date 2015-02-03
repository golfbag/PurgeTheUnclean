package TestGame;

import java.awt.event.KeyEvent;

import GameEngine.GameWindow;
import GameEngine.Sprite;

public class Enemy extends Sprite {

	public Enemy(int xPos, int yPos, String fileName) {
		super(xPos, yPos, fileName);
		System.out.println(getHasPhysics());
		setHasPhysics(true);
		System.out.println(getHasPhysics());
	}

	public void update() {
		if(GameWindow.getInputHandler().isKey(KeyEvent.VK_UP))
			setY(getYPos() - 10);
		if(GameWindow.getInputHandler().isKey(KeyEvent.VK_DOWN))
			setY(getYPos() + 3);
		if(GameWindow.getInputHandler().isKey(KeyEvent.VK_LEFT))
			setX(getXPos() - 3);
		if(GameWindow.getInputHandler().isKey(KeyEvent.VK_RIGHT))
			setX(getXPos() + 3);
	}
}

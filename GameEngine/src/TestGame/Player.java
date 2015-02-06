package TestGame;

import java.awt.event.KeyEvent;

import GameEngine.ApplicationFramework.GameWindow;
import GameEngine.ApplicationFramework.Sprite;

public class Player extends Sprite {

	public Player(int xPos, int yPos, String fileName) {
		super(xPos, yPos, fileName);
		setHasGravity(true);
		setHasPhysics(true);
		setCollidable(true);
	}

	public void update() {

		if (GameWindow.getInstance().getInputHandler().isKey(KeyEvent.VK_UP))
			setYPos(getYPos() - 30);
		if (GameWindow.getInstance().getInputHandler().isKey(KeyEvent.VK_DOWN))
			setYPos(getYPos() + 3);
		if (GameWindow.getInstance().getInputHandler().isKey(KeyEvent.VK_LEFT))
			setXPos(getXPos() - 5);
		if (GameWindow.getInstance().getInputHandler().isKey(KeyEvent.VK_RIGHT))
			setXPos(getXPos() + 5);
	}

	@Override
	public void doCollision(Sprite otherSprite) {
		
	}
}

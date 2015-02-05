package TestGame;

import java.awt.event.KeyEvent;

import GameEngine.GameWindow;
import GameEngine.Sprite;

public class Player extends Sprite {

	public Player(int xPos, int yPos, String fileName) {
		super(xPos, yPos, fileName);
		setHasPhysics(true);
		setCollidable(true);
	}

	public void update() {

		if (GameWindow.getInstance().getInputHandler().isKey(KeyEvent.VK_UP))
			setY(getYPos() - 30);
		if (GameWindow.getInstance().getInputHandler().isKey(KeyEvent.VK_DOWN))
			setY(getYPos() + 3);
		if (GameWindow.getInstance().getInputHandler().isKey(KeyEvent.VK_LEFT))
			setX(getXPos() - 5);
		if (GameWindow.getInstance().getInputHandler().isKey(KeyEvent.VK_RIGHT))
			setX(getXPos() + 5);
	}

	@Override
	public void doCollision(Sprite otherSprite) {
		
	}
}

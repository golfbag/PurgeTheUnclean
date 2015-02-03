package TestGame;

import java.awt.event.KeyEvent;

import GameEngine.GameWindow;
import GameEngine.Sprite;

public class Enemy extends Sprite {

	public Enemy(int xPos, int yPos, String fileName) {
		super(xPos, yPos, fileName);
		setHasPhysics(true);
	}

	public void update() {
		if(GameWindow.getInstance().getInputHandler().isKey(KeyEvent.VK_UP))
			setY(getYPos() - 1);
		if(GameWindow.getInstance().getInputHandler().isKey(KeyEvent.VK_DOWN))
			setY(getYPos() + 1);
		if(GameWindow.getInstance().getInputHandler().isKey(KeyEvent.VK_LEFT))
			setX(getXPos() -1 );
		if(GameWindow.getInstance().getInputHandler().isKey(KeyEvent.VK_RIGHT))
			setX(getXPos() +1 );
	}
}

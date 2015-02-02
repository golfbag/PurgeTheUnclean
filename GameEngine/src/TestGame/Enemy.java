package TestGame;

import java.awt.event.KeyEvent;

import GameEngine.GameWindow;
import GameEngine.Sprite;

public class Enemy extends Sprite {

	public Enemy(int xPos, int yPos, String fileName) {
		super(xPos, yPos, fileName);
	}

	public void update() {
		if(GameWindow.getInputHandler().isKey(KeyEvent.VK_UP))
			setY(40);
		
	}
	
}

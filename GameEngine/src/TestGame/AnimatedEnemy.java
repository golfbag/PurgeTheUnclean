package TestGame;

import java.awt.event.KeyEvent;

import GameEngine.AnimatedSprite;
import GameEngine.Animation;
import GameEngine.GameWindow;
import GameEngine.Sprite;

public class AnimatedEnemy extends AnimatedSprite {

	public AnimatedEnemy(int xPos, int yPos, Animation animation) {
		super(xPos, yPos, animation);
	}

	@Override
	public void update() {
		
		runAnimation(100);
		
		if (GameWindow.getInstance().getInputHandler().isKey(KeyEvent.VK_W)){
			move(0, -50);
		}
			
		if (GameWindow.getInstance().getInputHandler().isKey(KeyEvent.VK_S))
			move(0, 50);
		
		if (GameWindow.getInstance().getInputHandler().isKey(KeyEvent.VK_A)){
			move(-50, 0);
		}
			
		if (GameWindow.getInstance().getInputHandler().isKey(KeyEvent.VK_D)){
			move(50, 0);
		}
			
		
	}

	@Override
	public void doCollision(Sprite otherSprite) {
		
		
	}


}

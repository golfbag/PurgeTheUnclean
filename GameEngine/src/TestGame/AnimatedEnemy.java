package TestGame;

import java.awt.event.KeyEvent;

import GameEngine.AnimatedSprite;
import GameEngine.Animation;
import GameEngine.GameWindow;

public class AnimatedEnemy extends AnimatedSprite {

	public AnimatedEnemy(int xPos, int yPos, Animation animation) {
		super(xPos, yPos, animation);
	}

	@Override
	public void update() {
		
		runAnimation(100);
		
		if (GameWindow.getInstance().getInputHandler().isKey(KeyEvent.VK_W)){
			move(0, 10);
		}
			
		if (GameWindow.getInstance().getInputHandler().isKey(KeyEvent.VK_S))
			move(0, -10);
		
		if (GameWindow.getInstance().getInputHandler().isKey(KeyEvent.VK_A)){
			move(-10, 0);
		}
			
		if (GameWindow.getInstance().getInputHandler().isKey(KeyEvent.VK_D)){
			move(10, 0);
		}
			
		
	}

	@Override
	public void doCollision() {
		// TODO Auto-generated method stub
		
	}


}

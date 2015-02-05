package TestGame;

import java.awt.event.KeyEvent;

import GameEngine.AnimatedSprite;
import GameEngine.Animation;
import GameEngine.GameWindow;
import GameEngine.Sprite;

public class AnimatedEnemy extends AnimatedSprite {

	public AnimatedEnemy(int xPos, int yPos, Animation animation) {
		super(xPos, yPos, animation);
		setHasGravity(true);
		setHasPhysics(true);
		setCollidable(true);
	}

	@Override
	public void update() {
		
		if (getYPos() == 340)
			setVelocityUpDown(0);
		
		runAnimation(100);
		
		if (GameWindow.getInstance().getInputHandler().isKey(KeyEvent.VK_W)){
			move(0, 8000);
		}

		if (GameWindow.getInstance().getInputHandler().isKey(KeyEvent.VK_S)){
			move(0, -50);
		}

		if (GameWindow.getInstance().getInputHandler().isKey(KeyEvent.VK_A)){
			move(-500, 0);
		}
			
		if (GameWindow.getInstance().getInputHandler().isKey(KeyEvent.VK_D)){
			move(500, 0);
		}
			
		
	}

	@Override
	public void doCollision(Sprite otherSprite) {
		System.out.println("Let the bodies...");
		if (getVelocityUpDown()>200)
			setAlive(false);
	}


}

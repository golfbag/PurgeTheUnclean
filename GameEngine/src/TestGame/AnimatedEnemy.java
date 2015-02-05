package TestGame;

import java.awt.event.KeyEvent;

import GameEngine.ApplicationFramework.AnimatedSprite;
import GameEngine.ApplicationFramework.Animation;
import GameEngine.ApplicationFramework.GameWindow;
import GameEngine.ApplicationFramework.Sprite;

public class AnimatedEnemy extends AnimatedSprite {

	boolean isDead = false;

	public AnimatedEnemy(int xPos, int yPos, Animation animation) {
		super(xPos, yPos, animation);
		setHasGravity(true);
		setHasPhysics(true);
		setCollidable(true);
	}

	@Override
	public void update() {
		if (isDead){
			setVelocityLeftRight(0);
			runDeathAnimation(300);
		}
		else{
			runAnimation(100);
			if (getYPos() > 330){
				Animation animation = new Animation(1, 2, 73, 67, "fågel2", 5, 2);
				setAnimation(animation);
			}

			if (GameWindow.getInstance().getInputHandler().isKey(KeyEvent.VK_W)) {
				move(0, 5000);
			}

			if (GameWindow.getInstance().getInputHandler().isKey(KeyEvent.VK_S)) {
				move(0, -50);
			}

			if (GameWindow.getInstance().getInputHandler().isKey(KeyEvent.VK_A)) {
				move(-500, 0);
			}

			if (GameWindow.getInstance().getInputHandler().isKey(KeyEvent.VK_D)) {
				move(500, 0);
			}
		}
	}

	@Override
	public void doCollision(Sprite otherSprite) {
		
		System.out.println("Let the bodies...");
		if (getVelocityUpDown() > 100){
			Animation animation = new Animation(1, 1, 69, 67, "boom", 10, 2);
			setAnimation(animation);
			isDead =true;
			
		}
			
	}

}

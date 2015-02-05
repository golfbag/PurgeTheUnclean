package TestGame;

import java.awt.event.KeyEvent;

import GameEngine.AnimatedSprite;
import GameEngine.Animation;
import GameEngine.GameWindow;
import GameEngine.Sprite;

public class AnimatedEnemy extends AnimatedSprite {

	boolean isIdle = false;

	public AnimatedEnemy(int xPos, int yPos, Animation animation) {
		super(xPos, yPos, animation);
		setHasGravity(true);
		setHasPhysics(true);
		setCollidable(true);
	}

	@Override
	public void update() {

		runAnimation(100);
		if (getYPos() > 330){
			isIdle = false;
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

	@Override
	public void doCollision(Sprite otherSprite) {
		
		System.out.println("Let the bodies...");
	
		if (getVelocityUpDown() > 100){
			setAlive(false);
			
		}
			
	}

}

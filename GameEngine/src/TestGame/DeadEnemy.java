package TestGame;

import GameEngine.AnimatedSprite;
import GameEngine.Animation;
import GameEngine.Sprite;

public class DeadEnemy extends AnimatedSprite{

	public DeadEnemy(int xPos, int yPos, Animation animation) {
		super(xPos, yPos, animation);
	}

	@Override
	public void update() {
		if (getAnimation().getCurrentFrame() != 4 && getAnimation().getCurrentRow() != 2)
			runAnimation(300);
	}

	@Override
	public void doCollision(Sprite otherSprite) {
		
	}

}

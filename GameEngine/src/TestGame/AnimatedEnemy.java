package TestGame;

import GameEngine.AnimatedSprite;
import GameEngine.GameWindow;

public class AnimatedEnemy extends AnimatedSprite {

	public AnimatedEnemy(int xPos, int yPos, int frameWidth, int frameHeight, String fileName, int frame, int row) {
		super(xPos, yPos, frameWidth, frameHeight, fileName, frame, row);
	}

	@Override
	public void update() {
		long timeElapsed = System.currentTimeMillis() - GameWindow.getInstance().getStartTime();
		setFrame((int) (timeElapsed/500) % 2);		
	}

	@Override
	public void doCollision() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doCollision() {
		
	}

}

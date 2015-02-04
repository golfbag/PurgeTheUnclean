package TestGame;

import GameEngine.AnimatedSprite;
import GameEngine.GameWindow;

public class AnimatedEnemy extends AnimatedSprite {

	public AnimatedEnemy(int xPos, int yPos, String fileName, int frame, int row) {
		super(xPos, yPos, fileName, frame, row);
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

}

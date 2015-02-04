package TestGame;

import GameEngine.AnimatedSprite;
import GameEngine.GameWindow;

public class AnimatedEnemy extends AnimatedSprite {

	public AnimatedEnemy(int xPos, int yPos, String fileName, int frame, int row) {
		super(xPos, yPos, fileName, frame, row);
	}

	@Override
	public void update() {
		long currentTime = System.currentTimeMillis() - GameWindow.getInstance().getStartTime();
		setFrame((int) (currentTime/500) % 2);		
	}

}

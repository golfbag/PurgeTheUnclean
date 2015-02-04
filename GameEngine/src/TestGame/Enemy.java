package TestGame;

import GameEngine.Sprite;

public class Enemy extends Sprite {

	public Enemy(int xPos, int yPos, String imageID) {
		super(xPos, yPos, imageID);
		setCollidable(true);
		setHasPhysics(true);
	}

	@Override
	public void update() {
		
	}

	@Override
	public void doCollision(Sprite otherSprite) {
		setAlive(false);
	}

}

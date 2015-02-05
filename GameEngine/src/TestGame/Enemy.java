package TestGame;

import GameEngine.ApplicationFramework.Sprite;

public class Enemy extends Sprite {

	public Enemy(int xPos, int yPos, String imageID) {
		super(xPos, yPos, imageID);
		setCollidable(true);
		setHasGravity(true);
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

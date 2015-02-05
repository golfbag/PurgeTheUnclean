package TestGame;

import GameEngine.ApplicationFramework.Sprite;

public class Floor extends Sprite {

	public Floor(int xPos, int yPos, String imageID) {
		super(xPos, yPos, imageID);
		setCollidable(true);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doCollision(Sprite otherSprite) {
		System.out.println("...hit the floor!");
		
	}

}

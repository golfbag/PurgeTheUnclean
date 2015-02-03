package TestGame;


import GameEngine.Sprite;

public class Background extends Sprite {

	public Background(int xPos, int yPos, String imageID) {
		super(xPos, yPos, imageID);
		setCollidable(false);
	}

	@Override
	public void update() {
	
		
	}

}

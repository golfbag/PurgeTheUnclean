package GameEngine;

public abstract class Sprite extends GameObject {
	private boolean hasPhysics;
	private boolean isCollidable;
	
	public Sprite(int xPos, int yPos, String imageID) {
		super(xPos, yPos, imageID);
	}
	
	public abstract void update();
	
	public boolean getHasPhysics(){
		return hasPhysics;
	}
		
	public void setHasPhysics(boolean hasPhysics){
		this.hasPhysics = hasPhysics;
	}

	public boolean isCollidable() {
		return isCollidable;
	}

	public void setCollidable(boolean isCollidable) {
		this.isCollidable = isCollidable;
	}
}

package GameEngine;

public abstract class Sprite extends GameObject {
	private boolean hasPhysics;
	private boolean isCollidable;
	private boolean isAlive;
	
	public Sprite(int xPos, int yPos, String imageID) {
		super(xPos, yPos, imageID);
		isAlive = true;
	}
	
	public abstract void update();
	
	public abstract void doCollision();
	
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

	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
}

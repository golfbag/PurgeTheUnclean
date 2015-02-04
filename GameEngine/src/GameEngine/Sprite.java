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
	
	public void move(int dx, int dy){
		long delta = System.currentTimeMillis() - GameWindow.getInstance().getLastLoopTime();
		setX(getXPos() + (int) ((delta * dx) / 1000));
		setY(getYPos() + (int) ((delta * dy) / 1000));
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

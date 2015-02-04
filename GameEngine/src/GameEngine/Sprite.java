package GameEngine;

public abstract class Sprite extends GameObject {
	private boolean hasPhysics;
	private boolean isCollidable;
	private boolean isAlive;
	private float acceleration = 30f;
	private float velocity = 0.0f;
	public Sprite(int xPos, int yPos, String imageID) {
		super(xPos, yPos, imageID);
		isAlive = true;
	}
	
	public abstract void update();
	
	public abstract void doCollision(Sprite otherSprite);
	
	public boolean getHasPhysics(){
		return hasPhysics;
	}
	
	public void move(int dx, int dy){
		
		long delta = GameWindow.getInstance().getDelta();
		
		if(dx > 0 || dy > 0)
			velocity += (acceleration * delta)/1000;
		else
			velocity -= (acceleration * delta)/1000;
		
		System.out.println(velocity);
		
		if(dx != 0)
			setX(getXPos() + (int) ((0.5 * velocity * delta + dx) / 1000));
		if (dy!= 0)
			setY(getYPos() + (int) ((0.5 * velocity * delta + dy) / 1000));
		
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

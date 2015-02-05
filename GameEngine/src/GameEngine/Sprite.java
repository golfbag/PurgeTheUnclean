package GameEngine;

public abstract class Sprite extends GameObject {
	private boolean hasPhysics;
	private boolean isCollidable;
	private boolean isAlive;
	
	private float acceleration = 30f;
	private float velocityUpDown = 0.0f;
	private float velocityLeftRight = 0.0f;
	
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
		
		if(dx > 0)
			velocityLeftRight += (acceleration * delta + dx)/1000;
		else if (dx < 0)
			velocityLeftRight -= (acceleration * delta +dx)/1000;
		
		else if (dy > 0)
			velocityUpDown += (acceleration * delta + dy)/1000;
		if (dy < 0)
			velocityUpDown -= (acceleration * delta +dy)/1000;
		
		System.out.println("velocity Right Left: " + velocityLeftRight);
		
		System.out.println("velocity Up Down: " + velocityUpDown);
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
	
	public float getVelocityUpDown(){
		return velocityUpDown;
	}
	public void setVelocityUpDown(float velocityUpDown){
		this.velocityUpDown =  velocityUpDown;
	}
	
	public float getVelocityLeftRight(){
		return velocityLeftRight;
	}
	
	
	public float getAcceleration(){
		return acceleration;
	}
}

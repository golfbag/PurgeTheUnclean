package GameEngine;

public abstract class GameObject {
	
	private int xPos;
	private int yPos;
	
	public GameObject(int xPos, int yPos){
		this.xPos = xPos;
		this.yPos = yPos;
	}
	
	public abstract void draw();
	
	public abstract void update();
	
	public int getXPos() {
		return xPos;
	}
	
	public int getYPos() {
		return yPos;
	}
	
	public void setX(int xPos) {
		this.xPos = xPos;	
	}
	
	public void setY(int yPos) {
		this.yPos = yPos;
	}	
}

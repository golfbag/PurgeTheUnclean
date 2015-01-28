package GameEngine;

public abstract class AnimatedSprite extends Sprite {
	private int countFrame;
	private int countRow;

	public AnimatedSprite(int xPos, int yPos, String fileName) {
		super(xPos, yPos, fileName);
	}
	
	public void setFrame(int frame){
		this.countFrame = frame;
	}
	
	public void setRow(int row){
		this.countRow = row;
	}

}

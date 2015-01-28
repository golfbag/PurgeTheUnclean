package GameEngine;

public abstract class AnimatedSprite extends Sprite {
	private int countFrame;
	private int countRow;

	public AnimatedSprite(int xPos, int yPos, String fileName, int frame, int row) {
		super(xPos, yPos, fileName);
		setFrame(frame);
		setRow(row);
	}
	
	public int getFrame(){
		return countFrame;
	}
	
	public int getRow(){
		return countRow;
	}
	
	public void setFrame(int frame){
		this.countFrame = frame;
	}
	
	public void setRow(int row){
		this.countRow = row;
	}

}

package GameEngine;

public class Animation {
	private int currentFrame;
	private int currentRow;
	private int frameWidth;
	private int frameHeight;
	private String fileName;
	private int numberOfRows;
	private int numberOfFrames;

	public Animation(int currentFrame, int currentRow, int frameWidth,
			int frameHeight, String fileName, int numberOfFrames,
			int numberOfRows) {
		this.currentFrame = currentFrame;
		this.currentRow = currentRow;
		this.frameWidth = frameWidth;
		this.frameHeight = frameHeight;
		this.fileName = fileName;
		this.setNumberOfFrames(numberOfFrames);
		this.setNumberOfRows(numberOfRows);
	}

	public int getCurrentFrame() {
		return currentFrame;
	}

	public void setCurrentFrame(int currentFrame) {
		this.currentFrame = currentFrame;
	}

	public int getCurrentRow() {
		return currentRow;
	}

	public void setCurrentRow(int currentRow) {
		this.currentRow = currentRow;
	}

	public int getFrameWidth() {
		return frameWidth;
	}

	public void setFrameWidth(int frameWidth) {
		this.frameWidth = frameWidth;
	}

	public int getFrameHeight() {
		return frameHeight;
	}

	public void setFrameHeight(int frameHeight) {
		this.frameHeight = frameHeight;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public int getNumberOfRows() {
		return numberOfRows;
	}

	public void setNumberOfRows(int numberOfRows) {
		this.numberOfRows = numberOfRows;
	}

	public int getNumberOfFrames() {
		return numberOfFrames;
	}

	public void setNumberOfFrames(int numberOfFrames) {
		this.numberOfFrames = numberOfFrames;
	}
}

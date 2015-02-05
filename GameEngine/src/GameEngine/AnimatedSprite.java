package GameEngine;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public abstract class AnimatedSprite extends Sprite {
	private Animation animation;

	public AnimatedSprite(int xPos, int yPos, Animation animation) {
		super(xPos, yPos, animation.getFileName());
		this.animation = animation;
		setHeight(animation.getFrameHeight());
		setWidth(animation.getFrameWidth());
	}

	@Override
	public void draw(Graphics2D g) {
		BufferedImage currentSprite = Loader
				.getImage(getImageID())
				.getSubimage(
						animation.getFrameWidth() * animation.getCurrentFrame(),
						animation.getFrameHeight()
								* (animation.getCurrentRow() - 1),
						animation.getFrameWidth(), animation.getFrameHeight());
		g.drawImage(currentSprite, getXPos(), getYPos(),
				animation.getFrameWidth(), animation.getFrameHeight(), null);
	}

	public Animation getAnimation() {
		return animation;
	}

	public void setAnimation(Animation animation) {
		this.animation = animation;
		setImageID(animation.getFileName());
		setHeight(animation.getFrameHeight());
		setWidth(animation.getFrameWidth());
	}

	public void runAnimation(int timePerFrame) {
		long timeElapsed = System.currentTimeMillis()
				- GameWindow.getInstance().getStartTime();
		animation.setCurrentFrame((int) (timeElapsed / timePerFrame)
				% animation.getNumberOfFrames());
		if (animation.getCurrentFrame() == animation.getNumberOfFrames() - 1) 
			if (animation.getCurrentRow() == animation.getNumberOfRows()) 
				animation.setCurrentRow(1);
			else
				animation.setCurrentRow(animation.getCurrentRow() + 1);
		
	}
	public void runDeathAnimation(int timePerFrame) {
		long timeElapsed = System.currentTimeMillis()
				- GameWindow.getInstance().getStartTime();
		animation.setCurrentFrame((int) (timeElapsed / timePerFrame)
				% animation.getNumberOfFrames());
		if (animation.getCurrentFrame() == animation.getNumberOfFrames()-1){
			setAlive(false);
		}
	}

}

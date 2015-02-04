package GameEngine;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public abstract class AnimatedSprite extends Sprite {
	private Animation animation;

	public AnimatedSprite(int xPos, int yPos, Animation animation) {
		super(xPos, yPos, animation.getFileName());
		this.animation = animation;
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
	public Animation getAnimation(){
		return animation;
	}
	public void setAnimation(Animation animation){
		this.animation = animation;
	}
	
	public void runAnimation(int timePerFrame, int numberOfFrames ){
		long timeElapsed = System.currentTimeMillis() - GameWindow.getInstance().getStartTime();
		getAnimation().setCurrentFrame((int) (timeElapsed/timePerFrame) % numberOfFrames);
	}
}

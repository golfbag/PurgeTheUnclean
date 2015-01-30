package TestGame;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import GameEngine.Sprite;

public class Enemy extends Sprite {

	Enemy(int xPos, int yPos, String fileName) {
		super(xPos, yPos, fileName);
	}

	public void update() {
	}

	@Override
	public void draw(Graphics2D g) {
		g.drawImage(this.getImage(getFileName()), getXPos(), getYPos(),
				getImage(getFileName()).getWidth(), getImage(getFileName())
						.getHeight(), null);

	}
}

package GameEngine;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import GameEngine.ApplicationFramework.GameWindow;
import GameEngine.ApplicationFramework.Sprite;
import GameEngine.ApplicationFramework.State;

public final class Renderer {
	private static BufferedImage mainImage = new BufferedImage(GameWindow
			.getInstance().getWidth(), GameWindow.getInstance().getHeight(),
			BufferedImage.TYPE_INT_RGB);

	public static BufferedImage render(State state) {
		if (state.getBackgrund() != null){
			Graphics g = mainImage.getGraphics();
			
			g.drawImage(state.getBackgrund().getImage(),state.getBackgrund().getXPos(), state.getBackgrund().getYPos(), state.getBackgrund().getWidth(), state.getBackgrund().getHeight(), null);
		}
		
		for (Sprite sprite : state.getSprites()) {
			Graphics g = mainImage.getGraphics();
			sprite.paintComponent(g);
			//g.drawImage(sprite.getImage(), sprite.getXPos(), sprite.getYPos(), sprite.getWidth(), sprite.getHeight(), null);
		}
		
		return mainImage;
	}
}

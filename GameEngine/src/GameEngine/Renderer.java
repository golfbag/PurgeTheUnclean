package GameEngine;

import java.awt.Graphics;
import java.awt.Graphics2D;

public final class Renderer {
	
	public static void render(State state, Graphics g){
		if (state.getBackgrund()!= null)
			state.getBackgrund().draw((Graphics2D) g);
		for(Sprite sprite : state.getSprites()){
			sprite.draw((Graphics2D) g);
		}
	}
}

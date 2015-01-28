package GameEngine;

import java.util.ArrayList;

public class Renderer {
	ArrayList<Sprite> sprites;
	
	public Renderer(State state){
		sprites = state.getSprites();
	}
	
	public void render(){
		for(Sprite sprite : sprites){
			sprite.draw();
		}
	}
}

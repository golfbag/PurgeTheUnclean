package GameEngine;

import java.io.Serializable;
import java.util.ArrayList;

public class State implements Serializable {
	private ArrayList<Sprite> sprites = new ArrayList<>();

	public ArrayList<Sprite> getSprites() {
		return sprites;
	}
	public void addSprite(Sprite sprite){
		sprites.add(sprite);
	}
}

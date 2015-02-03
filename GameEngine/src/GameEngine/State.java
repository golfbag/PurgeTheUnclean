package GameEngine;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class State implements Serializable {
	private ArrayList<Sprite> sprites = new ArrayList<>();

	public ArrayList<Sprite> getSprites() {
		return sprites;
	}
	
	public void addSprite(Sprite sprite){
		sprites.add(sprite);
	}
	
	public void removeSprite(Sprite sprite){
		sprites.remove(sprite);
	}
}

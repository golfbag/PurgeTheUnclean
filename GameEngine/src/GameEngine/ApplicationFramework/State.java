package GameEngine.ApplicationFramework;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class State implements Serializable {
	private ArrayList<Sprite> sprites = new ArrayList<>();
	private GameObject background;
	
	public State(GameObject backgrund){
		this.setBackgrund(backgrund);
	}
	
	public ArrayList<Sprite> getSprites() {
		return sprites;
	}

	public void addSprite(Sprite sprite) {
		sprites.add(sprite);
	}

	public void removeSprite(Sprite sprite) {
		sprites.remove(sprite);
	}

	public GameObject getBackgrund() {
		return background;
	}

	public void setBackgrund(GameObject background) {
		this.background = background;
	}
}

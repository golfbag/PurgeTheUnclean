package GameEngine.ApplicationFramework;

import java.io.Serializable;
import java.util.ArrayList;

public class State implements Serializable {
	
	private static final long serialVersionUID = -7700837087887282089L;
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

package GameEngine;

import java.io.Serializable;
import java.util.ArrayList;

public class State implements Serializable {
	ArrayList<Sprite> sprites;

	public ArrayList<Sprite> getSprites() {
		return sprites;
	}

}

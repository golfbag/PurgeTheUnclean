package TestGame;

import java.net.MalformedURLException;
import java.net.URL;

import GameEngine.*;

public class TheGame {

	public static void main(String[] args) {
		GameWindow game = new GameWindow("Test", 640, 480);
		try {
			Loader.loadSound("helicopter",  new URL("file:///C:/Users/Administrator/Downloads/soundscrate-helicopter.wav"));
			Loader.loadSound("rocket",  new URL("file:///C:/Users/Administrator/Downloads/soundscrate-rocket.wav"));
			SoundEngine.loopSound("helicopter");
			SoundEngine.playSound("rocket");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}

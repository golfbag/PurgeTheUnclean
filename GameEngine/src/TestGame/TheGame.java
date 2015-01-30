package TestGame;

import java.net.MalformedURLException;
import java.net.URL;

import GameEngine.*;

public class TheGame {

	public static void main(String[] args) {
		GameWindow game = new GameWindow("Test", 640, 480);
		try {
			Loader.loadSound("test",  new URL("file:///C:/Users/Administrator/Desktop/Kalimba.wav"));
			SoundEngine.playSound("test");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}

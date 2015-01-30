package TestGame;

import java.net.MalformedURLException;
import java.net.URL;

import GameEngine.*;

public class TheGame {

	public static void main(String[] args) {
		GameWindow game = new GameWindow("Test", 640, 480);
		String url = "file:///C:/Users/Administrator/Desktop/Kalimba.mp3";
		try {
			Loader.loadSound("test",  new URL(url));
			SoundEngine.playSound("test");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

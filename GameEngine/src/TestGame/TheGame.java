package TestGame;

import java.net.MalformedURLException;
import java.net.URL;

import GameEngine.*;

public class TheGame {

	public static void main(String[] args) {
		GameWindow.createInstance("Test", 640, 480, 400);

		
		Loader.loadImage("bakgrund", "C:/Users/Fabian/Pictures/bakgrund.jpg");
		Background bakgrund = new Background(0,0, "bakgrund");
		GameWindow.getInstance().getGameState().addSprite(bakgrund);
		
		Loader.loadImage("alien", "C:/Users/Fabian/Pictures/alien.png");
		Enemy fiende = new Enemy(20, 50, "alien");
		GameWindow.getInstance().getGameState().addSprite(fiende);
		
		
		try {
			Loader.loadSound(
					"helicopter",
					new URL(
							"file:///C:/Users/Fabian/Documents/GitHub/PurgeTheUnclean/GameEngine/src/TestGame/Sounds/soundscrate-helicopter.wav"));
			Loader.loadSound(
					"rocket",
					new URL(
							"file:///C:/Users/Administrator/Documents/PurgeTheUnclean/GameEngine/src/TestGame/Sounds/soundscrate-rocket.wav"));
			SoundEngine.loopSound("helicopter");
			SoundEngine.loopSound("rocket");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		GameWindow.getInstance().run();
		
		
	}

}

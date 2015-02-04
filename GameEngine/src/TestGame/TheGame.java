package TestGame;

import java.net.MalformedURLException;
import java.net.URL;

import GameEngine.*;

public class TheGame {

	public static void main(String[] args) {
		Loader.loadImage("bakgrund", "C:/Users/Fabian/Pictures/bakgrund.jpg");
		Background bakgrund = new Background(0, 0, "bakgrund");
		
		GameWindow.createInstance("Test", 640, 480, bakgrund, 400);
		
		Loader.loadImage("alien", "C:/Users/Fabian/Pictures/alien2.png");
		Player player = new Player(20, 50, "alien");
		GameWindow.getInstance().getGameState().addSprite(player);
		Enemy fiende = new Enemy(200, 100, "alien");
		GameWindow.getInstance().getGameState().addSprite(fiende);
		
		Loader.loadImage("fågel", "C:/Users/Fabian/Pictures/fågel.png");
		AnimatedEnemy fiende2 = new AnimatedEnemy(100, 100, "fågel", 0, 0);
		GameWindow.getInstance().getGameState().addSprite(fiende2);
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

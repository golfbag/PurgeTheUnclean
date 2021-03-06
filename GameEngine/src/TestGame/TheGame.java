package TestGame;

import GameEngine.*;

import java.net.MalformedURLException;
import java.net.URL;

import GameEngine.ApplicationFramework.Animation;
import GameEngine.ApplicationFramework.GameWindow;

public class TheGame {

	public static void main(String[] args) {
		Loader.loadImage("bakgrund", "C:/Users/Fabian/Pictures/bakgrund2.png");
		Background bakgrund = new Background(0, 50, "bakgrund");

		GameWindow.createInstance("Test", 640, 480, bakgrund, 340, 30f);
		
		Loader.loadImage("mark", "C:/Users/Fabian/Pictures/mark2.png");
		Floor mark = new Floor(10, 400, "mark");
		
		
		Loader.loadImage("alien", "C:/Users/Fabian/Pictures/alien2.png");
		Player player = new Player(20, 50, "alien");
		GameWindow.getInstance().getGameState().addSprite(player);
		Enemy fiende = new Enemy(200, 100, "alien");
		GameWindow.getInstance().getGameState().addSprite(fiende);

		Loader.loadImage("f�gel2", "C:/Users/Fabian/Pictures/f�gel4.png");
		Animation animation = new Animation(1, 1, 73, 67, "f�gel2", 5, 2);
		AnimatedEnemy fiende2 = new AnimatedEnemy(100, 100, animation);
		GameWindow.getInstance().getGameState().addSprite(fiende2);
		
		GameWindow.getInstance().getGameState().addSprite(mark);
		
		
		Loader.loadImage("boom", "C:/Users/Fabian/Pictures/BOOMLONG.png");
//		Animation animation2 = new Animation(1, 1, 69, 67, "boom", 5, 2);
//		DeadEnemy fiende3 = new DeadEnemy(200, 100, animation2);
//		GameWindow.getInstance().getGameState().addSprite(fiende3);
		
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

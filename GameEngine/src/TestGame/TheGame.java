package TestGame;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JPanel;

import GameEngine.*;

public class TheGame {

	public static void main(String[] args) {
		GameWindow game = GameWindow.getInstance("Test", 640, 480);
		
		Loader.loadImage("bakgrund", "C:/Users/Fabian/Pictures/bakgrund.jpg");
		Background bakgrund = new Background(0,0, "bakgrund");
		game.getGameState().addSprite(bakgrund);
		
		Loader.loadImage("alien", "C:/Users/Fabian/Pictures/alien.png");
		Enemy fiende = new Enemy(20, 50, "alien");
		game.getGameState().addSprite(fiende);
		
		
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
		
		game.run();
		
		
	}

}

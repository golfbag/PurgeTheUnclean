package TestGame;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JPanel;

import GameEngine.*;

public class TheGame {

	public static void main(String[] args) {
		GameWindow game = new GameWindow("Test", 640, 480);

		Loader.loadImage("alien", "C:/Users/Fabian/Pictures/alien.png");
		State firstLvl = new State();
		Enemy fiende = new Enemy(20, 50, "alien");
		firstLvl.addSprite(fiende);

		GamePanel ritYta = new GamePanel(firstLvl);
		game.add(ritYta);
		String url = "file:///C:/Users/Administrator/Desktop/Kalimba.mp3";

		try {
			Loader.loadSound(
					"helicopter",
					new URL(
							"file:///C:/Users/Administrator/Documents/PurgeTheUnclean/GameEngine/src/TestGame/Sounds/soundscrate-helicopter.wav"));
			Loader.loadSound(
					"rocket",
					new URL(
							"file:///C:/Users/Administrator/Documents/PurgeTheUnclean/GameEngine/src/TestGame/Sounds/soundscrate-rocket.wav"));
			SoundEngine.loopSound("helicopter");
			SoundEngine.playSound("rocket");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}

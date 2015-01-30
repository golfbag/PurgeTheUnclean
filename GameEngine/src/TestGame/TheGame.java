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
		Enemy fiende = new Enemy(20,50,"alien");
		firstLvl.addSprite(fiende);
		
		
		RitYta ritYta = new RitYta(firstLvl);
		game.add(ritYta);
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

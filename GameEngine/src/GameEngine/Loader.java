package GameEngine;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;

import javax.imageio.ImageIO;

//Static class
public final class Loader {
	private static HashMap<String, BufferedImage> imageMap = new HashMap<>();
	private static HashMap<String, Sound> soundMap = new HashMap<>();
	
	private Loader(){}
	
	public static void loadImage(String name, String filePath){
		try {
		    imageMap.put(name, ImageIO.read(new File(filePath)));
		} catch (IOException e) {
			System.out.println("Failed to load image!");
		}
	}
	
	public static void loadSound(String name, URL filePath){
		try {
		    soundMap.put(name, new Sound(filePath));
		} catch (Exception e) {
			System.out.println("Failed to load sound!");
		}
	}
	
	public static BufferedImage getImage(String name){
		return imageMap.get(name);
	}
	
	public static Sound getSound(String name){
		return soundMap.get(name);
	}
}

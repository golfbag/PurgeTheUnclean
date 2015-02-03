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
	
	public static void loadImage(String imageID, String filePath){
		try {
		    imageMap.put(imageID, ImageIO.read(new File(filePath)));
		} catch (IOException e) {
			System.out.println("Failed to load image!");
		}
	}
	
	public static void loadSound(String soundID, URL filePath){
		try {
		    soundMap.put(soundID, new Sound(filePath));
		} catch (Exception e) {
			System.out.println("Failed to load sound!");
		}
	}
	
	public static BufferedImage getImage(String imageID){
		return imageMap.get(imageID);
	}
	
	public static Sound getSound(String soundID){
		return soundMap.get(soundID);
	}
}

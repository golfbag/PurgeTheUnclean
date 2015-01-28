package GameEngine;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import javax.imageio.ImageIO;

public class Loader {
	private HashMap<String, BufferedImage> imageMap = new HashMap<>();
	
	public void loadImage(String name, String filePath){
		try {
		    imageMap.put(name, ImageIO.read(new File(filePath)));
		} catch (IOException e) {
		}
	}
}

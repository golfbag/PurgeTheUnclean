package GameEngine;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Loader {
	public BufferedImage loadImage(String filePath){
		try {
		    return ImageIO.read(new File(filePath));
		} catch (IOException e) {
			return null;
		}
	}
	
//	public String loadSound(String filePath){
//		
//	}
}

package GameEngine;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

//Static class
public final class SoundEngine {
	
	private SoundEngine(){}
	
	public static void playSound(String name){
		Loader.getSound(name).play();
	}
}

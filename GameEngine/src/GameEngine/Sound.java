package GameEngine;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

public class Sound {
	public AudioClip sound;
	
	public Sound (URL url){
		sound = Applet.newAudioClip(url);
	}

	public void play() {
		sound.play();		
	}

	public void loop() {
		sound.loop();
	}

	public void stop() {
		sound.stop();		
	}
}

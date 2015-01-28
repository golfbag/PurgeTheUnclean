package GameEngine;

public final class SoundEngine {
	
	public static void playSound(String name){
		Loader.getSound(name).play();
	}
}

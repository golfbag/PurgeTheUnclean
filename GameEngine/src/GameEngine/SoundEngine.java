package GameEngine;

//Static class
public final class SoundEngine {
	
	private SoundEngine(){}
	
	public static void playSound(String name){
		Loader.getSound(name).play();
	}
}

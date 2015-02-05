package GameEngine;


//Static class
public final class SoundEngine {
	
	private SoundEngine(){}
	
	public static void playSound(String name){
		Loader.getSound(name).play();
	}
	
	public static void loopSound(String name){
		Loader.getSound(name).loop();
	}
	
	public static void stopSound(String name){
		Loader.getSound(name).stop();
	}
}

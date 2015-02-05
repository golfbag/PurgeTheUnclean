package GameEngine;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener{

	private boolean keys[] = new boolean[65536];
	
	@Override
	public void keyPressed(KeyEvent e) {
		int keycode = e.getKeyCode();
		keys[keycode] = true;
	}

	@Override
	public void keyReleased(KeyEvent e) {
		int keycode = e.getKeyCode();
		keys[keycode] = false;
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	public boolean isKey(int keyNumber){
		 return keys[keyNumber];
	}
}

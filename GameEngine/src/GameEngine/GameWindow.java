package GameEngine;

import javax.swing.JFrame;

public class GameWindow extends JFrame {
	GameWindow(String windowName, int width, int height){
		super(windowName);
		setSize(width, height);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}

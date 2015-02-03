package GameEngine;

import java.awt.Graphics;

import javax.swing.JPanel;

public class GamePanel extends JPanel {
	State state;
	
	public GamePanel(State state){
		this.state = state;
	}
	
	@Override
 	public void paint(Graphics g){
		g.clearRect(0, 0, GameWindow.getWindowWidth(), GameWindow.getWindowHeight());
		Renderer.render(state, g);
 		repaint();
 	}

}

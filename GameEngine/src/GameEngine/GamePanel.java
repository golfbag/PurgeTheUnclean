package GameEngine;

import java.awt.Graphics;

import javax.swing.JPanel;

public class GamePanel extends JPanel {
	State state;
	
	public GamePanel(State state){
		this.state = state;
	}
	
	@Override
 	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Renderer.render(state, g);
 	}

}

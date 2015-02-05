package GameEngine.ApplicationFramework;

import java.awt.Graphics;

import javax.swing.JPanel;

import GameEngine.Renderer;

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

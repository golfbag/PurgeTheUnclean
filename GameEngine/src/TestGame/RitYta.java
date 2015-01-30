package TestGame;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import GameEngine.Renderer;
import GameEngine.State;

public class RitYta extends JPanel{
	State state;
	RitYta(State state){
		this.state = state;
	}
	@Override
 	public void paint(Graphics g){
		Renderer.render(state, g);
 		repaint();
 	}
}
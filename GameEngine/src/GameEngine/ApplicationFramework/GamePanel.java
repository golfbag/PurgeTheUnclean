package GameEngine.ApplicationFramework;

import GameEngine.Renderer;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class GamePanel extends JPanel {
	private static final long serialVersionUID = -6125289169775816072L;
	State state;
	
	public GamePanel(State state){
		this.state = state;
	}
	
	@Override
 	public void paintComponent(Graphics g){
		super.paintComponent(g);
		BufferedImage mainImage = Renderer.render(state);
		g.drawImage(mainImage, 0, 0, null);
		mainImage.getGraphics().clearRect(0, 0, GameWindow.getInstance().getWidth(), GameWindow.getInstance().getHeight());
 	}

}

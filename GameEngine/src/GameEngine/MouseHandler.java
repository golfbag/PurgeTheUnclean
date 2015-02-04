package GameEngine;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseHandler implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent mve) {
		System.out.println(mve);
	}

	@Override
	public void mouseEntered(MouseEvent mve) {
		System.out.println(mve);
		
	}

	@Override
	public void mouseExited(MouseEvent mve) {
		System.out.println(mve);
		
	}

	@Override
	public void mousePressed(MouseEvent mve) {
		System.out.println(mve);
		
	}

	@Override
	public void mouseReleased(MouseEvent mve) {
		System.out.println(mve);
		
	}

}

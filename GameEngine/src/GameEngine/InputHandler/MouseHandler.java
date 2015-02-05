package GameEngine.InputHandler;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseHandler implements MouseListener{
	private boolean mouseEvents[] = new boolean[65536];
	@Override
	public void mouseClicked(MouseEvent mve) {
		mouseEvents[MouseEvent.MOUSE_CLICKED] = true;
		
	}

	@Override
	public void mouseEntered(MouseEvent mve) {
		mouseEvents[MouseEvent.MOUSE_ENTERED] = true;
		
	}

	@Override
	public void mouseExited(MouseEvent mve) {
		mouseEvents[MouseEvent.MOUSE_ENTERED] = false;
		
	}

	@Override
	public void mousePressed(MouseEvent mve) {
		mouseEvents[MouseEvent.MOUSE_PRESSED] = true;
		
	}

	@Override
	public void mouseReleased(MouseEvent mve) {
		mouseEvents[MouseEvent.MOUSE_PRESSED] = false;
		
	}
	public boolean isKey(int mouseEventNumber){
		 return mouseEvents[mouseEventNumber];
	}

}

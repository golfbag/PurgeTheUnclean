package TestGame;

import java.awt.event.KeyEvent;

import GameEngine.AnimatedSprite;
import GameEngine.Animation;
import GameEngine.GameWindow;

public class AnimatedEnemy extends AnimatedSprite {

	public AnimatedEnemy(int xPos, int yPos, Animation animation) {
		super(xPos, yPos, animation);
	}

	@Override
	public void update() {
		
		runAnimation(100, 5);
		
		if (GameWindow.getInstance().getInputHandler().isKey(KeyEvent.VK_W)){
			if (getAnimation().getCurrentRow() != 2)
				getAnimation().setCurrentRow(2);
			setY(getYPos() - 10);
		}
			
		if (GameWindow.getInstance().getInputHandler().isKey(KeyEvent.VK_S))
			setY(getYPos() + 8);
		
		if (GameWindow.getInstance().getInputHandler().isKey(KeyEvent.VK_A)){
			if (getAnimation().getCurrentRow() != 1)
				getAnimation().setCurrentRow(1);;
			setX(getXPos() - 8);
		}
			
		if (GameWindow.getInstance().getInputHandler().isKey(KeyEvent.VK_D)){
			if (getAnimation().getCurrentRow() != 1)
				getAnimation().setCurrentRow(1);
			setX(getXPos() + 8);
		}
			
		
	}

	@Override
	public void doCollision() {
		// TODO Auto-generated method stub
		
	}


}

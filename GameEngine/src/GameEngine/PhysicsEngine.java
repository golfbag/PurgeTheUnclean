package GameEngine;

import java.awt.Rectangle;

public class PhysicsEngine {

	private int zeroPoint;
	private int gravity;

	public PhysicsEngine(int zeroPoint, int gravity) {
		this.zeroPoint = zeroPoint;
		this.gravity = gravity;
	}

	public void doGravity(Sprite sprite) {
		if (sprite.getYPos() >= zeroPoint)
			sprite.setY(zeroPoint);
		else
			sprite.setY(sprite.getYPos() + gravity);
	}

	public boolean checkCollision(Sprite sprite1, Sprite sprite2) {
		if (sprite1.isCollidable() && sprite2.isCollidable()){
			Rectangle rectangle = new Rectangle(sprite1.getXPos(),
					sprite1.getYPos(), sprite1.getWidth(), sprite1.getHeight());
			Rectangle rectangle2 = new Rectangle(sprite2.getXPos(),
					sprite2.getYPos(), sprite2.getWidth(), sprite2.getHeight());
			return rectangle.getBounds().intersects(rectangle2.getBounds());
		}else
			return false;
	}

	public int getZeroPoint() {
		return zeroPoint;
	}

	public void setZeroPoint(int zeroPoint) {
		this.zeroPoint = zeroPoint;
	}

	public int getGravity() {
		return gravity;
	}

	public void setGravity(int gravity) {
		this.gravity = gravity;
	}

}

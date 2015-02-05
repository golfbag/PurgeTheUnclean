package GameEngine;

import java.awt.Rectangle;

public class PhysicsEngine {

	private int zeroPoint;
	private float gravity = -0.0f;
	private float velocity = 0.0f;
	private float maxVelocity = 200;

	public PhysicsEngine(int zeroPoint, float gravity) {
		this.zeroPoint = zeroPoint;
		this.gravity = gravity;
	}

	public void doGravity(Sprite sprite) {
		if (sprite.getYPos() >= zeroPoint)
			sprite.setY(zeroPoint);

		long delta = GameWindow.getInstance().getDelta();

		if (sprite.getVelocityUpDown() <= maxVelocity)
			sprite.setVelocityUpDown(sprite.getVelocityUpDown()
					+ (gravity * delta) / 1000);
		sprite.setY(sprite.getYPos()
				+ (int) (0.5 * sprite.getVelocityUpDown() * delta) / 1000);

	}

	public void doPhysics(Sprite sprite) {

		long delta = GameWindow.getInstance().getDelta();

		if (sprite.getVelocityLeftRight() != 0)

			sprite.setX(sprite.getXPos()
					+ (int) ((0.5 * sprite.getVelocityLeftRight() * delta) / 1000));
		if (sprite.getVelocityUpDown() != 0)
			sprite.setY(sprite.getYPos()
					+ (int) ((0.5 * sprite.getVelocityUpDown() * delta) / 1000));

	}

	public boolean checkCollision(Sprite sprite1, Sprite sprite2) {
		if (sprite1.isCollidable() && sprite2.isCollidable()) {
			Rectangle rectangle1 = new Rectangle(sprite1.getXPos(),
					sprite1.getYPos(), sprite1.getWidth(), sprite1.getHeight());
			Rectangle rectangle2 = new Rectangle(sprite2.getXPos(),
					sprite2.getYPos(), sprite2.getWidth(), sprite2.getHeight());
			
			return rectangle1.getBounds().intersects(rectangle2.getBounds());
		} else
			return false;
	}

	public void doCollision(Sprite sprite) {
		for (Sprite sprite2 : GameWindow.getInstance().getGameState()
				.getSprites()) {
			if (sprite != sprite2 && sprite2.isCollidable()) {
				if (checkCollision(sprite, sprite2))
					sprite.doCollision(sprite2);
			}
		}
	}

	public int getZeroPoint() {
		return zeroPoint;
	}

	public void setZeroPoint(int zeroPoint) {
		this.zeroPoint = zeroPoint;
	}

	public float getGravity() {
		return gravity;
	}

	public void setGravity(int gravity) {
		this.gravity = gravity;
	}

	public float getMaxVelocity() {
		return maxVelocity;
	}

	public void setMaxVelocity(float maxVelocity) {
		this.maxVelocity = maxVelocity;
	}

}

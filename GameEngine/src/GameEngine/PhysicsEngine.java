package GameEngine;

public class PhysicsEngine {
	
	private int zeroPoint;
	
	public void doGravity(Sprite sprite){
		if(sprite.getYPos() >= zeroPoint)
			sprite.setY(zeroPoint);
		else
			sprite.setY(sprite.getYPos() + 6);		
	}

	public int getZeroPoint() {
		return zeroPoint;
	}

	public void setZeroPoint(int zeroPoint) {
		this.zeroPoint = zeroPoint;
	}

}

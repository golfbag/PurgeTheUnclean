package GameEngine;

public class PhysicsEngine {
	
	private int zero;
	
	public void doGravity(Sprite sprite){
		if(sprite.getYPos() >= zero)
			sprite.setY(zero);
		else
			sprite.setY(sprite.getYPos() + 6);
			
	}

	public int getZero() {
		return zero;
	}

	public void setZero(int zero) {
		this.zero = zero;
	}

}

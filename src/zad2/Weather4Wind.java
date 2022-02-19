package zad2;

public class Weather4Wind {

	private float speed;
	private float deg;
	public Weather4Wind(float speed, float deg) {
		super();
		this.speed = speed;
		this.deg = deg;
	}
	public float getSpeed() {
		return speed;
	}
	public void setSpeed(float speed) {
		this.speed = speed;
	}
	public float getDeg() {
		return deg;
	}
	public void setDeg(float deg) {
		this.deg = deg;
	}
	public Weather4Wind() {
		super();
		this.speed = 0f;
		this.deg = 0f;
	}
	
}

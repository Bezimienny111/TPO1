package zad2;

public class Weather6Rain {

	private double _1h;
	private double _3h;
	public double get_1h() {
		return _1h;
	}
	public void set_1h(double _1h) {
		this._1h = _1h;
	}
	public double get_3h() {
		return _3h;
	}
	public void set_3h(double _3h) {
		this._3h = _3h;
	}
	public Weather6Rain(double _1h, double _3h) {
		super();
		this._1h = _1h;
		this._3h = _3h;
	}
	public Weather6Rain() {
		super();
		this._1h = 0.00;
		this._3h = 0.00;
	}
	
}

package zad2;

public class Weather1Coord  {

	private float lon;
	private float lat;
	public float getLon() {
		return lon;
	}

	public void setLon(float lon) {
		this.lon = lon;
	}

	public float getLan() {
		return lat;
	}

	public void setLan(float lan) {
		this.lat = lan;
	}


	
	public Weather1Coord() {
		super();
		this.lon=0f;
		this.lat=0f;
	}
		

	public Weather1Coord(float a,float b) {
		this.lon=a;
		this.lat=b;
	}



	
}

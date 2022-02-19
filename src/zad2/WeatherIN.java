package zad2;

import java.util.ArrayList;

public class WeatherIN {

	private Weather1Coord coord;
	private ArrayList<Weather2Weather> weather = new ArrayList<Weather2Weather>();
	private String base;
	private Weather3Main main;
	private int visibility;
	private Weather4Wind wind;
	private Weather5Clouds clouds;
	private Weather6Rain rain;
	private Weather7snow snow;
	private int dt;
	private sys sys;
	private int timezone;
	private int id;
	private String name;
	private int cod;
	
	
	
	
	public WeatherIN() {
		super();
		this.coord = new Weather1Coord();
		this.base = " ";
		this.main = new Weather3Main();
		this.visibility = 0;
		this.wind = new Weather4Wind();
		this.clouds = new Weather5Clouds();
		this.rain = new Weather6Rain();
		this.snow = new Weather7snow();
		this.dt = 0;
		this.sys = sys;
		this.timezone = 0;
		this.id = 0;
		this.name = " ";
		this.cod = 0;
		
		
		
	}
	
	public WeatherIN(Weather1Coord coord, ArrayList<Weather2Weather> weather, String base, Weather3Main main,
			int visibility, Weather4Wind wind, Weather5Clouds clouds, Weather6Rain rain, Weather7snow snow, int dt,
			zad2.sys sys, int timezone, int id, String name, int cod) {
		super();
		this.coord = coord;
		this.weather = weather;
		this.base = base;
		this.main = main;
		this.visibility = visibility;
		this.wind = wind;
		this.clouds = clouds;
		this.rain = rain;
		this.snow = snow;
		this.dt = dt;
		this.sys = sys;
		this.timezone = timezone;
		this.id = id;
		this.name = name;
		this.cod = cod;
	}

	public Weather1Coord getCoordOne() {
		return coord;
	}
	public void setCoordOne(Weather1Coord coordOne) {
		this.coord = coordOne;
	}
	public ArrayList<Weather2Weather> getWeather() {
		return weather;
	}
	
	
	
	
	public void setWeather(ArrayList weather) {
		this.weather = weather;
	}

	public Weather3Main getMainOne() {
		return main;
	}
	public void setMainOne(Weather3Main mainOne) {
		this.main = mainOne;
	}
	public int getVisibility() {
		return visibility;
	}
	public void setVisibility(int visibility) {
		this.visibility = visibility;
	}
	public Weather4Wind getWindOne() {
		return wind;
	}
	public void setWindOne(Weather4Wind windOne) {
		this.wind = windOne;
	}
	public Weather5Clouds getCloudsOne() {
		return clouds;
	}
	public void setCloudsOne(Weather5Clouds cloudsOne) {
		this.clouds = cloudsOne;
	}
	public int getDt() {
		return dt;
	}
	public void setDt(int dt) {
		this.dt = dt;
	}
	public sys getSysOne() {
		return sys;
	}
	public void setSysOne(sys sysOne) {
		this.sys = sysOne;
	}
	public int getTimezone() {
		return timezone;
	}
	public void setTimezone(int timezone) {
		this.timezone = timezone;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	
}

/**
 *
 *  @author Kowalski Robert S18290
 *
 */

package zad2;

import java.awt.EventQueue;
import java.io.IOException;
import java.util.ArrayList;

import com.badlogic.gdx.utils.Json;



public class Main {
	
	
  public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchFieldException, SecurityException {
	  
	//  float calv = 273.15f;
    Service s = new Service("Poland");
    String weatherJson = s.getWeather("Warsaw");
    Double rate1 = s.getRateFor("USD");
    Double rate2 = s.getNBPRate();
    // ...
    // część uruchamiająca GUI
 //   WeatherIN test[] = new WeatherIN[1];
 //   test[0] = new WeatherIN();
 //   Json json = new Json();
 //   json.setElementType(WeatherIN.class, "weather", Weather2Weather.class);
 //   json.setIgnoreUnknownFields(true);
  //  test[0] = json.fromJson(WeatherIN.class, weatherJson);
    
    
 ///  ArrayList<weather> test2 = new ArrayList<weather>();
  //  test2.add(new weather(5,"aa","vv","dd"));
    
 //  WeatherIN test = new WeatherIN(new coord(45f,55f), test2, "dadada", new main2(55f,54f,45f,68f,46f,55f), 0, new wind(43f,78f), new clouds(5), 0, new sys(5,458,"PL",4654,454), 0, 0, weatherJson, 0);
    
   //  json.setElementType(WeatherIN.class, "weather", weather.class);
  //   System.out.println();
 //   System.out.println();
  //   System.out.println();
  //   System.out.println(json.prettyPrint(test));
    
  //  System.out.println(test[0].getCoordOne().getLan());
  //  System.out.println( weatherJson);
    
    
     
    
    EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				AppInt window = new AppInt();
			//	window.getSetButton().addActionListener(arg0);
				window.frame.setVisible(true);
			
			//	window.getCityName().setText(test[0].getName());
			//	window.getDetailField().setText(test[0].getWeather().get(0).getDescription());
			//	window.getDescField().setText(test[0].getWeather().get(0).getMain());
			//	window.getPressField().setText(Float.toString(test[0].getMainOne().getPressure()));
			//	window.getTempfield().setText(Float.toString(test[0].getMainOne().getTemp()-calv));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});
}
}
    
  


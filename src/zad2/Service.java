/**
 *
 *  @author Kowalski Robert S18290
 *
 */

package zad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

import com.badlogic.gdx.utils.Json;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Service {
	String country;
	
	
	static StringBuffer sb;
	static Json json = new Json();	
	public Map<String,String> currency = new HashMap<String, String>();
	public Map<String,String> coutryTag = new HashMap<String, String>();
	public String getCountryTag;
	
	
	
	public static String city;
	public String desc;
	public String details; 
	public String pressure;
	public double temp;
	public String tag;
	public HashMap<String,String> rates =  new HashMap<String,String>();
	
	
	public String codeToCurrency = "";
	
	

	public Service(String kraj) {
	this.country = kraj;
	this.city="";
	this.desc="";
	this.details="";
	this.pressure="";
	
	this.temp=0.00;
	this.tag ="";
	
	coutryTag.put("Afghanistan","AF");
	coutryTag.put("Åland Islands","AX");
	coutryTag.put("Albania","AL");
	coutryTag.put("Algeria","DZ");
	coutryTag.put("American Samoa","AS");
	coutryTag.put("Andorra","AD");
	coutryTag.put("Angola","AO");
	coutryTag.put("Anguilla","AI");
	coutryTag.put("Antarctica","AQ");
	coutryTag.put("Antigua and Barbuda","AG");
	coutryTag.put("Argentina","AR");
	coutryTag.put("Armenia","AM");
	coutryTag.put("Aruba","AW");
	coutryTag.put("Australia","AU");
	coutryTag.put("Austria","AT");
	coutryTag.put("Azerbaijan","AZ");
	coutryTag.put("Bahrain","BH");
	coutryTag.put("Bahamas","BS");
	coutryTag.put("Bangladesh","BD");
	coutryTag.put("Barbados","BB");
	coutryTag.put("Belarus","BY");
	coutryTag.put("Belgium","BE");
	coutryTag.put("Belize","BZ");
	coutryTag.put("Benin","BJ");
	coutryTag.put("Bermuda","BM");
	coutryTag.put("Bhutan","BT");
	coutryTag.put("Bolivia, Plurinational State of","BO");
	coutryTag.put("Bonaire, Sint Eustatius and Saba","BQ");
	coutryTag.put("Bosnia and Herzegovina","BA");
	coutryTag.put("Botswana","BW");
	coutryTag.put("Bouvet Island","BV");
	coutryTag.put("Brazil","BR");
	coutryTag.put("British Indian Ocean Territory","IO");
	coutryTag.put("Brunei Darussalam","BN");
	coutryTag.put("Bulgaria","BG");
	coutryTag.put("Burkina Faso","BF");
	coutryTag.put("Burundi","BI");
	coutryTag.put("Cambodia","KH");
	coutryTag.put("Cameroon","CM");
	coutryTag.put("Canada","CA");
	coutryTag.put("Cape Verde","CV");
	coutryTag.put("Cayman Islands","KY");
	coutryTag.put("Central African Republic","CF");
	coutryTag.put("Chad","TD");
	coutryTag.put("Chile","CL");
	coutryTag.put("China","CN");
	coutryTag.put("Christmas Island","CX");
	coutryTag.put("Cocos (Keeling) Islands","CC");
	coutryTag.put("Colombia","CO");
	coutryTag.put("Comoros","KM");
	coutryTag.put("Congo","CG");
	coutryTag.put("Congo, the Democratic Republic of the","CD");
	coutryTag.put("Cook Islands","CK");
	coutryTag.put("Costa Rica","CR");
	coutryTag.put("Côte d'Ivoire","CI");
	coutryTag.put("Croatia","HR");
	coutryTag.put("Cuba","CU");
	coutryTag.put("Curaçao","CW");
	coutryTag.put("Cyprus","CY");
	coutryTag.put("Czech Republic","CZ");
	coutryTag.put("Denmark","DK");
	coutryTag.put("Djibouti","DJ");
	coutryTag.put("Dominica","DM");
	coutryTag.put("Dominican Republic","DO");
	coutryTag.put("Ecuador","EC");
	coutryTag.put("Egypt","EG");
	coutryTag.put("El Salvador","SV");
	coutryTag.put("Equatorial Guinea","GQ");
	coutryTag.put("Eritrea","ER");
	coutryTag.put("Estonia","EE");
	coutryTag.put("Ethiopia","ET");
	coutryTag.put("Falkland Islands (Malvinas)","FK");
	coutryTag.put("Faroe Islands","FO");
	coutryTag.put("Fiji","FJ");
	coutryTag.put("Finland","FI");
	coutryTag.put("France","FR");
	coutryTag.put("French Guiana","GF");
	coutryTag.put("French Polynesia","PF");
	coutryTag.put("French Southern Territories","TF");
	coutryTag.put("Gabon","GA");
	coutryTag.put("Gambia","GM");
	coutryTag.put("Georgia","GE");
	coutryTag.put("Germany","DE");
	coutryTag.put("Ghana","GH");
	coutryTag.put("Gibraltar","GI");
	coutryTag.put("Greece","GR");
	coutryTag.put("Greenland","GL");
	coutryTag.put("Grenada","GD");
	coutryTag.put("Guadeloupe","GP");
	coutryTag.put("Guam","GU");
	coutryTag.put("Guatemala","GT");
	coutryTag.put("Guernsey","GG");
	coutryTag.put("Guinea","GN");
	coutryTag.put("Guinea-Bissau","GW");
	coutryTag.put("Guyana","GY");
	coutryTag.put("Haiti","HT");
	coutryTag.put("Heard Island and McDonald Islands","HM");
	coutryTag.put("Holy See (Vatican City State)","VA");
	coutryTag.put("Honduras","HN");
	coutryTag.put("Hong Kong","HK");
	coutryTag.put("Hungary","HU");
	coutryTag.put("Iceland","IS");
	coutryTag.put("India","IN");
	coutryTag.put("Indonesia","ID");
	coutryTag.put("Iran, Islamic Republic of","IR");
	coutryTag.put("Iraq","IQ");
	coutryTag.put("Ireland","IE");
	coutryTag.put("Isle of Man","IM");
	coutryTag.put("Israel","IL");
	coutryTag.put("Italy","IT");
	coutryTag.put("Jamaica","JM");
	coutryTag.put("Japan","JP");
	coutryTag.put("Jersey","JE");
	coutryTag.put("Jordan","JO");
	coutryTag.put("Kazakhstan","KZ");
	coutryTag.put("Kenya","KE");
	coutryTag.put("Kiribati","KI");
	coutryTag.put("Korea, Democratic People's Republic of","KP");
	coutryTag.put("Korea, Republic of","KR");
	coutryTag.put("Kuwait","KW");
	coutryTag.put("Kyrgyzstan","KG");
	coutryTag.put("Lao People's Democratic Republic","LA");
	coutryTag.put("Latvia","LV");
	coutryTag.put("Lebanon","LB");
	coutryTag.put("Lesotho","LS");
	coutryTag.put("Liberia","LR");
	coutryTag.put("Libya","LY");
	coutryTag.put("Liechtenstein","LI");
	coutryTag.put("Lithuania","LT");
	coutryTag.put("Luxembourg","LU");
	coutryTag.put("Macao","MO");
	coutryTag.put("Macedonia, the Former Yugoslav Republic of","MK");
	coutryTag.put("Madagascar","MG");
	coutryTag.put("Malawi","MW");
	coutryTag.put("Malaysia","MY");
	coutryTag.put("Maldives","MV");
	coutryTag.put("Mali","ML");
	coutryTag.put("Malta","MT");
	coutryTag.put("Marshall Islands","MH");
	coutryTag.put("Martinique","MQ");
	coutryTag.put("Mauritania","MR");
	coutryTag.put("Mauritius","MU");
	coutryTag.put("Mayotte","YT");
	coutryTag.put("Mexico","MX");
	coutryTag.put("Micronesia, Federated States of","FM");
	coutryTag.put("Moldova, Republic of","MD");
	coutryTag.put("Monaco","MC");
	coutryTag.put("Mongolia","MN");
	coutryTag.put("Montenegro","ME");
	coutryTag.put("Montserrat","MS");
	coutryTag.put("Morocco","MA");
	coutryTag.put("Mozambique","MZ");
	coutryTag.put("Myanmar","MM");
	coutryTag.put("Namibia","NA");
	coutryTag.put("Nauru","NR");
	coutryTag.put("Nepal","NP");
	coutryTag.put("Netherlands","NL");
	coutryTag.put("New Caledonia","NC");
	coutryTag.put("New Zealand","NZ");
	coutryTag.put("Nicaragua","NI");
	coutryTag.put("Niger","NE");
	coutryTag.put("Nigeria","NG");
	coutryTag.put("Niue","NU");
	coutryTag.put("Norfolk Island","NF");
	coutryTag.put("Northern Mariana Islands","MP");
	coutryTag.put("Norway","NO");
	coutryTag.put("Oman","OM");
	coutryTag.put("Pakistan","PK");
	coutryTag.put("Palau","PW");
	coutryTag.put("Palestine, State of","PS");
	coutryTag.put("Panama","PA");
	coutryTag.put("Papua New Guinea","PG");
	coutryTag.put("Paraguay","PY");
	coutryTag.put("Peru","PE");
	coutryTag.put("Philippines","PH");
	coutryTag.put("Pitcairn","PN");
	coutryTag.put("Poland","PL");
	coutryTag.put("Portugal","PT");
	coutryTag.put("Puerto Rico","PR");
	coutryTag.put("Qatar","QA");
	coutryTag.put("Réunion","RE");
	coutryTag.put("Romania","RO");
	coutryTag.put("Russian Federation","RU");
	coutryTag.put("Rwanda","RW");
	coutryTag.put("Saint Barthélemy","BL");
	coutryTag.put("Saint Helena, Ascension and Tristan da Cunha","SH");
	coutryTag.put("Saint Kitts and Nevis","KN");
	coutryTag.put("Saint Lucia","LC");
	coutryTag.put("Saint Martin (French part)","MF");
	coutryTag.put("Saint Pierre and Miquelon","PM");
	coutryTag.put("Saint Vincent and the Grenadines","VC");
	coutryTag.put("Samoa","WS");
	coutryTag.put("San Marino","SM");
	coutryTag.put("Sao Tome and Principe","ST");
	coutryTag.put("Saudi Arabia","SA");
	coutryTag.put("Senegal","SN");
	coutryTag.put("Serbia","RS");
	coutryTag.put("Seychelles","SC");
	coutryTag.put("Sierra Leone","SL");
	coutryTag.put("Singapore","SG");
	coutryTag.put("Sint Maarten (Dutch part)","SX");
	coutryTag.put("Slovakia","SK");
	coutryTag.put("Slovenia","SI");
	coutryTag.put("Solomon Islands","SB");
	coutryTag.put("Somalia","SO");
	coutryTag.put("South Africa","ZA");
	coutryTag.put("South Georgia and the South Sandwich Islands","GS");
	coutryTag.put("South Sudan","SS");
	coutryTag.put("Spain","ES");
	coutryTag.put("Sri Lanka","LK");
	coutryTag.put("Sudan","SD");
	coutryTag.put("Suriname","SR");
	coutryTag.put("Svalbard and Jan Mayen","SJ");
	coutryTag.put("Swaziland","SZ");
	coutryTag.put("Sweden","SE");
	coutryTag.put("Switzerland","CH");
	coutryTag.put("Syrian Arab Republic","SY");
	coutryTag.put("Taiwan, Province of China","TW");
	coutryTag.put("Tajikistan","TJ");
	coutryTag.put("Tanzania, United Republic of","TZ");
	coutryTag.put("Thailand","TH");
	coutryTag.put("Timor-Leste","TL");
	coutryTag.put("Togo","TG");
	coutryTag.put("Tokelau","TK");
	coutryTag.put("Tonga","TO");
	coutryTag.put("Trinidad and Tobago","TT");
	coutryTag.put("Tunisia","TN");
	coutryTag.put("Turkey","TR");
	coutryTag.put("Turkmenistan","TM");
	coutryTag.put("Turks and Caicos Islands","TC");
	coutryTag.put("Tuvalu","TV");
	coutryTag.put("Uganda","UG");
	coutryTag.put("Ukraine","UA");
	coutryTag.put("United Arab Emirates","AE");
	coutryTag.put("United Kingdom","GB");
	coutryTag.put("United States","US");
	coutryTag.put("United States Minor Outlying Islands","UM");
	coutryTag.put("Uruguay","UY");
	coutryTag.put("Uzbekistan","UZ");
	coutryTag.put("Vanuatu","VU");
	coutryTag.put("Venezuela, Bolivarian Republic of","VE");
	coutryTag.put("Viet Nam","VN");
	coutryTag.put("Virgin Islands, British","VG");
	coutryTag.put("Virgin Islands, U.S.","VI");
	coutryTag.put("Wallis and Futuna","WF");
	coutryTag.put("Western Sahara","EH");
	coutryTag.put("Yemen","YE");
	coutryTag.put("Zambia","ZM");
	coutryTag.put("Zimbabwe","ZW");

	
	currency.put("Afghanistan", "AFN");
	currency.put("Albania", "ALL");
	currency.put("Algeria", "DZD");
	currency.put("Andorra", "EUR");
	currency.put("Angola", "AOA");
	currency.put("Antigua and Barbuda", "XCD");
	currency.put("Argentina", "ARS");
	currency.put("Armenia", "AMD");
	currency.put("Australia", "AUD");
	currency.put("Austria", "EUR");
	currency.put("Azerbaijan", "AZN");
	currency.put("Bahamas", "BSD");
	currency.put("Bahrain", "BHD");
	currency.put("Bangladesh", "BDT");
	currency.put("Barbados", "BBD");
	currency.put("Belarus", "BYN");
	currency.put("Belgium", "EUR");
	currency.put("Belize", "BZD");
	currency.put("Benin", "XOF");
	currency.put("Bhutan", "BTN");
	currency.put("Bolivia", "BOB");
	currency.put("Bosnia and Herzegovina", "BAM");
	currency.put("Botswana", "BWP");
	currency.put("Brazil", "BRL");
	currency.put("Brunei", "BND");
	currency.put("Bulgaria", "BGN");
	currency.put("Burkina Faso", "XOF");
	currency.put("Burundi", "BIF");
	currency.put("Cambodia", "KHR");
	currency.put("Cameroon", "XAF");
	currency.put("Canada", "CAD");
	currency.put("Cape Verde", "CVE");
	currency.put("Central African Republic", "XAF");
	currency.put("Chad", "XAF");
	currency.put("Chile", "CLP");
	currency.put("China", "CNY");
	currency.put("Colombia", "COP");
	currency.put("Comoros", "KMF");
	currency.put("Costa Rica", "CRC");
	currency.put("Croatia", "HRK");
	currency.put("Cuba", "CUP");
	currency.put("Cyprus", "EUR");
	currency.put("Czech Republic", "CZK");
	currency.put("Democratic Republic of Congo", "CDF");
	currency.put("Denmark", "DKK");
	currency.put("Djibouti", "DJF");
	currency.put("Dominica", "XCD");
	currency.put("Dominican Republic", "DOP");
	currency.put("East Timor", "USD");
	currency.put("Ecuador", "USD");
	currency.put("Egypt", "EGP");
	currency.put("El Salvador", "USD");
	currency.put("Equatorial Guinea", "XAF");
	currency.put("Eritrea", "ERN");
	currency.put("Estonia", "EUR");
	currency.put("Ethiopia", "ETB");
	currency.put("Fiji", "FJD");
	currency.put("Finland", "EUR");
	currency.put("France", "EUR");
	currency.put("Gabon", "XAF");
	currency.put("Gambia", "GMD");
	currency.put("Georgia", "GEL");
	currency.put("Germany", "EUR");
	currency.put("Ghana", "GHS");
	currency.put("Greece", "EUR");
	currency.put("Grenada", "XCD");
	currency.put("Guatemala", "GTQ");
	currency.put("Guinea", "GNF");
	currency.put("Guinea-Bissau", "XOF");
	currency.put("Guyana", "GYD");
	currency.put("Haiti", "HTG");
	currency.put("Honduras", "HNL");
	currency.put("Hungary", "HUF");
	currency.put("Iceland", "ISK");
	currency.put("India", "INR");
	currency.put("Indonesia", "IDR");
	currency.put("Iran", "IRR");
	currency.put("Iraq", "IQD");
	currency.put("Ireland", "EUR");
	currency.put("Israel", "ILS");
	currency.put("Italy", "EUR");
	currency.put("Ivory Coast", "XOF");
	currency.put("Jamaica", "JMD");
	currency.put("Japan", "JPY");
	currency.put("Jordan", "JOD");
	currency.put("Kazakhstan", "KZT");
	currency.put("Kenya", "KES");
	currency.put("Kiribati", "AUD");
	currency.put("Korea, North", "KPW");
	currency.put("Korea, South", "KRW");
	currency.put("Kosovo", "EUR");
	currency.put("Kuwait", "KWD");
	currency.put("Kyrgyzstan", "KGS");
	currency.put("Laos", "LAK");
	currency.put("Latvia", "EUR");
	currency.put("Lebanon", "LBP");
	currency.put("Lesotho", "LSL");
	currency.put("Liberia", "LRD");
	currency.put("Libya", "LYD");
	currency.put("Liechtenstein", "CHF");
	currency.put("Lithuania", "EUR");
	currency.put("Luxembourg", "EUR");
	currency.put("Macedonia", "MKD");
	currency.put("Madagascar", "MGA");
	currency.put("Malawi", "MWK");
	currency.put("Malaysia", "MYR");
	currency.put("Maldives", "MVR");
	currency.put("Mali", "XOF");
	currency.put("Malta", "EUR");
	currency.put("Marshall Islands", "USD");
	currency.put("Mauritania", "MRO");
	currency.put("Mauritius", "MUR");
	currency.put("Mexico", "MXN");
	currency.put("Micronesia", "USD");
	currency.put("Moldova", "MDL");
	currency.put("Monaco", "EUR");
	currency.put("Mongolia", "MNT");
	currency.put("Montenegro", "EUR");
	currency.put("Morocco", "MAD");
	currency.put("Mozambique", "MZN");
	currency.put("Myanmar", "MMK");
	currency.put("Namibia", "NAD");
	currency.put("Nauru", "AUD");
	currency.put("Nepal", "NPR");
	currency.put("Netherlands", "EUR");
	currency.put("New Zealand", "NZD");
	currency.put("Nicaragua", "NIO");
	currency.put("Niger", "XOF");
	currency.put("Nigeria", "NGN");
	currency.put("Norway", "NOK");
	currency.put("Oman", "OMR");
	currency.put("Pakistan", "PKR");
	currency.put("Palau", "USD");
	currency.put("Palestine", "ILS");
	currency.put("Panama", "PAB");
	currency.put("Papua New Guinea", "PGK");
	currency.put("Paraguay", "PYG");
	currency.put("Peru", "PEN");
	currency.put("Philippines", "PHP");
	currency.put("Poland", "PLN");
	currency.put("Portugal", "EUR");
	currency.put("Qatar", "QAR");
	currency.put("Republic of the Congo", "XAF");
	currency.put("Romania", "RON");
	currency.put("Russia", "RUB");
	currency.put("Rwanda", "RWF");
	currency.put("Saint Kitts and Nevis", "XCD");
	currency.put("Saint Lucia", "XCD");
	currency.put("Saint Vincent and the Grenadines", "XCD");
	currency.put("Samoa", "WST");
	currency.put("San Marino", "EUR");
	currency.put("São Tomé and Príncipe", "STD");
	currency.put("Saudi Arabia", "SAR");
	currency.put("Senegal", "XOF");
	currency.put("Serbia", "RSD");
	currency.put("Seychelles", "SCR");
	currency.put("Sierra Leone", "SLL");
	currency.put("Singapore", "SGD");
	currency.put("Slovakia", "EUR");
	currency.put("Slovenia", "EUR");
	currency.put("Solomon Islands", "SBD");
	currency.put("Somalia", "SOS");
	currency.put("South Africa", "ZAR");
	currency.put("South Sudan", "SSP");
	currency.put("Spain", "EUR");
	currency.put("Sri Lanka", "LKR");
	currency.put("Sudan", "SDG");
	currency.put("Suriname", "SRD");
	currency.put("Swaziland", "SZL");
	currency.put("Sweden", "SEK");
	currency.put("Switzerland", "CHF");
	currency.put("Syria", "SYP");
	currency.put("Taiwan", "TWD");
	currency.put("Tajikistan", "TJS");
	currency.put("Tanzania", "TZS");
	currency.put("Thailand", "THB");
	currency.put("Togo", "XOF");
	currency.put("Tonga", "TOP");
	currency.put("Trinidad and Tobago", "TTD");
	currency.put("Tunisia", "TND");
	currency.put("Turkey", "TRY");
	currency.put("Turkmenistan", "TMT");
	currency.put("Tuvalu", "AUD");
	currency.put("Uganda", "UGX");
	currency.put("Ukraine", "UAH");
	currency.put("United Arab Emirates", "AED");
	currency.put("United Kingdom", "GBP");
	currency.put("United States", "USD");
	currency.put("Uruguay", "UYU");
	currency.put("Uzbekistan", "UZS");
	currency.put("Vanuatu", "VUV");
	currency.put("Vatican City", "EUR");
	currency.put("Venezuela", "VEF");
	currency.put("Vietnam", "VND");
	currency.put("Yemen", "YER");
	currency.put("Zambia", "ZMW");
	currency.put("Zimbabwe", "USD");

	codeToCurrency = currency.get(country);
	getCountryTag = coutryTag.get(country);

//	System.out.println(codeToCurrency);
	}






	public static String weather(URL urlWeather) throws ClassNotFoundException, NoSuchFieldException, SecurityException {

		URLConnection uRLConn;
		sb = null;
		try {
			uRLConn = urlWeather.openConnection();
			uRLConn.connect();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(uRLConn.getInputStream()));

			sb = new StringBuffer();
            String line;

            while ((line = br.readLine()) != null) {
            	sb.append(line);
            }
        } catch (IOException e) {
        }
		
		//if (sb==null) 
		//System.out.println(" nuuul");
		if (sb!=null) 
		{
			jsonRead(json.prettyPrint(sb.toString()));
		//	System.out.println(json.prettyPrint(sb.toString()));
		return json.prettyPrint(sb.toString());
		}
	
		return "error";
	}



	public static void jsonRead(String jsonString) throws ClassNotFoundException, NoSuchFieldException, SecurityException {
		if (jsonString == null)
			return;
		
	//	json.
		
	//	Object weaterTest = json.fromJson(Object.class, jsonString);
		
		
	//	System.out.println(weaterTest);
		
		
		
	}


	public String getWeather(String string) throws IOException, ClassNotFoundException, NoSuchFieldException, SecurityException, NullPointerException{
		URL url = new URL("http://api.openweathermap.org/data/2.5/weather?q=" + string +"," + getCountryTag + "&appid=b40acafe3f622ee14372e7c58955de3a");
		//System.out.print(weather(url));
		//System.out.println();
		//System.out.println();
		
		return weather(url);
	}
	
	
	
	
		
	Double getNBPRate() throws MalformedURLException, ClassNotFoundException, NoSuchFieldException, SecurityException  {
	/*	URL url = new URL("http://www.nbp.pl/kursy/kursya.html");
		
		Pattern p1 = Pattern.compile("<td.*?>(\\\\d+?)"+currency +"</td><td.*?>(.+?)</td>");
		Matcher matcher1;
		URLConnection uRLConn;
		sb = null;
		try {
			uRLConn = url.openConnection();
			uRLConn.connect();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(uRLConn.getInputStream()));

			sb = new StringBuffer();
            String line;

           while ((line = br.readLine()) != null) {
            	sb.append(line.trim());
            	System.out.println((sb.toString()));
            	if (!sb.equals(null)) {
            	 matcher1 = p1.matcher((sb.toString()));
            	
            	System.out.println((sb.toString()));
            	}
           }
        } catch (IOException e) {
        }
	
		if ((sb!=(null))) 
		{
			jsonRead((sb.toString()));
			
		System.out.print((sb.toString()));
		}
		
		
		URL url = new URL("http://www.nbp.pl/kursy/kursya.html");
		URLConnection uRLConn;
		sb = null;
		try {
			uRLConn = url.openConnection();
			uRLConn.connect();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(uRLConn.getInputStream()));

			sb = new StringBuffer();
            String line;

            while ((line = br.readLine()) != null) {
            	sb.append(line);
            }
		   } catch (IOException e) {
	        }
		
			if ((sb!=(null))) 
			{
				jsonRead((sb.toString()));
				
			System.out.print((sb.toString()));
			}
		
		*/
		
		
		
		
		
		
		
		return 0.0;

		

		
		
	}






	public Double getRateFor(String string) throws MalformedURLException, ClassNotFoundException, NoSuchFieldException, SecurityException {
		URL url = new URL("https://api.exchangeratesapi.io/latest?base=" + string);
		URLConnection uRLConn;
		sb = null;
	//	boolean eur = false;
		try {
			uRLConn = url.openConnection();
			uRLConn.connect();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(uRLConn.getInputStream()));

			sb = new StringBuffer();
            String line;

            while ((line = br.readLine()) != null) {
            	sb.append(line);
            }
		  } catch (IOException e) {
	        }
            if (!(sb==null)) 
            {
    			//jsonRead(json.prettyPrint(sb.toString()));
    			
    		//	json.setElementType(getClass(), "rates", getClass());
    			json.setIgnoreUnknownFields(true);
    			Service test = json.fromJson(Service.class, sb.toString());
    			
    			//System.out.println(	test.rates.get(codeToCurrency));
    	//	System.out.println(json.prettyPrint(sb.toString()));
    		//	System.out.println(	json.toJson(sb));
    		//	System.out.println(test.rates.get(codeToCurrency));
    		//	System.out.println(string);
    			if (test.rates.get(codeToCurrency) == null && string.equals("EUR")) 
    				return 1.0;
    		//		eur = true;
    		
    			
    			if (test.rates.get(codeToCurrency) != null) 
    			return Double.valueOf(test.rates.get(codeToCurrency));}
    		
            
	//	System.out.println(eur);
		
		// String result = getStringFromUrl("https://api.exchangeratesapi.io/latest?base=" + string);
		return 0.0;
	}






	public Service() {
		super();
	}
	


				
				
				

	
	
	
}


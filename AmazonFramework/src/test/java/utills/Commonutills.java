package utills;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.aventstack.extentreports.configuration.Config;

public class Commonutills {

	public  void loadProperties() {
		
		Properties property=new Properties();;
		try {

			property.load(getClass().getResourceAsStream("/config.properties"));
			//property.load(getClass().getResourceAsStream("/log4j2.properties"));
		} catch (Exception e) {
			
			e.printStackTrace();
		}
				property.getProperty("url");
				property.getProperty("browser");
				property.getProperty("phonenumber");
				property.getProperty("password");
				property.getProperty("Chrome_driver_location");
	}
}

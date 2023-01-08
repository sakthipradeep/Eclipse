package Commonstepdefination;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import constants.Constants;

public class CommonUtils {


	public static void   loadProperties() {
		FileReader reader=null;
		try {
			reader=new FileReader("config.propertise");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();


			Properties propertise=new Properties();
			try {
				propertise.load(reader);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();

				Constants.APP_URL=propertise.getProperty("APP_URL");
				Constants.BROWSER=propertise.getProperty("BROWSER");
				Constants.userName=propertise.getProperty("UserName");
				Constants.password=propertise.getProperty("Password");
				Constants.CHROME_DRIVER_LOCATION=propertise.getProperty("CHROME_DRIVER_LOCATION");
				//Constants.CHROME_DRIVER=propertise.getProperty(null)


			}
		}


	}

}

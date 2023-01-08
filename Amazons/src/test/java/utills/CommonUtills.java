package utills;

import java.io.IOException;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import Objects.ShoppingObjects;
import constants.CommonConstants;
import drivers.DriverManager;


public class CommonUtills {

	public  void loadProperties() {
	
	 Properties properties=new Properties();
	 try {
		properties.load(getClass().getResourceAsStream("/config.properties"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	CommonConstants.url= properties.getProperty("url");
	CommonConstants.browser= properties.getProperty("browser");
	CommonConstants.Chrome_driver_location= properties.getProperty("Chrome_driver_location");
	CommonConstants.Firefox_driver_location= properties.getProperty("Firefox_driver_location");
   CommonConstants.product1= properties.getProperty("product1");
   CommonConstants.product2= properties.getProperty("product2");
   CommonConstants.product3= properties.getProperty("product3");
   CommonConstants.size=properties.getProperty("1");
   CommonConstants.size2=properties.getProperty("3");
   CommonConstants.color1=properties.getProperty("green");
   CommonConstants.color1=properties.getProperty("yellow");
   CommonConstants.quantity2=properties.getProperty("quantity2");
   CommonConstants.email=properties.getProperty("email");
   CommonConstants.firstname=properties.getProperty("firstname");
   CommonConstants.lastname=properties.getProperty("lastname");
   CommonConstants.address1=properties.getProperty("address1");
   CommonConstants.address2=properties.getProperty("address2");
   CommonConstants.city=properties.getProperty("city");
  // CommonConstants.city=properties.getProperty("city");

   


	}
	
	//using Pagefactory
	public void initWebelements() { 
		PageFactory.initElements(DriverManager.getDriver(),ShoppingObjects.class);
		
		
		
		
	}
}

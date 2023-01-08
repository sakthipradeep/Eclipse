package learn;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			//public static ChromeDriver;

			driver.get("https://www.google.com/aclk?sa=l&ai=DChcSEwibv_vO9Zv7AhXikmYCHf7DAO4YABAAGgJzbQ&sig=AOD64_2pfUSI7YJtVXFy-djb3-xSpprxcw&q&adurl&ved=2ahUKEwiv9fDO9Zv7AhXTUGwGHehQBrEQ0Qx6BAgHEAE");
			//driver.manage().window().maximize();
		}	

	}



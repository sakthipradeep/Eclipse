package flipkartautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//pSexFpig=AOD64_3Jcd=2ahUKEwi31d3AmKv7AhWjT3wKHcoXBgwQ0Qx6BAgIEAE");
		//driver.get(l);
		driver.get("http://testleaf.herokuapp.com/");
		WebElement button = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[2]/a"));
		button.click();
		WebElement findElement = driver.findElement(By.id("position"));
		Point pointer=findElement.getLocation();
		int xvalue=pointer.getX();
		System.out.println(xvalue);
		
		/*
		 * Point point=button.getLocation(); System.out.println(point); Dimension
		 * hheight=button.getSize(); System.out.println(hheight);
		 *///*[@id="position"]
		/*
		 * //*[@class='_2IX_2- VJZDxU'] field2://*[@class='_2IX_2- _3mctLh VJZDxU']
		 * button2://*[@class='_2KpZ6l _2HKlqd _3AWRsL']
		 */		
	}

}

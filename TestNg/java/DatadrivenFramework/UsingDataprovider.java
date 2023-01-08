/*Data driven framework in this package we driven data from excell  also we use 2d arrys to 
driven it.*/

package DatadrivenFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

// in this class we drive data from user by using @Data provider and 2D arry 
public class UsingDataprovider {
	 public static void main (String []args) {
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	WebElement username = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
	username.sendKeys("sakthipradeep555@gmail.com");
	WebElement password = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
	password.sendKeys("6382150895");
	WebElement button = driver.findElement(By.className("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
	button.click();
	
	
	/*
	 * WebElement findElement = driver.findElement(By.linkText("Login")); String
	 * text = findElement.getText(); System.out.println(text); findElement.click();
	 */
	
	
	}
}
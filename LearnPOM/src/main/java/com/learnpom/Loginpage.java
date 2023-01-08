package com.learnpom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pagefactory.UIobjectspage;

public class Loginpage {

	public static void main(String[] args) {
	
WebDriverManager.chromedriver().setup();
		  ChromeDriver driver=new ChromeDriver();
		  driver.get("https://www.flipkart.com/");
		  
		  UIobjectspage.userName(driver).sendKeys("6382150895");
		  UIobjectspage.password(driver).sendKeys("sakthi555");
		 UIobjectspage.loginbutton(driver).click();
		 /*
		 * WebElement email= driver.findElement(By.xpath(
		 * "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
		 * email.sendKeys("6382150895"); WebElement password=driver.findElement(By.
		 * xpath("	/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input\r\n")
		 * ); password.sendKeys("sakthi555"); WebElement
		 * button=driver.findElement(By.xpath(
		 * "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button"));
		 * button.click();
		

		
		 * UIobjectspage.userName(driver).sendKeys("6382150895");
		 * UIobjectspage.password(driver).sendKeys("sakthi555");
		 * UIobjectspage.loginbutton(driver)*/
		 
	}

}
//html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input*/
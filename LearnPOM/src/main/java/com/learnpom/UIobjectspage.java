package com.learnpom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.learnpom.Loginpage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UIobjectspage  {
	
	
static public WebElement userName(ChromeDriver driver) {
	return driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
}
static public WebElement password(ChromeDriver driver) {
	return driver.findElement(By.xpath("	/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input\r\n"));
}
static public WebElement loginbutton(ChromeDriver driver) {
	return driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button"));
}}

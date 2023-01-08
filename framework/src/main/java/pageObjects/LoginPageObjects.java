package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjects {
@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")
	public static WebElement username;
@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")
	public static WebElement password;
@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")
	public static WebElement button;

	
	/*
	 * public static WebElement username(WebDriver driver) { return
	 * driver.findElement(By.xpath("//*[@id='nav-link-accountList-nav-line-1']")); }
	 * public static WebElement password(WebDriver driver) { return
	 * driver.findElement(By.xpath("//*[@id=\"ap_email\"]")); } public static
	 * WebElement button(WebDriver driver) { return
	 * driver.findElement(By.id("continue"));
	 * 
	 * } public static WebElement password1(WebDriver driver) { return
	 * driver.findElement(By.xpath("//input[@type='password']"));
	 * 
	 * } public static WebElement button1(WebDriver driver) { return
	 * driver.findElement(By.xpath("//input[@id='signInSubmit']\\r\\n"));
	 * 
	 * }/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input
	 */
}//input[@type='password']
package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageFactory2 {
	
	@FindBy(xpath ="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")
public static WebElement username;
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input\\r\\n")
public static WebElement password;
	@FindBy(xpath ="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")
public static WebElement button;
}



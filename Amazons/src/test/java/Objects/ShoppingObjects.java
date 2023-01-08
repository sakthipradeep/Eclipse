package Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class ShoppingObjects {

	@FindBy(id="search")
	public static WebElement searchbar;
	
	@FindBy(xpath ="//button[@class='action search']")
	public static WebElement maginfier;
	
	//gwyn endurance tee medium green:
	
	@FindBy(xpath="//Strong[@class='product name product-item-name']/child::a")
	public static WebElement selectproductone;
	
	@FindBy(xpath="//div[text()='M']")
	public static WebElement sizeone;

	@FindBy(xpath="//div[text()='M']/following::div[6]")
	public static WebElement colorone;
	
	@FindBy(xpath ="//span[text()='Add to Cart']")
	public static WebElement addtocart;

	//mycart
	
	@FindBy(linkText ="shopping cart")
	public static WebElement checkcarttotal;
	
	//edit quantity
	@FindBy(xpath   ="//a[@class='action action-edit']")
	public static WebElement edit;
	
	//update quantity
	@FindBy(xpath ="//input[@name='qty']")
	public static WebElement adquantity;
	
	@FindBy(xpath="//button[@class='action primary tocart']")
	public static WebElement updatecart;
//-----------------------------------------------
	
	
	//gwyn endurance tee samll yellow:
	
	/*
	 * @FindBy(id="searchr") public static WebElement searchbarr;
	 */
	
	
	@FindBy(linkText ="Quest Lumaflex™ Band")
    public static WebElement selectproductTwo;
	
	
	@FindBy(id="option-label-size-143-item-167")
	public static WebElement sizeTwo;

	@FindBy(id="option-label-color-93-item-60")
	public static WebElement colorTwo;

	//Quest Lumaflex™ Band
	
	/*
	 * @FindBy(id="searchrr") public static WebElement searchbarrr;
	 */
	
	@FindBy(linkText ="Quest Lumaflex™ Band ")
	 public static WebElement selectproductThree;

	// My cart
	@FindBy(xpath="//span[text()='My Cart']")
	 public static WebElement Mycart;
	 
	 // checkcart
	@FindBy(xpath ="//strong[text()='Order Total']/following::span")
	 public static WebElement Checkcart;
	 
	 //proceesed to checkout:
	@FindBy(xpath = "//button[@class='action primary checkout']/child::span")
	 public static WebElement checkout;
	 
	 //email
	@FindBy(xpath ="//div[@class='control _with-tooltip']/child::input")
	 public static WebElement email;
	 
	 //fname
	@FindBy(name ="firstname" )
	 public static WebElement fname;
	 
	 //lname
	@FindBy(name ="lastname" )
	 public static WebElement lname;
	 
	 //street
	@FindBy(name ="street[0]" )
	 public static WebElement street0;
	 
	@FindBy(name ="street[1]" )
	 public static WebElement street1;
	
	@FindBy(name ="street[2]" )
	 public static WebElement street2;
	 
	 //city
	@FindBy(name ="city" )
	 public static WebElement city;
	 
	 
	 //state
	@FindBy(xpath  = "//select[@class='select']")
	 public static WebElement state;
	 
	 //postalcode
	@FindBy(name = "postcode")
	 public static WebElement postalcode;
	 
	 //country
	@FindBy(xpath ="//input[@class='input-text']/following::select[2]")
	 public static WebElement country;
	 
	 //phonenumber
	@FindBy(name="telephone")
	 public static WebElement phonenumber;
	 
	 // radi0 button selct fixed
	@FindBy(xpath="//td[text()='Fixed']")
	 public static WebElement radio;
	 
	 // next button
	@FindBy(xpath = "//span[text()='Next']")
	 public static WebElement button;
	
}

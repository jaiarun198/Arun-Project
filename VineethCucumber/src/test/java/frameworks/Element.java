package frameworks;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Element {
	
	@FindBy(xpath ="//a[@class='login']" )
	public static WebElement signin ;
	

	@FindBy(id ="email" )
	public static WebElement username ;
	
	@FindBy(id ="passwd" )
	public static WebElement password ;
	
	@FindBy(name ="SubmitLogin" )
	public static WebElement login ;
	

	@FindBy(xpath ="(//a[@title='T-shirts'])[2]" )
	public static WebElement tshirt ;
	
	@FindBy(xpath ="(//a[@title='Faded Short Sleeve T-shirts'])[2]" )
	public static WebElement item ;
	

	@FindBy(xpath ="//span[text()='Add to cart']" )
	public static WebElement addtocart ;
	
	@FindBy(xpath ="//a[@title='Proceed to checkout']" )
	public static WebElement proceed ;
	
	@FindBy(xpath ="(//a[@title='Proceed to checkout'])[2]" )
	public static WebElement proced ;
	
	@FindBy(name="processAddress" )
	public static WebElement procedadd ;
	
	@FindBy(name ="cgv" )
	public static WebElement checkbox ;
	

	@FindBy(name ="processCarrier" )
	public static WebElement procedcr ;
	
	@FindBy(xpath ="//a[@class='cheque']" )
	public static WebElement cheque ;
	
	@FindBy(xpath ="//span[text()='I confirm my order']" )
	public static WebElement order ;
	
	@FindBy(xpath ="//span[text()=' Payment']" )
	public static WebElement payment ;
	
}


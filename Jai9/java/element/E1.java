package element;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class E1 {

	@FindBy( xpath ="//a[@class='login']")
	public static WebElement signin ;
	
	@FindBy(id ="email" )
	public static WebElement username ;
	
	@FindBy(id ="passwd" )
	public static WebElement password ;
	
	@FindBy(id ="SubmitLogin" )
	public static WebElement login ;
	
	
}

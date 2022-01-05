package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

	public class Applic extends T1{
	
	private static WebElement username;

	public static void main(String[] args) throws InterruptedException {
		
		getdriver("chrome");
		String url ="https://www.facebook.com/";

		max();		
		PageFactory.initElements(driver, T1.class);
		
		sk(username,"arunrock006@gamil.com");
		sk(password,"jai@6622");
		click(login);
		
	}
	}

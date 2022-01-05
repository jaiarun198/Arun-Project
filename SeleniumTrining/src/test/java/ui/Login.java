package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login{
	
public static String browser = "Firefox";
public static WebDriver driver;
public static ChromeDriver driver1;

public static void main (String[] args) {
	

	if(browser.equals("Firefox")) {
		WebDriverManager.firefoxdriver().setup();
	     driver = new FirefoxDriver();
		}
		else if (browser.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
	
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
}}
//	
//	WebDriverManager.chromedriver().setup();
//	
//	DesiredCapabilities dc=new DesiredCapabilities();
//	dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
//	dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, false);
//	
//
//	ChromeOptions co=new ChromeOptions();
//	co.merge(dc);
//	
//	
//	WebDriver driver = new ChromeDriver(co);
//	driver.get("https://expired.badssl.com/");
//	
//	}


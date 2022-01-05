package frameworks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;
public class Baseclass extends Element  {

	    public static WebDriver driver;
	
	    public static String url = "http://automationpractice.com/index.php/";
	    public static void getdriver(String prop) {
		if (prop.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jai\\eclipse-workspace\\fb lgin method\\Drivers\\chromedriver.exe");			
		driver = new ChromeDriver();
	    }
		else  {
		System.out.println("check browser");
		}
	    }
		public static void geturl (String s) {
		driver.get(s);
		}
		public static void max() {
		driver.manage().window().maximize();
		}
		public static void clicks(WebElement element) {
			element.click();
		}
		
		public static void sk(WebElement element , String s ) { 
		element.sendKeys(s);
		}
		
		@SuppressWarnings("deprecation")
		public static void explicitwait(WebElement element) {
			 WebDriverWait wait = new WebDriverWait(driver,300);
			 wait.until(ExpectedConditions.elementToBeClickable(element)).click();
			 
			}
		public static void screenshort(WebElement payment)throws IOException {
		TakesScreenshot ss =(TakesScreenshot) driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Jai\\eclipse-workspace\\VineethCucumber\\screenshort\\error.png");
		Files.copy(source,destination );
		
			
		
		}
		public static void FileInputStream(WebElement element ,String s) throws IOException {
		FileInputStream d = new FileInputStream(s);
		Properties p =new Properties();
		p.load(d);
		
}


	
}



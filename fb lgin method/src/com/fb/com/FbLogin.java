package com.fb.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
public class FbLogin {

	
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jai\\eclipse-workspace\\fb lgin method\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.myntra.com/men-casual-shirts");
	driver.manage().window().maximize();
	//implicit

//	WebElement creataccount= driver.findElement(By.linkText("Create New Account"));
//	creataccount.click();
//	Thread.sleep(3000);
//	WebElement Firstname = driver.findElement(By.name("firstname"));
//	Firstname.sendKeys("jai");
	//WebElement secondname = driver.findElement(By.name("lastname"));
	//secondname.sendKeys("Arun");
	//Thread.sleep(2000);
	//WebElement mail =driver.findElement(By.name("reg_email__"));
	//mail.sendKeys("ja1234@gamil.com");
	//WebElement reenter =driver.findElement(By.name("reg_email_confirmation__"));
	//reenter.sendKeys("ja1234@gamil.com");
	//WebElement pass  =driver.findElement(By.name("reg_passwd__"));
	//pass.sendKeys("jai@6622");
	//Thread.sleep(3000);
	
	//WebElement day =driver.findElement(By.id("day"));
	//Select s =new Select (day);
	//s.selectByValue("19");
	
	//WebElement month =driver.findElement(By.id("month"));
	//Select s1 =new Select (month);
	//s1.selectByIndex(7);
	
	//WebElement year =driver.findElement(By.id("year"));
	//Select s2 =new Select (year);
	//s2.selectByVisibleText("1994");
	
	
	
	//WebElement Gender =driver.findElement(By.xpath("//label[text()='Male']"));
    //Gender.click();
    //WebElement creat = driver.findElement(By.name("websubmit"));
	//creat.click();
	//Thread.sleep(9000);
//	TakesScreenshot ss =(TakesScreenshot) driver;
//	File source = ss.getScreenshotAs(OutputType.FILE);
//	File destination = new File("C:\\Users\\Jai\\eclipse-workspace\\fb lgin method\\screenshort\\error.png");
//	FileUtils.copyFile(source,destination );
//	
	
	
//	WebElement multi = driver.findElement(By.xpath("(//select)[6]"));
//    Select select = new Select(multi);
//    select.selectByVisibleText("Selenium");
//    select.selectByValue("3");
//    select.selectByIndex(4);
//    boolean multiple = select.isMultiple();
//    System.out.println("To check ismultiple"+ multiple);
//    System.out.println("----------------------------------------------------");
//    List<WebElement> options = select.getOptions();
//	
//    for (WebElement webElement : options) {
//    	System.out.println("all option"+webElement.getText());
//		
//	}
//   	System.out.println("----------------------------------------------------------");
//    List<WebElement> alloptions = select.getAllSelectedOptions();
//    			
//    for (WebElement webElement1 : alloptions) {
//    System.out.println("all option"+webElement1.getText());
//	
//    		    }
//     
//    System.out.println("-----------------------------------------------------------------");
//    	 
//    WebElement firstselectoptions = select.getFirstSelectedOption();
//    System.out.println("first select options ="  + firstselectoptions.getText());
//
	
	
	
	
	
//
//  select.deselectByVisibleText("Selenium");
//  select.deselectByValue("3");
//  select.deselectByIndex(4);
//  select.deselectAll();
//	WebElement simple = driver.findElement(By.linkText("SwitchTo")) ; 
//	simple.click(); 
//    List<WebElement> allOptions = driver.findElements(By.xpath("//a[normalize-space()='Alerts']"));
//      for(int i = 0; i<=allOptions.size()-1; i++) {
//      if(allOptions.get(i).getText().contains("Alerts")) {
//        allOptions.get(i).click();
//        break;}
      
	
	
//	WebElement single = driver.findElement(By.id("singleframe"));
//	driver.switchTo().frame(single);
//	WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
//   text.sendKeys("jai");
//   driver.switchTo().defaultContent();
//	WebElement multi1= driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
//	multi1.click();
//	WebElement multi2 = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
//	driver.switchTo().frame(multi2);
//	WebElement multi3 = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
//	driver.switchTo().frame(multi3);
//	WebElement text1 = driver.findElement(By.xpath("//input[@type='text']"));
//	   text1.sendKeys("jai arun");
	
	
	
	
	
	
//	WebElement single = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
//	driver.switchTo().frame(single);
//	WebElement size = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
//
//	Actions a = new Actions (driver);
//	
//	 WebElement from = driver.findElement(By.id("draggable"));
//	 
//	 WebElement to = driver.findElement(By.id("droppable"));
//	 
	// a.dragAndDrop( from , to ).build().perform(); 
//	 
//     WebElement from = driver.findElement(By.id("draggable"));
//	 
//	 WebElement to = driver.findElement(By.id("droppable"));
//	 
//	 a.clickAndHold( from).build().perform();
//	 a.moveToElement( to).build().perform();
//	 a.release(from).build().perform();	 

	//WebElement size = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
	//a.dragAndDropBy(size, 300, 100).perform();
	
	
	
	
	
//	 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
//	
//	
	//5Actions a = new Actions(driver);
//	
//    WebElement topoffer = driver.findElement(By.className("CXW8mj"));
//    a.contextClick(topoffer).build().perform();
//  
//   Robot r =new Robot();
//    r.keyPress(KeyEvent.VK_DOWN);
//    r.keyRelease(KeyEvent.VK_DOWN);    
//    r.keyPress(KeyEvent.VK_ENTER);
//    r.keyRelease(KeyEvent.VK_ENTER);
//	
//	
//    WebElement grocery = driver.findElement(By.linkText("Grocery"));
//    a.contextClick(grocery).build().perform();
//    r.keyPress(KeyEvent.VK_DOWN);
//    r.keyRelease(KeyEvent.VK_DOWN);
//    r.keyPress(KeyEvent.VK_ENTER);
//    r.keyRelease(KeyEvent.VK_ENTER);
//      
//
//    WebElement travel = driver.findElement(By.xpath("//img[@alt='Travel']"));
//    a.contextClick(travel).build().perform();
//    r.keyPress(KeyEvent.VK_DOWN);
//    r.keyRelease(KeyEvent.VK_DOWN);
//    r.keyPress(KeyEvent.VK_ENTER);
//    r.keyRelease(KeyEvent.VK_ENTER);
   // Thread.sleep(3000);
  //   Set< String >windowhandling = driver.getWindowHandles();
     //System.out.println(windowhandling);  
    
//  
   // Iterator<String> iterator = windowhandling.iterator();
//  
   // String parientwindo = iterator.next();
//      System.out.println( parientwindo);
//      String childwindo = iterator.next();
//      System.out.println(childwindo );
// 
//      driver.switchTo().window(childwindo);
//      Thread.sleep(3000);
//      WebElement secrch = driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
//      secrch.sendKeys("mobile");
//      driver.switchTo().window(parientwindo);
    
//     Set<String> wh = driver.getWindowHandles();
//     
//     for (String aaa: wh) {
//    	 
//    	 System.out.println(driver.switchTo().window(aaa).getTitle());
//     }
//     String s = "Flipkart Grocery Store - Buy Groceries Online & Get Rs.1 Deals at Flipkart.com";
//     
//      for (String string1 : wh) {
//   
//    	 
//    	 if(driver.switchTo().window(string1).getTitle().equalsIgnoreCase(s)) {
//    
//    	 break;
//		
//     
//      }
//     }
	
	
	
	//JavascriptExecutor js =(JavascriptExecutor)driver;
//	
//	
//	WebElement email = driver.findElement(By.id("email"));
//	js.executeScript("arguments[0].value='bcfjugf@gamil.com'",email);
//	
//	WebElement pass = driver.findElement(By.id("pass"));
//	js.executeScript("arguments[0].value='jai@123'",pass);
//	
//	WebElement login = driver.findElement(By.name("login"));
//	js.executeScript("arguments[0].click()",login);
	 
	 
	 
	 
	 //wait
	 
	 
//	WebElement home = driver.findElement(By.xpath("//img[@alt='Appliances']"));
//	Actions a = new Actions (driver);
//	a.moveToElement(home).perform();
//	
	
//	 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//		       .withTimeout(Duration.ofSeconds(10))
//		       .pollingEvery(Duration.ofSeconds(2))
//		       .ignoring(NoSuchElementException.class);
//	WebDriverWait wait1 =new WebDriverWait(driver,Duration.ofSeconds(10));
//    wait1.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Add to cart"))).click(); 
//
//		
//	js.executeAsyncScript("window.scrollBy(0,7000)");
//	
//	WebElement home = driver.findElement(By.linkText("/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[2]/div[3]/ul/li/a"));
//	Actions a = new Actions (driver);
//	a.moveToElement(home).click();
//	
//	a.clickAndHold(driver.findElement(By.xpath("//div[@class='product-image-container']"))).click().perform();
//	driver.findElement(By.linkText("Add to cart")).click();
//	

	List<WebElement> allprice = driver.findElements(By.xpath("//span[@class='product-strike']//preceding-sibling::span"));

	ArrayList<Integer> a =new ArrayList<Integer>();
	for (int i = 0; i < allprice.size(); i++) {
		
		String replace = allprice.get(i).getText().replace("Rs. ", "");
		int parseInt = Integer.parseInt(replace);
		a.add(parseInt);
	}
	
	int size = a.size();
	System.out.println("over size of product : "+ size);
	System.out.println("minimum price :"+ Collections.min(a));
	
	}}

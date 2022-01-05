package com.javabuild;

import org.openqa.selenium.chrome.ChromeDriver;

public class Configer {

	public static void main(String[] args) {
     System.setProperty("webdriver.chrome.driver","C:\\Users\\Jai\\eclipse-workspace\\java build path\\drive\\chromedriver.exe");
		
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.google.com");
	}
	

}

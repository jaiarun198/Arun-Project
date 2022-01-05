package com.java;

import org.openqa.selenium.chrome.ChromeDriver;

public class Newdrive {

	public static void main(String[] args) {
		 System.setProperty(" webdriver.chrome.driver","C:\\Users\\Jai\\eclipse-workspace\\Vineeth_Selenium\\Drivers\\ChromeDriver.exe");
			
			ChromeDriver driver =new ChromeDriver();
			driver.get("https://www.google.com");

	}

}

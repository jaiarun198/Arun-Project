package com.store;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Placeorder {

	public static void main(String[] args)  {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jai\\eclipse-workspace\\fb lgin method\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.myntra.com/men-casual-shirts");
	driver.manage().window().maximize();
//	clicks(signin);
//	sk(username,"arunarock006@gamil.com");
//	sk(password,"PKR@PKR");
//	clicks(login);

	}}
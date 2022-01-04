package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	

		@BeforeMethod
		public void setup() {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			System.getProperty("browser").equalsIgnoreCase("Chrome");
			driver.get(System.getProperty("url"));
			driver.get("https://www.google.com");
			
			
		}
		
		@AfterMethod
		public void teardown() {
			driver.close();
		}
		
		
		
	

}

package com.Selenium;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

	String driverPath = System.getProperty("user.home")
			+ "\\MySeleniumWS\\Selenium_UITest\\src\\main\\resources\\Drivers\\chromedriver.exe";
	Logger logger = Logger.getLogger("UI.Search");
	public WebDriver driver;

	public BaseTest() {
		PropertyConfigurator
				.configure(System.getProperty("user.home") + "\\MySeleniumWS\\Selenium_UITest\\log4j.properties");
		System.setProperty("webdriver.chrome.driver", driverPath);
	}

	public void LaunchBrowser() {
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
	}
	
	public WebDriver getDriver()
	{
		return this.driver;
	}

}

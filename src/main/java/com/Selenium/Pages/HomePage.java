package com.Selenium.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {
	WebDriver driver;
	WebDriverWait wait;
	String searchID;
	By searchBox;
	
	public HomePage(WebDriver driver, int time, String searchID) {
		super(driver);
		this.driver = driver;
		this.wait = new WebDriverWait(driver, time);
		this.searchID = searchID;
		this.searchBox= By.xpath(searchID);
	}

	public void SearchForItem(String searchText) {
		WaitAndClick(searchBox);
		WaitAndWrite(searchBox, searchText);
		WaitAndWrite(searchBox, Keys.ENTER);
	}
}

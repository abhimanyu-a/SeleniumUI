package com.Selenium.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	WebDriver driver;
	WebDriverWait wait;

	public BasePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 10);
	}

	public void WaitAndClick(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	}
	
	public void WaitAndClick(By element) {
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	}

	public void WaitAndWrite(WebElement element, String text) {
		wait.until(ExpectedConditions.elementToBeClickable(element)).sendKeys(text);
	}
	
	public void WaitAndWrite(By element, String text) {
		wait.until(ExpectedConditions.elementToBeClickable(element)).sendKeys(text);
	}
	
	public void WaitAndWrite(By element, Keys key) {
		wait.until(ExpectedConditions.elementToBeClickable(element)).sendKeys(key);
	}
	
}

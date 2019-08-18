package com.Selenium;

import java.io.IOException;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Selenium.Pages.HomePage;
import com.Selenium.Utilities.ExcelUtility;
import com.Selenium.Utilities.TestListener;

@Listeners(TestListener.class)
public class DriverTest extends BaseTest {
	int waitTime = 10;
	WebDriverWait wait;

	@Test(dataProvider = "search")
	public void GlobalSearch(String url, String searchID, String textToSearch) throws IOException {
		logger.info("Starting test for " + url);
		LaunchBrowser();
		driver.navigate().to(url);
		HomePage homePage = new HomePage(driver, waitTime, searchID);
		homePage.SearchForItem(textToSearch);
	}

	@DataProvider(name = "search")
	public Object[][] GetData() throws Exception {
		Object[][] testObjArray = ExcelUtility.getTableArray(System.getProperty("user.home")
				+ "\\MySeleniumWS\\Selenium_UITest\\src\\main\\resources\\Data\\DataSheet.xlsx", "Master");

		return (testObjArray);
	}

	@AfterMethod()
	public void CloseBrowser() {
		driver.quit();
	}

}

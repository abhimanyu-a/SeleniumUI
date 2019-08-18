package com.Selenium;
import java.util.List;

import org.testng.TestNG;
import org.testng.collections.Lists;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestNG testNG = new TestNG();
		List<String> suites = Lists.newArrayList();
		suites.add("C:\\Users\\Abhimanyu\\MySeleniumWS\\Selenium_UITest\\testNG.xml");
		testNG.setTestSuites(suites);
		testNG.run();
	}

}

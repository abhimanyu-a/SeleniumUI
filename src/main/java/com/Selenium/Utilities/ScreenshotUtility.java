package com.Selenium.Utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtility {

	public static String CaptureScreenshot(WebDriver driver) throws IOException {
		TakesScreenshot ss = (TakesScreenshot) driver;
		File src = ss.getScreenshotAs(OutputType.FILE);
		File dest = new File(System.getProperty("user.dir") + "\\Screenshots\\"
				+ new SimpleDateFormat("yyyy-MM-dd").format(new Date()) + "\\"
				+ new SimpleDateFormat("yyyy-MM-dd hh-mm-ss-ms").format(new Date()) + ".png");
		FileUtils.copyFile(src, dest);
		return dest.getAbsolutePath();
	}
}

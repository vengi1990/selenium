package com_selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	static WebDriver driver;
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vengatesh\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver 2.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.cricbuzz.com/");
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File des=new File("C:\\Users\\Vengatesh\\eclipse-workspace\\Selenium_Project\\cricbuzz"+".jpg");
	FileUtils.copyFile(src, des);
	System.out.println("Screenshot Taken");
}
}
 
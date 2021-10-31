package com_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {
	public static void main(String[] args) throws Throwable {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vengatesh\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver 2.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,1000);");
	Thread.sleep(4000);
	js.executeScript("window.scrollBy(0,-1000);");
	WebElement findElement = driver.findElement(By.xpath("//*[@id=\"navBackToTop\"]/div/span"));
	js.executeScript("arguments[0].scrollIntoView();", findElement);
	js.executeScript("arguments[0].click();", findElement);
	
	}
}
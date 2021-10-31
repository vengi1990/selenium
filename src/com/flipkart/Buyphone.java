package com.flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buyphone {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vengatesh\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver 2.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.findElement(By.cssSelector("#email")).sendKeys("vengi1990@gmail.com");
	//driver.findElement(By.cssSelector(".inputtext._55r1._6luy._9npi")).sendKeys("123456");
	driver.findElement(By.cssSelector("._6luy._9npi")).sendKeys("123456");
	//driver.findElement(By.linkText("Forgotten password?")).click();
	driver.findElement(By.partialLinkText("Forgotten")).click();
}
}

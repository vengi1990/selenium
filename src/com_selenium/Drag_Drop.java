package com_selenium;
 import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vengatesh\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver 2.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
		driver.switchTo().frame(2);
		Thread.sleep(4000);
		WebElement src = driver.findElement(By.xpath("//img[@src='images/high_tatras_min.jpg']"));
		WebElement des = driver.findElement(By.xpath("//div[@id='trash']"));
		Actions action=new Actions(driver);
		action.clickAndHold(src).moveToElement(des).build().perform();
		
	
	
	
	}
}

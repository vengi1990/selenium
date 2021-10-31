package com_selenium;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_click {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vengatesh\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver 2.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	WebElement right = driver.findElement(By.xpath("(//a[@class='nav-a  '])[1]"));
	Actions action=new Actions(driver);
	action.contextClick(right).build().perform();
	Thread.sleep(4000);
	Robot r=new Robot();
	for (int i = 0; i < 1; i++) {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
	}
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
}
}
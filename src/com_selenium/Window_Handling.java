package com_selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_Handling {
	public static void main(String[] args) throws Throwable {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vengatesh\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver 2.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	Actions a=new Actions(driver);
	Thread.sleep(4000);   
	WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles']"));
	a.contextClick(mobile).build().perform();
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(4000);
	WebElement Best_seller = driver.findElement(By.xpath("//a[text()='Best Sellers']"));
	a.contextClick(Best_seller).build().perform();
	
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(4000);
	WebElement Fashion = driver.findElement(By.xpath("//a[text()='Fashion']"));
	a.contextClick(Fashion).build().perform();
	
	
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	String windowHandle = driver.getWindowHandle();
	System.out.println(windowHandle );
	
	Set<String> windowHandles = driver.getWindowHandles();
	for (String string : windowHandles) {
		String title = driver.switchTo().window(string).getTitle();
		System.out.println(title);
	}
	String s="Amazon Fashion: Clothing, Footwear and Accessories online for Men, Women and Kids";
	for (String str : windowHandles) {
		
	
	if(driver.switchTo().window(str).getTitle().equals(s)) {
	break;
	}
	}
}
}
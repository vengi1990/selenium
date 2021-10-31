package com_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vengatesh\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver 2.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
	/*driver.navigate().to("https://www.youtube.com/");
	Thread.sleep(4000);
	driver.navigate().back();
	Thread.sleep(4000);
	driver.navigate().forward();
	Thread.sleep(4000);
	driver.navigate().refresh();
	driver.manage().window().maximize();
	driver.findElement(By.id("email")).sendKeys("vengi1990@gmail.com");
	Thread.sleep(4000);
	driver.findElement(By.id("pass")).sendKeys("vengat@17");
	driver.findElement(By.name("login")).click();*/
	driver.manage().window().maximize();
	WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	search.sendKeys("POCO F1");
	WebElement search_click = driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
	search_click.click();
	
	WebElement check1 = driver.findElement(By.xpath("(//span[@class='a-size-base a-color-base a-text-bold'])[2]"));
	check1.click();
	Thread.sleep(5000);
	WebElement check2 = driver.findElement(By.xpath("(//span[@class='a-size-base a-color-base'])[3]"));
	check2.click();
	//WebElement click = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
	//click.click();
	Thread.sleep(2000);
	//driver.findElement(By.id("add-to-cart-button")).click();
	//driver.switchTo().frame(3);
	//System.out.println("before");
	//driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
	//System.out.println("after");
	//WebElement check1 = driver.findElement(By.xpath("//input[@id='mbb-offeringID-1']"));
	//check1.clear();
	
	//driver.findElement(By.xpath("//input[@name='submit.buy-now']")).click();
	
	//WebElement credit_button = driver.findElement(By.xpath("(//input[@type='radio'])[3]"));
	//credit_button.click();
	
}
}

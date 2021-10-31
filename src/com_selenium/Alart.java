package com_selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.baseclass.Base_Class;

public class Alart extends Base_Class  {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vengatesh\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver 2.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
	WebElement single = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
	single.click();
	thread(4000);
	//alert(single);
	simple(driver);
	//Alert alert = driver.switchTo().alert();
	//alert.accept();
	thread(4000);
	Thread.sleep(4000);
	WebElement confirm = driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']"));
	confirm.click();
	confirm(driver);
	//Alert alert2 = driver.switchTo().alert();
	//Thread.sleep(4000);
	//alert2.dismiss();
	thread(4000);
	driver.findElement(By.xpath("(//button[@class='btn btn-default btn-lg'])[2]")).click();
	thread(4000);
	prompt(driver,"vengatesh");
	/*Alert alert3 = driver.switchTo().alert();
	Thread.sleep(4000);
	alert3.sendKeys("vengatesh");
	Thread.sleep(9000);
	alert3.sendKeys("vengatesh");
	System.out.println(alert3.getText());
	Thread.sleep(4000);
	alert3.accept();
	WebElement textbox = driver.findElement(By.xpath("//p[@id=\"prompt-demo\"]"));
	System.out.println(textbox.getText());*/
		
	
	
	}
}


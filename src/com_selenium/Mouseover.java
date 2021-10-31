package com_selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vengatesh\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver 2.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.browserstack.com/guide/action-class-in-selenium");
	Actions action=new Actions(driver);
	WebElement develop = driver.findElement(By.xpath("//span[@class='nav_item_name']"));
	action.moveToElement(develop).build().perform();
	Thread.sleep(4000);
	WebElement findElement = driver.findElement(By.xpath("(//a[@title='Support'])[1]"));
	findElement.click();
	Thread.sleep(4000);
	WebElement product = driver.findElement(By.xpath("//button[@id='product-menu-toggle']"));
	action.moveToElement(product).build().perform();
	WebElement findElement2 = driver.findElement(By.xpath("(//div[@class='dropdown-link-heading'])[1]"));
	findElement2.click();
}
}

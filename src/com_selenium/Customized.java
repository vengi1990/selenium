package com_selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Customized {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vengatesh\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver 2.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.myntra.com/men-tshirts");
	driver.manage().window().maximize();
	List<Integer> li=new ArrayList<Integer>();
	//WebElement product_strike = driver.findElement(By.xpath("//div[@id='mountRoot']/div/div/main/div[3]/div/div/div[2]/section/ul/li/a/div[2]//div/span/span[2]"));
	 List<WebElement> discount = driver.findElements(By.xpath("//span[@class='product-strike']//preceding-sibling::span"));
	 for (WebElement dis : discount) {
		String text = dis.getText().replace("Rs. ", "");
		//String text2 = text.replaceAll("Rs ", "");
		System.out.println(text);
		int value=Integer.parseInt(text);
		
		li.add(value);
		
}
	 Integer max = Collections.max(li);
		System.out.println("Maximum Rate="+ max);
	}
}

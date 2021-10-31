package com_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Static_table {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vengatesh\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver 2.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://cosmocode.io/automation-practice-webtable/");
	driver.manage().window().maximize();
	// print all table
	/*List<WebElement> all_data = driver.findElements(By.xpath("//table/tbody/tr/td"));
	for (WebElement alldata : all_data) {
		String text = alldata.getText();
		System.out.println(text);
	}*/
	//print row
	WebElement row_data = driver.findElement(By.xpath("//table/tbody/tr[5]"));
	String text = row_data.getText();
	System.out.println(text);
	
	//column data
	/*List<WebElement> column_data = driver.findElements(By.xpath("//table/tbody/tr/td[5]"));
	for (WebElement coloumndata : column_data) {
		String text2 = coloumndata.getText();
		System.out.println(text2);*/
	//Particular data
		WebElement particular_data = driver.findElement(By.xpath("//table/tbody/tr[5]/td[4]"));
		String text3 = particular_data.getText();
		System.out.println(text3);
	// Title Head	
		List<WebElement> heading = driver.findElements(By.tagName("strong "));
		for (WebElement Heading : heading) {
			String text4= Heading.getText();
			System.out.println(text4);
			
		}
}
}



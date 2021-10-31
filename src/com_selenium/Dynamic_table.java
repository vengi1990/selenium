package com_selenium;

import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_table {
	 
public static void main(String[] args) throws Throwable {
	int Country_index=0; int Cases_index=0; int Deaths_index=0;
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vengatesh\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver 2.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.worldometers.info/coronavirus/");
	driver.manage().window().maximize();
	List<WebElement> all_data = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/thead/tr/th"));
	for (int i = 0; i < all_data.size(); i++) {
		String Header = all_data.get(i).getText();
		Header=Header.replaceAll("\n", "");
		//System.out.println(Header);
		if(Header.equals("TotalCases")) {
			Cases_index=i;
			System.out.println("Total Cases Index = "+ Cases_index);
		}
		else if(Header.contains("Country")) {
			Country_index=i;
			System.out.println("Country_Index = " + Country_index);
		}
		
		else if(Header.equals("TotalDeaths")) {
			Deaths_index=i;
			System.out.println("Total Deaths Index = "+ Deaths_index);
		}
	}
		List<WebElement> particular = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody[1]/tr"));
		for (int j = 0; j < particular.size(); j++) {
			List<WebElement> parti_data = particular.get(j).findElements(By.tagName("td"));
			for (int k = 0; k < parti_data.size(); k++) {
				if(parti_data.get(k).getText().equalsIgnoreCase("india")) {
					String text = parti_data.get(Country_index).getText();
					System.out.println("Country is = " + text);
					String text2 = parti_data.get(Cases_index).getText();
					System.out.println("Total Cases ="+ text2);
					 String text3 = parti_data.get(Deaths_index).getText();
					 System.out.println("Total Deaths =" + text3);
					 Thread.sleep(4000);
					 break;
					
				}
				
			
		
	}

}
}
}

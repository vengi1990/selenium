package com_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.baseclass.Base_Class;

public class Single_dropdown extends Base_Class{
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vengatesh\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver 2.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
	driver.manage().window().maximize();
	WebElement single = driver.findElement(By.xpath("//select[@id='select-demo']"));
	byvalue(single,"Wednesday");
	//Select s=new Select(single);
	//s.selectByValue("Wednesday");
	Thread.sleep(4000);
	byindex(single,6);
	//s.selectByIndex(6);
	Thread.sleep(4000);
	visibletext(single,"Saturday");
	//s.selectByVisibleText("Saturday");
	Thread.sleep(4000);
	
	WebElement multiple = driver.findElement(By.name("States"));
	ismultiple(multiple);
	//Select s1=new Select(multiple);
	/*boolean multiple2 = s1.isMultiple();
	System.out.println(multiple2);
	List<WebElement> options = s1.getOptions();
	 for (WebElement webElement : options) {m
		String text = webElement.getText();
		System.out.println(text);}*/
	
	getoptions(multiple);
	 Thread.sleep(4000);
	System.out.println("***************************");
byvalue(multiple,"New York");
byvalue(multiple,"New Jersey");
byvalue(multiple,"California");
getall(multiple);
/*List<WebElement> allSelectedOptions = s1.getAllSelectedOptions();
for (WebElement webElement : allSelectedOptions) {
	String text1= webElement.getText();
	System.out.println(text1);
}*/
Thread.sleep(4000);
System.out.println("***************************");
debyvalue(multiple,"New Jersey");
//s1.deselectByValue("New Jersey");
fstselected(multiple);
//WebElement firstSelectedOption = s1.getFirstSelectedOption();
//System.out.println(firstSelectedOption.getText());


}


}

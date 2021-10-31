package com.baseclass;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	public static WebDriver driver;
	public static void print(String sysout) {
		System.out.println(sysout);
	}
	public static void thread(int sec) throws Throwable {
		Thread.sleep(sec);
	}
	public static void quit() {
		driver.quit();
	}
	public static void close() {
		driver.close();
	}
	public static void navigateto(String next) {
		driver.navigate().to(next);
	}
	public static void navigatefwd() {
		driver.navigate().forward();
	}
	public static void navigateback() {
		driver.navigate().back();
	}
	public static void navirefresh() {
		driver.navigate().refresh();
	}
	public static void title() {
		driver.getTitle();
	}
	public static void currenturl() {
		driver.getCurrentUrl();
	}
	public static void getatrrib(WebElement element,String attrib) {
		element.getAttribute(attrib);
	}
	public static WebDriver browser_launch(String value) {
	try {
		if(value.equalsIgnoreCase("chrome"))
		{
			
		String path = System.getProperty("user.dir");		
		System.setProperty("webdriver.chrome.driver",path+ "\\Driver\\chromedriver 2.exe");
		 driver=new ChromeDriver();
	}
		else
		{
		throw new Exception();
		}
	} catch(Exception e) {
		System.out.println("Invalid browser");
	}
	return driver;
	}
	public static void geturl(String url) {
		driver.get(url);
	}
	public static void inputvalue(WebElement element,String text) {
		element.sendKeys(text);
	}
	public static void click(WebElement element) {
		element.click();
	}
	public static void clear(WebElement element) {
		element.clear();
	}
	public static void gettext(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}
	
	public static void isselected(WebElement element) {
		boolean selected = element.isSelected();
		System.out.println(selected);
		
	}
	public static void isenabled(WebElement element) {
		boolean enabled = element.isEnabled();
		System.out.println(enabled);
	
}
	public static void isdisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		System.out.println(displayed);
	}
	public static void byvalue(WebElement element, String text) {
		Select s=new Select(element);
		s.selectByValue(text);
	}
	public static void byindex(WebElement element, int index) {
		Select s=new Select(element);
		s.selectByIndex(index);
	}
	public static void visibletext(WebElement element, String text) {
		Select s=new Select(element);
		s.selectByVisibleText(text);
	}
	public static void ismultiple(WebElement element) {
		Select s=new Select(element);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		
	}
	public static void getoptions(WebElement element) {
		Select s=new Select(element);
		List<WebElement> options = s.getOptions();
		for (WebElement webElement : options) {
			String text = webElement.getText();
			System.out.println(text);
		}
	}
	public static void deselectall(WebElement element) {
		Select s=new Select(element);
		s.deselectAll();
	}
	public static void debyvalue(WebElement element,String text) {
		Select s=new Select(element);
		s.deselectByValue(text);
	}
	public static void fstselected(WebElement element) {
		Select s=new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
	}
	public static void getall(WebElement element) {
		Select s=new Select(element);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement webElement : allSelectedOptions) {
			String text = webElement.getText();
			System.out.println(text);
			
		}
		
	}
	public static void screenshot(WebDriver driver, String path) throws Throwable {
		Thread.sleep(4000);
		TakesScreenshot ts=(TakesScreenshot)driver; 
		File src=ts.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\Vengatesh\\eclipse-workspace\\Maven\\screenshot"+".jpg");
		FileUtils.copyFile(src, des);
	}
	public static void simple(WebDriver driver) {
		Alert a = driver.switchTo().alert();
		a.accept();
	}
	public static void confirm(WebDriver driver) {
		Alert a = driver.switchTo().alert();
		a.dismiss();
	}
	public static void prompt(WebDriver driver,String text) {
		Alert a = driver.switchTo().alert();
		a.sendKeys(text);
		String text2 = a.getText();
		System.out.println(text2);
		a.accept();
		
	}
	public static void moveto(WebElement element)
	{
		Actions a=new Actions(driver);
		a.moveToElement(element).build().perform();
	}
	public static void rightclick(WebElement element) {
		Actions a=new Actions(driver);
		a.contextClick(element).build().perform();
	}
	public static void drag_drop() {
		
	}
	
}
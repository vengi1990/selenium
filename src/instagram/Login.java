package instagram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vengatesh\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver 2.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
		//WebElement facebook = driver.findElement(By.xpath("(//span[@class='KPnG0'])"));
		//facebook.click();
		/*driver.navigate().to("https://www.youtube.com/");
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().forward();
		Thread.sleep(4000);
		driver.navigate().refresh();*/
		driver.manage().window().maximize();
		//WebElement username = driver.findElement(By.xpath("//input[@type='text'])"));
		//String text = username.getText();
	//	System.out.println(text);
		//username.sendKeys("vengi1990@gmail.com");
		//boolean displayed = username.isDisplayed();
		//System.out.println(displayed);
		//boolean enabled = username.isEnabled();
		//System.out.println(enabled);
		
		Thread.sleep(4000);
		
		//WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		
		//password.sendKeys("vengat@17");
		//boolean selected = password.isSelected();
		//System.out.println(selected);
		//Thread.sleep(4000);
		//password.clear();
		//String text = password.getText();
		//System.out.println(text);
		
		
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(4000);	
		driver.findElement(By.name("firstname")).sendKeys("Selenium");
		Thread.sleep(4000);	
		driver.findElement(By.name("lastname")).sendKeys("Java");
		Thread.sleep(4000);	
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select s=new Select(day);	
		s.selectByValue("10");
		Thread.sleep(4000);	
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select s1=new Select(month);
		s1.selectByIndex(11);
		Thread.sleep(4000);	
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select s2=new Select(year);
		s2.selectByVisibleText("1990");
		driver.findElement(By.xpath("//input[@value='1']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@value='2']")).click();
		
		
		
		
		
		
		
}
}
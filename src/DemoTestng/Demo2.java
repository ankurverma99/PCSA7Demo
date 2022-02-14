package DemoTestng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo2 {
	WebDriver driver;
	
	@BeforeMethod
	public void beforeM() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		driver.get("https://www.google.com/");
		
		Thread.sleep(2000);
		Reporter.log("BM",true);
	}
	@Test
	public void tc() throws InterruptedException {
	driver.findElement(By.name("q")).sendKeys("Selenium",Keys.ENTER);
	Thread.sleep(2000);
	Reporter.log("tc", true);
	}
	/*@Test
	public void tc1() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys("Java",Keys.ENTER);
		Thread.sleep(2000);
		Reporter.log("tc1", true);
	}*/
	@AfterMethod
	public void afterM()
	{
		driver.close();
		Reporter.log("AM",true);
	}
	}
		
	



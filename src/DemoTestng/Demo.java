package DemoTestng;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import graphql.Assert;

public class Demo {
	@Test
	public void tc() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		driver.close();
		Reporter.log("tc", true);
		
	}
	@Test
	public void tc1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		driver.close();
		
		Reporter.log("tc1", false);
		//org.testng.Assert.fail();
	}
	
	
	
	

}

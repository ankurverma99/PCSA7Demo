 package testpom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.ActiTime;

public class ActitimeTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(5000);
		
		ActiTime a=new ActiTime(driver);
		a.sendText("admin");
		Thread.sleep(5000);
		ActiTime a1=new ActiTime(driver);
		
		
		a.sendText1("manager");
		Thread.sleep(2000);
		
		
	
	}

} 

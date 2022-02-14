package testpom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.Google;

public class GoogleTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Google g=new Google(driver);
		
		g.sendText("java");
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		g.sendText("selenium");
		
		
	}
	

}

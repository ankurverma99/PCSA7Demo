package DemoTestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoParallerM {
	@Test
	public void Google() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.close();
	}
	@Test
		public void Facebook() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			 
			driver.get("https://www.facebook.com/");
			Thread.sleep(2000);
			driver.close();
		}
	}



package DemoTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {
	@Test
	public void tc() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("java",Keys.ENTER);
		Reporter.log("TC", false);
	}

}

package DemoTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoActiTime1 {
	WebDriver driver;
	
	@BeforeMethod
	public void bm() {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	
		driver.get("https://demo.actitime.com/login.do");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Reporter.log("BM", true);
	}
	@Test
	public void tc_01() throws InterruptedException{
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		Reporter.log("TC01", true);
	}
	@Test
	public void tc_02() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	
		driver.findElement(By.xpath("//label[text()='Keep me logged in']"));
		Reporter.log("TC02", true);
	}
	@Test
	public void tc_03() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//label[text()='Keep me logged in']"));
	
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Reporter.log("TC03", true);
	}
	@AfterMethod
	public void am() {
		driver.close();
	
	}

}

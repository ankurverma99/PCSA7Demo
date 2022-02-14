import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot1 {

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		WebElement s=driver.findElement(By.xpath("//input[@name='q']"));
		s.sendKeys("java",Keys.ENTER);
		WebElement j=driver.findElement(By.xpath("//span[text()='Java']"));
		Thread.sleep(2000);
		
		Actions a=new Actions(driver);
		
		a.doubleClick(j).perform();
		Thread.sleep(2000);
		Robot r=new Robot();
		System.out.println(driver.getTitle());
		
//------------------open new windo----------------
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
		Thread.sleep(2000);
//-----------------------------------------------
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_T);
		Thread.sleep(2000);
//------------------------------------------------
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);
//-------------------------------------------------
		r.keyPress(KeyEvent.VK_ENTER);
		System.out.println(driver.getTitle());
	
	}

}

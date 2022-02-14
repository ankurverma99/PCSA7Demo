
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.google.com/");
		
		WebElement SerachBox=driver.findElement(By.name("q"));//Search box 
		SerachBox.sendKeys("java",Keys.ENTER);
		//-------------------------------------------------------------------
		System.out.println(driver.getCurrentUrl()); 
		System.out.println(driver.getTitle());
		//--------------------------------------------------------------------		
		Thread.sleep(2000);
		WebElement SerachBox1=driver.findElement(By.name("q"));
		SerachBox1.clear();
		
		SerachBox1.sendKeys("Selenium",Keys.ENTER);
		Thread.sleep(2000);
		//-----------------------------------------------------------
		List<WebElement> link=driver.findElements(By.tagName("a"));
		System.out.println(link);
		//-----------------------------------------------------------
		Thread.sleep(2000);
		
		System.out.println(driver.getCurrentUrl()); 
		System.out.println(driver.getTitle());
		
		driver.close();
		

	}

}

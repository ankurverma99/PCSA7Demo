import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UrbanLadder2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(2000);

		
		List<WebElement> s=driver.findElements(By.xpath("//div/ul/li/div/div/ul[@class='inline-list left']"));
		
		List<WebElement> menus=driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));
		
		Actions a=new Actions(driver);
		Thread.sleep(2000);
		

	}
}

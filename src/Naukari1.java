import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Naukari1 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
		
		Thread.sleep(2000);
		
		String parentWh =driver.getWindowHandle();
		
		Set<String> wins= driver.getWindowHandles();   //given the return value SetString
		
		System.out.println(driver.getClass());         //it is output of 
		
		System.out.println("---------------------------------------------------");
		System.out.println(parentWh);
		
		System.out.println("---------------------------------------------------");
		System.out.println(wins);
		
		System.out.println("---------------------------------------------------");
		wins.remove(parentWh);
		
		System.out.println(wins);
		
		//System.out.println(parentWh);
		
		for(String handle : wins)
		{
			driver.switchTo().window(handle);
			driver.close();
			Thread.sleep(2000);
		}
		
	}

}


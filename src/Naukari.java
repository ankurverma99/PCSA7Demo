
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Naukari 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
		
		Thread.sleep(2000);  //hold the screen 
		
		Set<String> wins =driver.getWindowHandles(); //given the current tab refe String
		
		String s = driver.getWindowHandle();
		
		wins.remove(s);
		
		String add=driver.getPageSource();
		System.out.println(add);
	
		for(String handle : wins)
		{
			System.out.println(driver.switchTo().window(handle));
			driver.close();
			Thread.sleep(2000);
		}
		
		driver.quit();
			
	}

}


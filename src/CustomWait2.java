
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomWait2 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Suraj/Desktop/WebDriverWait%20Examples/sam1.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//--------------------------------------------------------------------------------------------
		driver.findElement(By.name("textA")).sendKeys("name");
		System.out.println(driver.findElement(By.name("textA")).getAttribute("value"));
		
		WebDriverWait ww=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		ww.until(new ExpectedCondition<Boolean>() 
		{
						@Override
						public Boolean apply(WebDriver d) 
						{
							// TODO Auto-generated method stub
							WebElement ele=d.findElement(By.xpath("//input[@name='textA']"));
							return ele.getAttribute("value").equalsIgnoreCase("name");
						}
						
					});
		
		driver.findElement(By.name("textB")).sendKeys("suraj");
	}
}
//		WebDriverWait ww=new WebDriverWait(driver, Duration.ofSeconds(10));
//		
//		ww.until(new ExpectedCondition<Boolean>() {
//
//			@Override
//			public Boolean apply(WebDriver d) {
//				// TODO Auto-generated method stub
//				WebElement ele=d.findElement(By.xpath("//input[@name='textA']"));
//				return ele.getAttribute("").equalsIgnoreCase("name");
//			}
//			
//		});
//			driver.findElement(By.xpath("//input[@name='textA']")).sendKeys("name");
////------------------------------------------------------------------------------------------------
//			
//			ww.until(ExpectedConditions.textToBePresentInElementValue(By.xpath("//input[@name='textA']"),"name"));
//			
//			ww.until(new ExpectedCondition<Boolean>() 
//			{
//				@Override
//				public Boolean apply(WebDriver d) 
//				{
//					WebElement ele=d.findElement(By.xpath("//input[@name='textB']"));
//					return ele.isDisplayed();
//				}
//				
//			});
//				driver.findElement(By.xpath("//input[@name='textB']")).sendKeys("suraj");
//	}
//
//}

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomWait1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Suraj/Desktop/WebDriverWait%20Examples/VisibilityOfTextbox.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait ww=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		ww.until(new ExpectedCondition<Boolean>() {

			@Override
			public Boolean apply(WebDriver d) {
				// TODO Auto-generated method stub
				WebElement ele=d.findElement(By.id("iamtextbox"));
				return ele.isDisplayed();
			}
			
		});
			driver.findElement(By.id("iamtextbox")).sendKeys("suraj");
	}

}

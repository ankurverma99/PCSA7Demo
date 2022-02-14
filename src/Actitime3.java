import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actitime3 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
//----------time to search element give the duration of time--------------
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//------------------------------------------------------------------------
		WebElement Id= driver.findElement(By.id("username"));
		Id.sendKeys("admin");
		
//----------------------------------------------------------------------------------
		WebDriverWait ww=new WebDriverWait(driver,Duration.ofSeconds(10));
		ww.until(ExpectedConditions.textToBePresentInElementValue(By.id("username"),"admin"));
//------------------------------------------------------------------------------		
		WebElement password= driver.findElement(By.name("pwd"));
		password.sendKeys("manager");
		WebElement login= driver.findElement(By.id("loginButton"));
		login.click();
//-----------------------------Check the condition--------------------------
		WebDriverWait wwk=new WebDriverWait(driver,Duration.ofSeconds(10));
		wwk.until(ExpectedConditions.titleContains("Enter"));
//---------------------------------------------------------------------------
		
		WebDriverWait wwg=new WebDriverWait(driver,Duration.ofSeconds(10));
		wwg.until(ExpectedConditions.elementToBeClickable(By.id("logoutLink")));

		WebElement logout= driver.findElement(By.id("logoutLink"));
		logout.click();
//---------------------------------------------------------------------------
		
		

	}

}


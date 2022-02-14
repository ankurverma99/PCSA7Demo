import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		
		Actions a=new Actions (driver);
		WebElement ele=driver.findElement(By.xpath("//span [text()='right click me']")); 
		a.contextClick(ele).perform();
		
//		WebElement ele2=driver.findElement(By.xpath("//button[text()='Double-click Me To See Alert*]")); 
//		a.doubleClick(ele2).perform();

	}

}

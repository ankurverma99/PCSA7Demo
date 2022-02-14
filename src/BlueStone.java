import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStone 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(4000);
		
		//driver.findElement(By.xpath("//button[@id='deny']")).click();
		driver.switchTo().activeElement();
		
		//WebElement alljwl=driver.findElement(By.xpath("//ul[@class='wh-main-menu']/li"));
		
		WebElement alljwl=driver.findElement(By.xpath("//input[@class='form-text typeahead']"));
		Actions a=new Actions(driver);
		a.moveToElement(alljwl).build().perform();

	
	}		
}

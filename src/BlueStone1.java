import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BlueStone1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.bluestone.com/");
		WebElement sreach=driver.findElement(By.id("search_query_top_elastic_search"));
		sreach.sendKeys("Rings",Keys.ENTER);
		
		driver.findElement(By.xpath("//img[@class='hc img-responsive center-block']")).click();
		
		String parentWh =driver.getWindowHandle();
		Set<String> wins= driver.getWindowHandles();
		wins.remove(parentWh);
		
		for(String h:wins)
		{
			driver.switchTo().window(h);
		}
			driver.findElement(By.id("buy-now")).click();
			
		WebElement msg=driver.findElement(By.xpath("//div[@class='formErrorContent']"));
		System.out.println(msg.getText());
		
		WebElement firsts=driver.findElement(By.xpath("//span[@class='size-box-overlay']"));
		firsts.click();
		driver.findElement(By.xpath("//span[text()=6]")).click();
		
		driver.findElement(By.xpath("//input[@id='buy-now']")).click();
		
		driver.findElement(By.xpath("//a[@title='Place Order']")).click();
		
		WebElement mail=driver.findElement(By.xpath("//input[@id='email']"));
		mail.sendKeys("ad123@gmail.com");
		
		WebElement mobile=driver.findElement(By.xpath("//input[@id='contactNumber']"));
		mobile.sendKeys("7030440016");

		driver.findElement(By.xpath("//input[@type='button']")).click();
		
		driver.findElement(By.xpath("//a[@class='btn btn-block btn-new bs-place-order']")).click();
		
		String text=driver.getTitle();
		System.out.println(text);	
	
	}

}
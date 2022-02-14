
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrbanLadder {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.urbanladder.com/");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@alt='Very Merry Christmas under 10k']")).click();
	}

}


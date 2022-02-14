import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class  UrbanLadder4 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		//Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//ul[@class='featuredLinksBar__linkContainer']/li[1]/a")).click();
	
		List<WebElement> all=driver.findElements(By.xpath("//div[@class='_3oCTi']/a"));
		for (WebElement E : all) 
		{
			System.out.println(E.getText());
		}
		System.out.println("--------------------------------------------------------------------");
		driver.findElement(By.xpath("//*[@id=\"app-container\"]/div/main/section[2]/div/a[6]/div[2]/button")).click();
		WebElement d=driver.findElement(By.xpath("//div[@class='info-section']"));
		System.out.println(d.getText());
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Title "+driver.getTitle());

	}

}

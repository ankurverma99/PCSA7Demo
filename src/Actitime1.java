import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime1 {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		WebElement email= driver.findElement(By.id("username"));
		email.sendKeys("admin");
		WebElement password= driver.findElement(By.name("pwd"));
		password.sendKeys("manager");
		//-------------------------------------------------------------------------------
				WebElement keep=driver.findElement(By.xpath("//input[@value='on']"));
				keep.click();
				System.out.println(keep.isSelected());
		//-------------------------------------------------------------------------------		
				WebElement login= driver.findElement(By.id("loginButton"));
				login.click();
		
	
	}

}

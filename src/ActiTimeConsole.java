import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeConsole {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.actitime.com/login.do");
		WebElement email= driver.findElement(By.id("username"));
		email.sendKeys("admin");
		WebElement password= driver.findElement(By.name("pwd"));
		password.sendKeys("manager");
		
		WebElement keep=driver.findElement(By.xpath("//input[@value='on']"));
		keep.click();
		//System.out.println(keep.isSelected());

		driver.findElement(By.id("loginButton")).click();
		//driver.findElement(By.xpath("//div[@class='menutable']/div[4]")).click();

		driver.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[7]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/div[4]/div/div[1]/div/div")).click();
		
		driver.findElement(By.xpath("//a[@onclick='MenuHandler.openAbout(); return false;']")).click();
		
		WebElement gev=driver.findElement(By.xpath("//td[@class='aboutCopyright']"));
		System.out.println(gev.getText());
			
	}

}

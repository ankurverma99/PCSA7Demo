import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificaionPouUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		
		co.addArguments("--DISABLE-notifications"); //we can handle notifications of the webside it argument  
		WebDriver driver=new ChromeDriver();			//contractor override of ChromeDriver 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.justdial.com/");
		

	}

}

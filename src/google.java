import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Facebook {
	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/.software/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		  Thread.sleep(2000);
		  WebElements email =driver.findElement (By.id("email"));
		  email.sendkeys("alia");
		  WebElements password =driver.findElement (By.id("pass"));
		  password.sendkeys("biryani");
		  WebElements login =driver.findElement (By.name("login"));
		  login.click();
	}

	}
		

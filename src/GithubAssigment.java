import org.antrl.v4.runtime.misc.EqualityComparator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class GithubAssigment {
	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/login");
		String a=driver.getTitle();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("admin");
		driver.findElement(By.name("pass")).sendKeys("manager",Keys.ENTER);
		Thread.sleep(2000);
		String b=driver.getTitle();
		if(a==b)
		{
			System.out.println("login is succesfull");
		}
		else if(a!=b) {
			System.out.println("login is not succesfull");
		}
		
	}

}

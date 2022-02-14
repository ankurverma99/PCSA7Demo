import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStone {

	public static void main(String[] args)throws InterruptedException {

	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.bluestone.com");
	Thread.sleep(2000);
	WebElement allJewl=driver.findElement(By.xpath("//a[contains(.,'All Jewellery')]"));
	Actions a=new Actions(driver);
	a.moveToElement(allJewl).build().perform();
	Thread.sleep(5000);
	driver.close();
	}
	

}

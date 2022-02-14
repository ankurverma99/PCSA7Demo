import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TitlewithoutMethod {
	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		WebElement title=driver.findElement(By.tagName("title"));
		System.out.println("Title of the Webpage without using getTitle method is:\n"+title.getAttribute("text"));
		Thread.sleep(3000);
		driver.close();
	}
}

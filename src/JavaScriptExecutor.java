import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		/*To scroll up and down on y-axis
		 * js.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-1000)");*/
		
		
		/*//to scroll full up and full down
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		*/
		/*//to scroll left and right on x-axis
		js.executeScript("window.scrollBy(500,0)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(-200,0)");
		*/
		//to scroll full right and full left
		
		js.executeScript("window.scrollTo(document.body.scrollWidth,0)");
		
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(-document.body.scrollWidth,0)");   
		
		
		
		/*//to scroll upto particular elements
		WebElement ele=driver.findElement(By.xpath("//h2[text()='Voice control your entertainment']"));
		js.executeScript("arguments[0].scrollIntoView()", ele);*/
		
		
		
		
		
		
		
		
		
		
	}

}

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bluestone3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='search_query_top_elastic_search']")).sendKeys("rings",Keys.ENTER);
		driver.findElement(By.xpath("//img[@alt='The Thom Ring']")).click();
		for(String winHandle : driver.getWindowHandles()){ // Switch to new window opened
		    driver.switchTo().window(winHandle);
		}
		driver.findElement(By.xpath("//input[@id='buy-now']")).click();
		WebElement ele=driver.findElement(By.xpath("//div[@class='formErrorContent']"));
		System.out.println(ele.getText());
}
	

}

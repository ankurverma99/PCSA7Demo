import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
public class Actitime {
	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/");
		Thread.sleep(2000);
		WebElement searchBox= driver.findElement(By.name("q"));
		boolean dis=searchBox.isDisplayed();
		System.out.println(dis);
		searchBox.sendKeys("selenium",Keys.ENTER);
		Thread.sleep(2000);
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		Thread.sleep(2000);
		WebElement search=driver.findElement(By.name("q"));
		search.clear();
		Thread.sleep(2000);
		System.out.println(search.getAttribute("id"));
		System.out.println(search.getCssValue("border"));
		search.sendKeys("testng",Keys.ENTER);
		driver.close();
		}

}

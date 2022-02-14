import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
public class Javasearch{
	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		Thread.sleep(2000);
		WebElement searchBox= driver.findElement(By.name("q"));
		boolean dis=searchBox.isDisplayed();
		System.out.println(dis);
		searchBox.sendKeys("Java");
		Thread.sleep(2000);
		List<WebElement>sugg=driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		for(WebElement sugg1:sugg) {
			System.out.println(sugg1.getText());
		}
		sugg.get(2).click();
	}
}                

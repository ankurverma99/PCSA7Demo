import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bluestone_Sceno12 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(4000);
		WebElement ring = driver.findElement(By.xpath("//a[text()='Rings ']"));
		Thread.sleep(1000);
		Actions a = new Actions(driver);
		a.moveToElement(ring).build().perform();
		  
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[2]/a[@title='Diamond Rings']")).click();
		Thread.sleep(2000);
		List<WebElement> element = driver.findElements(By.xpath("//span[@class='new-price']"));
		System.err.println("Default price list");
		ArrayList al1 = new ArrayList<>();
		for (WebElement ele : element) {
			al1.add(ele.getText());
		}
		System.out.println(al1);
		Thread.sleep(1000);
		WebElement popular = driver.findElement(By.xpath("//span[contains(.,' Popular ')]/parent::span"));
		Thread.sleep(1000);
		a.moveToElement(popular).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'Price Low to High')]")).click();
		Thread.sleep(2000);
		List<WebElement> element1 = driver.findElements(By.xpath("//span[@class='new-price']"));
		System.err.println("sorted price list");
		ArrayList al2 = new ArrayList<>();
		for (WebElement ele : element1) {
			al2.add(ele.getText());
		}
		System.out.println(al2);
		for (int i = 0; i < al2.size(); i++) {
			for (int j = 1; j <al2.size(); j++) {
			}
		}
}
}



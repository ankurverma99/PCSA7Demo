
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoAction {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable/");
		Thread.sleep(2000);
		
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		WebElement drag=driver.findElement(By.id("draggable"));
		Actions a =new Actions(driver);
		a.dragAndDropBy(drag, 300,0).perform();
		
		WebElement Drop=driver.findElement(By.xpath("//div[@id='draggable']"));
		driver.switchTo().frame(frame);
		WebElement dra=driver.findElement(By.id("droppable"));
		
		a.dragAndDropBy(drag, 300,0).perform();
		

	}

}

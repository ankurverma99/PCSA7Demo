
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo2
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		WebElement Dra=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(Dra);
		Thread.sleep(3000);
		WebElement draggable=driver.findElement(By.id("draggable"));
		WebElement droppable=driver.findElement(By.id("droppable"));
		
		Thread.sleep(4000);
		Actions a=new Actions(driver);
		a.dragAndDrop(draggable, droppable);
		
	}

}
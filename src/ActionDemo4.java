import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo4 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(3000);
		
		Actions a=new Actions(driver);
		WebElement as=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(as);
		
		Thread.sleep(3000);
		
		//WebElement dropp=driver.findElement(By.xpath("//div[@id='droppable']"));
		//Thread.sleep(3000);
		WebElement dragg=driver.findElement(By.xpath("//div[@id='draggable']"));
		
		//a.dragAndDropBy(dropp, 300, 150).perform();
		
		//Thread.sleep(3000);
		a.dragAndDropBy(dragg, 300, 150).perform();
		
//                    (element,x-path300,y-path150)		
		

	}

}



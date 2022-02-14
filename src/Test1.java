import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class Test1 {
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("bluestone",Keys.ENTER);
		Thread.sleep(3000);
		WebElement s=driver.findElement(By.xpath("//span[text()='Bluestone.com - Bluestone - Buy Real Gold & Diamond Online']"));
		
		Actions a=new Actions(driver);
		a.doubleClick(s).perform();
		Thread.sleep(3000);
		String ele=driver.getCurrentUrl();
		System.out.println(ele);
		driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("Rings",Keys.ENTER);
		Thread.sleep(3000);
		WebElement r=driver.findElement(By.xpath("//img[@alt='The Helix Lattice Ring']"));
		r.click();
		String parentWh=driver.getWindowHandle();
		Set<String> wins=driver.getWindowHandles();
		
		
		for(String h:wins)
		{
			driver.switchTo().window(h);
		}
		Thread.sleep(3000);
		WebElement z=driver.findElement(By.xpath("//span[text()=' Select a Ring Size ']"));
		String text=z.getText();
		System.out.println(text);
		
		driver.findElement(By.xpath("//span[@class='size-box-overlay']")).click();
		
		driver.findElement( By.xpath("//span[text()='6']")).click();
		Thread.sleep(2000);
		
		WebElement buy=driver.findElement(By.xpath("//input[@id='buy-now']"));
		
		a.doubleClick(buy);
		
		TakesScreenshot t=(TakesScreenshot)driver;
		File ss=t.getScreenshotAs(OutputType.FILE);
		File sss=new File("./screenshot/bluestone.png");
		Files.copy(ss, sss);
		
		
		
		
		
		
				
				
	}

}

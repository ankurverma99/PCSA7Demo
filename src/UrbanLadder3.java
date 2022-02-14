import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UrbanLadder3
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(2000);
		
		List<WebElement> menus=driver.findElements(By.xpath("//*[@id=\"topnav_wrapper\"]/ul/li"));
		
		Actions a=new Actions(driver);
		
		for(WebElement menu :menus)
		{
			String mName=menu.getText();
			System.err.println(mName);
			a.moveToElement(menu).perform();
			
			Thread.sleep(2000);
			
			List<WebElement>SubMenus=driver.findElements(By.xpath("//span[contains(.,'"+mName+"')]/parent::li/descendant::ul[@class='taxonslist']/li"));
			
			for(WebElement SubMenu: SubMenus)
			{
				System.out.println(SubMenu.getText());
			}
			
			Thread.sleep(2000);
		}
		
	}
	
}

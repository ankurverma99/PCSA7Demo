import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStone_Sceno14 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(4000);
		WebElement ring = driver.findElement(By.xpath("//a[text()='All Jewellery ']"));
		Thread.sleep(1000);
		Actions a = new Actions(driver);
		a.moveToElement(ring).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[3]/span[contains(.,'Kadas')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='pid_5675']/parent::div")).click();
		for(String winHandle : driver.getWindowHandles()){ // Switch to new window opened
		    driver.switchTo().window(winHandle);
		}
		driver.findElement(By.xpath("//span[@class='size-box-overlay']")).click();
		Thread.sleep(1000);
		WebElement ele=driver.findElement(By.xpath("//li[1][@onclick='selectRingSize(this)']/span[2]"));
		String s =ele.getText();
		System.out.println("selected size"+s);
		ele.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='buy-now']")).click();
		Thread.sleep(2000);
		WebElement ele2=driver.findElement(By.xpath("//span[@class='ring-size-box']"));
		String s1 =ele2.getText();
		System.out.println("cart size"+s1);
		if(s.equalsIgnoreCase(s1)) {
			System.out.println("the size of iteam in cart and selected size are same");
		}
		else {
			System.out.println("the size of iteam in cart and selected size are  not same");
		}
		Thread.sleep(1000);
		driver.quit();
		
}

}

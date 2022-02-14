import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShot1 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement w=driver.findElement(By.xpath("//input[@type='text']"));
		w.sendKeys("Rings",Keys.ENTER);
		TakesScreenshot sc=(TakesScreenshot)driver;
		File ss=sc.getScreenshotAs(OutputType.FILE);
		File sss=new File("./screenshot/rings.png");
		Files.copy(ss, sss);

	}

}

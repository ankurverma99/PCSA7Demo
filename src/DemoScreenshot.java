import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class DemoScreenshot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    takeScreenShot(driver,"Screenshot","aaa");
		
	}
	public static void takeScreenShot(WebDriver driver,String path,String name) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File ss=ts.getScreenshotAs(OutputType.FILE);
		File sss=new File(path + "/"+name+".png");
		Files.copy(ss, sss);
		
	}
	

}

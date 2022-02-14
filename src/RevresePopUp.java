import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RevresePopUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(5000);
		String parent=driver.getWindowHandle();
		Set<String> Win=driver.getWindowHandles();
		ArrayList<String>a=new ArrayList<>(Win);
		System.out.println(a);
		for (int i = a.size()-1; i>=0; i--) {
			driver.switchTo().window(a.get(i));
			Thread.sleep(2000);
			driver.close();
			
		}
	}

}

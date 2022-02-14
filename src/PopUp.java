
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
public class PopUp {
	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver","./software/chromedriver.exe");
	/*	ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver =new ChromeOptions(co);
		driver.manage().window().maximize();
		driver.get("https://www.justdial.com/");*/
		FirefoxProfile ff=new FirefoxProfile();
		ff.setPreference("dom.webnotification.enabled",false);
		FirefoxOptions fo=new FirefoxOptions();
		fo.setProfile(ff);
		WebDrsiver driver1=new FirefoxDriver(fo);
		driver1.manage().window().maximize();
		driver1.get("https://www.justdial.com/");
		
		
	}

}

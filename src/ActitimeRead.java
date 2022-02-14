import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeRead{
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		//String path="‪D:\\demo.xlsx";
		FileInputStream fis=new FileInputStream("D:\\demo.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		Cell c1=sh.getRow(1).getCell(0);
		System.out.println(c1);
		Cell c2=sh.getRow(1).getCell(1);
		System.out.println(c2);
		

		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys(c1.toString());
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(c2.toString())  ; 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
	}
	
	
}
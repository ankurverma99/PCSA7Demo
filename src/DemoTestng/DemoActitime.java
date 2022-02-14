package DemoTestng;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoActitime {
	WebDriver driver;
	
	@BeforeMethod
	public void beforeM() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		driver.get("https://demo.actitime.com/login.do");
		
		Thread.sleep(2000);
		Reporter.log("BM",true);
	}
	@Test
	public void tc_01() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		String res=read("D:\\demo.xlsx","Sheet1",1,0);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("s");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("s2");
		
	}
	public static String read(String path,String fn,int r,int c) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis=new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(fn);
		Cell c1=sh.getRow(r).getCell(c);
		String s=c1.toString();
		Cell c2=sh.getRow(1).getCell(1);
		String s2=c2.toString();
		return s;
	}
	
}

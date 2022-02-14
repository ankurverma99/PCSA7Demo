package DemoTestng; 

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoAnnotation {
	@BeforeMethod
	public void bm()
		{
			Reporter.log("BM", true);
		}
	@AfterMethod
	public void am()
	{
		Reporter.log("AM", true);
	}
	@BeforeClass
	public void beforeC()
	{
		Reporter.log("BeforeC", true);
	}
	@AfterClass
	public void ac()
	{
		Reporter.log("AC", true);
	}
	@BeforeTest
	public void bt()
	{
		Reporter.log("BT", true);
	}
	@AfterTest
	public void at()
	{
		Reporter.log("AT", true);
	}
	@BeforeSuite
	public void bs()
	{
		Reporter.log("BS", true);
	}
	@AfterSuite
	public void as()
	{
		Reporter.log("AS", true);
	}
	@Test
	public void tc()
	{
		Reporter.log("TC0", true);
	}
	@Test
	public void tc_01()
	{
		Reporter.log("TC1", true);
	}
	

}

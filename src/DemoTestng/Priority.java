package DemoTestng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
	@Test(priority = 3)
	public void logout (){
		Reporter.log("Tc-01", true);
		
	}
	  @Test(priority = 1)
	public void login() {
		Reporter.log("Tc-02", true);
		
		
	} 
	@Test(priority =  2)
	public void search() {
		Reporter.log("Tc-03", true);
		
	}

}

package DemoTestng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InocationCount {
	@Test(invocationCount =5)//it will run test case for 5 times
	public void tc_01() {
		Reporter.log("Tc-01", true);
		
	}
	@Test(enabled=false)  //it will exclude the test case and default value of enabled is True
	public void tc_02() {
		Reporter.log("Tc-02", true);
		
	}
	@Test
	public void tc_03() {
		Reporter.log("Tc-03", true);
		
	}
	

}

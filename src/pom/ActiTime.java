package pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTime {
	@FindBy(name="username")
	private WebElement username;
	@FindBy(name="pwd")
	private WebElement pass;
	//@FindBy(id="loginButton")
	//private WebElement login;
		
	public ActiTime(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	public void sendText(String txt) throws InterruptedException
	{
		username.sendKeys(txt,Keys.ENTER);
		Thread.sleep(2000);
	}
	public void sendText1(String txt1) throws InterruptedException {
		pass.sendKeys(txt1,Keys.ENTER);
		Thread.sleep(2000);
		
	}
	/*public void click() {
		login.click();
	}*/
	

}

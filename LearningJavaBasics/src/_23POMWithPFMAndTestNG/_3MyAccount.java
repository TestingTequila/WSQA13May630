package _23POMWithPFMAndTestNG;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class _3MyAccount extends ApplicationData{

	WebDriver driver;
	public _3MyAccount(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void verifyLoginStatus()
	{
		String loggedInTitle=driver.getTitle();
		Assert.assertEquals(loggedInTitle, "My Account");
	}
}

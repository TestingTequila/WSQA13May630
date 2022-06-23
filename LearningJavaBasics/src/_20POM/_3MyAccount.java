package _20POM;

import org.openqa.selenium.WebDriver;

public class _3MyAccount extends ApplicationData{

	WebDriver driver;
	public _3MyAccount(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void verifyLoginStatus()
	{
		String loggedInTitle=driver.getTitle();
		if(loggedInTitle.equals("My Account"))
		{
			System.out.println(loginSuccessMsg);
		}
		else
		{
			System.out.println(loginFailureMsg);
		}
	}
}

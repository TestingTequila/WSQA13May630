package _22testngDummyCode;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LearningtestNg {

	@BeforeMethod
	public void openBrowserAndEnterUrl()
	{
		System.out.println("==@Before Method: This will open browser and enter url==");
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		System.out.println("**@AfterMethod: This will close the Browser**");
	}
	
	@Test
	public void login()
	{
		System.out.println("Test Case : This will log in into the application");
	}
	
	@Test
	public void loginWithInvalidCredentails()
	{
		System.out.println("Test Case : This will not log into the application");
	}
	
	@Test
	public void registration()
	{
		System.out.println("Test Case : This will create a new user");
	}
}

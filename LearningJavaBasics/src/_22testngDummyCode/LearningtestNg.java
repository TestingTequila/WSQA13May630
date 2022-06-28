package _22testngDummyCode;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LearningtestNg {
	
	@BeforeTest
	public void FillDb()
	{
		System.out.println("@BeforeTest: This will fill values in Db tables");
	}
	
	@AfterTest
	public void EmptyDb()
	{
		System.out.println("@AfterTest: This will empty the values in Db tables");
	}

	@BeforeClass
	public void connectToDb() 
	{
		System.out.println("@BeforeClass: System will connect with DB");
	}
	
	@AfterClass
	public void disconnectWithDb()
	{
		System.out.println("@AfterClass: System will disconnect with DB");
	}
	
	@BeforeMethod
	public void openBrowserAndEnterUrl()
	{
		System.out.println("==@BeforeMethod: This will open browser and enter url==");
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		System.out.println("**@AfterMethod: This will close the Browser**");
	}
	
	@Test(priority=2, groups="Smoke")
	public void login()
	{
		System.out.println("Test Case : This will log in into the application");
	}
	
	@Test(priority=3, enabled=true, timeOut=2000,groups="Smoke")
	public void loginWithInvalidCredentails()
	{
		System.out.println("Test Case : This will not log into the application");
		Assert.fail();
	}
	
	@Test(priority=1)
	public void registration()
	{
		System.out.println("Test Case : This will create a new user");
		Assert.fail();
	}
	
	@Test(priority=4, dependsOnGroups="Smoke", alwaysRun=true, invocationCount=10)
	public void ContactUs()
	{
		System.out.println("Test Case: This will helpcustomers to Connect with Us");
	}
	
	//@DataProvider/@Parameters
}

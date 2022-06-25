package _23POMWithPFMAndTestNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class PreRequisites extends ApplicationData{

	String browserType = "Chrome";
	WebDriver driver;

	@BeforeMethod
	public void OpenApplication() {
		// 1. Open the browser
		driver = _19utilities._1CommonActions.launchBrowser(browserType);
		driver.manage().window().maximize();
		// 2. Enter the url
		driver.get(url);
	}

	@AfterMethod
	public void CloseApplication() {
		// 9. Close the browser
		_19utilities._1CommonActions.closeBrowser();
	}
}

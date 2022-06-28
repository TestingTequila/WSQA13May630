package _23POMWithPFMAndTestNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class PreRequisites extends ApplicationData{

	WebDriver driver;

	@BeforeMethod @Parameters("browserType")
	public void OpenApplication(String browserType) {
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

package _20POM;

import org.openqa.selenium.WebDriver;

public class _4LoginWithGenrics extends ApplicationData{

	
	public static void main(String[] args) throws InterruptedException {

		String browserType="Chrome";

		//1. Open the browser
		WebDriver driver = _19utilities._1CommonActions.launchBrowser(browserType);
		driver.manage().window().maximize();
		
		//2. Enter the url
		driver.get(url);
		
		//3. Click on My Account Icon
		_1YourStore ys = new _1YourStore(driver);
		ys.clickOnMyAccountIcon();
		
		//4. Click on Login link
		ys.clickOnLoginLink();
		
		//5. Enter correct email id
		_2AccountLogin al = new _2AccountLogin(driver);
		al.enterEmailId();
		
		//6. Enter correct password
		al.enterPassword();
		
		//7. Click on Login button
		al.clickOnLoginButton();
		
		//8. Validate login status
		_3MyAccount ma = new _3MyAccount(driver);
		ma.verifyLoginStatus();
		
		//9. Close the browser
		_19utilities._1CommonActions.closeBrowser();


	}

}

package _23POMWithPFMAndTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _4LoginWithGenrics extends WebElementFactory{

		@Test(priority=2)
		public void Login1() throws InterruptedException
		{
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
		}
		
		@Test(priority=3, enabled=false)
		public void Login2() throws InterruptedException
		{
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
		}
		
		@Test(priority=1)
		public void registration()
		{
			// 3. Click on My Account Icon
			driver.findElement(By.xpath("//i[@class='fa fa-user']")).click();

			// 4. Click on Register link
			driver.findElement(By.xpath("//a[text()='Register']")).click();
			
			// 5. Fill thr form
			driver.findElement(By.id("input-firstname")).sendKeys(fName);
			driver.findElement(By.name("lastname")).sendKeys(lName);
			driver.findElement(By.id("input-email")).sendKeys(emailId);
			driver.findElement(By.id("input-telephone")).sendKeys(telephone);
			
			Select country = new Select(driver.findElement(By.id("input-country")));
			country.selectByValue(countryValue);
			
			driver.findElement(By.name("password")).sendKeys(regpassword);
			driver.findElement(By.name("confirm")).sendKeys(regpassword);
			driver.findElement(By.xpath("//input[@name='newsletter' and @value=1]")).click();
			Select subscription = new Select(driver.findElement(By.name("subscription")));
			subscription.selectByValue(subscriptionValue);
			
			// 6. Click on Privacy Policy Checkbox
			driver.findElement(By.name("agree")).click();
			
			// 7. Click on Continue button
			driver.findElement(By.id("submitbtn")).click();
			
			// 8. Verify Registration status
			String registrationPageTitle=driver.getTitle();
			Assert.assertEquals(registrationPageTitle, registrationSuccessMsg);
		}
		



	}


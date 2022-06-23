package _18MultipleBrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _3Registration extends ApplicationData{

	public static void main(String[] args) {

		String browserType="Firefox";
		WebDriver driver;

		driver = _19utilities._1CommonActions.launchBrowser(browserType);

		// 2. Enter the url
		driver.get(url);

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
		if(registrationPageTitle.equals(registrationSuccessMsg))
		{
			System.out.println("Congratulations! Your new account has been successfully created!");
		}
		else
		{
			System.out.println(registrationFailureMsg);
		}
		
		// 9. Close the browser
		_19utilities._1CommonActions.closeBrowser();

	}

}

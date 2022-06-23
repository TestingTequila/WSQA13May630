package _18MultipleBrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _4LoginWithGenrics extends ApplicationData{

	
	public static void main(String[] args) throws InterruptedException {

		String browserType="Safari";

		//1. Open the browser
		WebDriver driver =_19utilities._1CommonActions.launchBrowser(browserType);
		
		//2. Enter the url
		driver.get(url);
		
		//3. Click on My Account Icon
		driver.findElement(By.xpath("//i[@class='fa fa-user']")).click();
		Thread.sleep(2000);
		
		//4. Click on Login link
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(2000);
		
		//5. Enter correct email id
		try {
			try {
				driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread.sleep(2000);
		
		//6. Enter correct password
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(password);
		Thread.sleep(2000);
		
		//7. Click on Login button
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//8. Validate login status
		String loggedInTitle=driver.getTitle();
		if(loggedInTitle.equals("My Account"))
		{
			System.out.println(loginSuccessMsg);
		}
		else
		{
			System.out.println(loginFailureMsg);
		}
		//9. Close the browser
		driver.close();


	}

}

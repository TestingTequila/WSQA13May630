package _20POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class _2AccountLogin extends ApplicationData{

	WebDriver driver;
	
	public _2AccountLogin(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void enterEmailId()
	{
	 driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);	
	}
	
	public void enterPassword()
	{
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(password);
	}
	
	public void clickOnLoginButton()
	{
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
}

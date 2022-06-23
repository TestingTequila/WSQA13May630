package _20POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class _1YourStore {

	WebDriver driver;
	
	public _1YourStore(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickOnMyAccountIcon() throws InterruptedException
	{
		driver.findElement(By.xpath("//i[@class='fa fa-user']")).click();
		Thread.sleep(2000);
	}
	
	public void clickOnLoginLink()
	{
		driver.findElement(By.xpath("//a[text()='Login']")).click();
	}
}

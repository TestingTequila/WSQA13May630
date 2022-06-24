package _21POMWithPFM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class _1YourStore extends ApplicationData{

	WebDriver driver;
	
	public _1YourStore(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

	
	public void clickOnMyAccountIcon() throws InterruptedException
	{
		myAccountIcon.click();
		Thread.sleep(2000);
	}
	
	public void clickOnLoginLink()
	{
		loginLink.click();
	}
}

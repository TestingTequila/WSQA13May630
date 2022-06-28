package _23POMWithPFMAndTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class _2AccountLogin extends WebElementFactory{

	WebDriver driver;
	
	public _2AccountLogin(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

	
	public void enterEmailId(String emailId)
	{
		emailTextBox.sendKeys(emailId);	
	}
	
	public void enterPassword(String password)
	{
		passwordTextBox.sendKeys(password);
	}
	
	public void clickOnLoginButton()
	{
		loginButton.click();
	}
}

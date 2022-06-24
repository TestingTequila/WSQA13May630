package _21POMWithPFM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class _2AccountLogin extends ApplicationData{

	WebDriver driver;
	
	public _2AccountLogin(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

	
	public void enterEmailId()
	{
		emailTextBox.sendKeys(email);	
	}
	
	public void enterPassword()
	{
		passwordTextBox.sendKeys(password);
	}
	
	public void clickOnLoginButton()
	{
		loginButton.click();
	}
}

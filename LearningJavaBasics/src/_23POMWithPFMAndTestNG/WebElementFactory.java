package _23POMWithPFMAndTestNG;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WebElementFactory extends PreRequisites {

	@FindBy(how=How.XPATH, using="//i[@class='fa fa-user']")
	WebElement myAccountIcon;
	
	@FindBy(how=How.XPATH, using="//a[text()='Login']")
	WebElement loginLink;
	
	
	@FindBy(how=How.XPATH, using="//input[@id='input-email']")
	WebElement emailTextBox;
	
	@FindBy(how=How.XPATH, using="//input[@id='input-password']")
	WebElement passwordTextBox;
	
	@FindBy(how=How.XPATH, using="//input[@type='submit']")
	WebElement loginButton;
	
	
}

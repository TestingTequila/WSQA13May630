package _17SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _2Login {

	public static void main(String[] args) throws InterruptedException {

		//1. Open the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//2. Enter the url
		driver.get("http://janbaskdemo.com/");
		
		//3. Click on My Account Icon
		driver.findElement(By.xpath("//i[@class='fa fa-user']")).click();
		Thread.sleep(2000);
		
		//4. Click on Login link
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(2000);
		
		//5. Enter correct email id
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("kerrie.wright@gmail.com");
		Thread.sleep(2000);
		
		//6. Enter correct password
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("test@1234");
		Thread.sleep(2000);
		
		//7. Click on Login button
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//8. Validate login status
		String loggedInTitle=driver.getTitle();
		if(loggedInTitle.equals("My Account"))
		{
			System.out.println("Login is successfull");
		}
		else
		{
			System.out.println("Login Failed - Please check your credentials");
		}
		//9. Close the browser
		driver.close();


	}

}

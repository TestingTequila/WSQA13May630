package _24SELENIUMTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class _2Login {
	WebDriver driver;
	@BeforeMethod
	public void launchApplication() {
		// 1. Open the browser
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		// 2. Enter the url
		driver.get("http://janbaskdemo.com/");
	}
	@Test(groups="smoke")
	public void login1() throws InterruptedException {
		// 3. Click on My Account Icon
		driver.findElement(By.xpath("//i[@class='fa fa-user']")).click();
		Thread.sleep(2000);

		// 4. Click on Login link
		driver.findElement(By.xpath("//a[text()='Login']")).click();


		// 5. Enter correct email id
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("kerrie.wright@gmail.com");


		// 6. Enter correct password
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("test@1234");

		// 7. Click on Login button
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		// 8. Validate login status
		String loggedInTitle = driver.getTitle();
		if (loggedInTitle.equals("My Account")) {
			System.out.println("Login is successfull");
		} else {
			System.out.println("Login Failed - Please check your credentials");
		}
	}
	
	@Test(groups="smoke")
	public void login2() throws InterruptedException {
		// 3. Click on My Account Icon
		driver.findElement(By.xpath("//i[@class='fa fa-user']")).click();
		Thread.sleep(2000);

		// 4. Click on Login link
		driver.findElement(By.xpath("//a[text()='Login']")).click();


		// 5. Enter correct email id
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("kerrie.wright@gmail.com");


		// 6. Enter correct password
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("test@1234");

		// 7. Click on Login button
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		// 8. Validate login status
		String loggedInTitle = driver.getTitle();
		if (loggedInTitle.equals("My Account")) {
			System.out.println("Login is successfull");
		} else {
			System.out.println("Login Failed - Please check your credentials");
		}
	}
	@Test(groups="sanity")
	public void login3() throws InterruptedException {
		// 3. Click on My Account Icon
		driver.findElement(By.xpath("//i[@class='fa fa-user']")).click();
		Thread.sleep(2000);

		// 4. Click on Login link
		driver.findElement(By.xpath("//a[text()='Login']")).click();


		// 5. Enter correct email id
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("kerrie.wright@gmail.com");


		// 6. Enter correct password
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("test@1234");

		// 7. Click on Login button
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		// 8. Validate login status
		String loggedInTitle = driver.getTitle();
		if (loggedInTitle.equals("My Account")) {
			System.out.println("Login is successfull");
		} else {
			System.out.println("Login Failed - Please check your credentials");
		}
	}

	@AfterMethod
	public void closeApplication() {
		// 9. Close the browser
		driver.close();
	}

}

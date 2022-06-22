package _17SELENIUM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1LearningBasicSeleniumMethods {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		String pageTitle=driver.getTitle();
		System.out.println("The tile of facebook page is : " + pageTitle);
		driver.close();
	
		

	}

}

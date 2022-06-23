package _19utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _1CommonActions {

	static WebDriver driver;
	
	public static WebDriver launchBrowser(String browserType)
	{
		if(browserType.equalsIgnoreCase("CHROME"))
		{
			// 1. Open the Browser
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		}
		else if(browserType.equalsIgnoreCase("Firefox"))
		{
			// 1. Open the Browser
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browserType.equalsIgnoreCase("IE"))
		{
			// 1. Open the Browser
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		else
		{
			// 1. Open the Browser
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		return driver;
	}
	
	public static void closeBrowser()
	{
		driver.close();
	}
}

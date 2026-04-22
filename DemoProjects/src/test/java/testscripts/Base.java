package testscripts;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import utilities.WaitUtility;

public class Base 

{
	public WebDriver driver;   
	
	@Parameters("browser")  //crossbrowser/multibrowser testing annotation declaring rest in crossbrowser xml
	@BeforeMethod (alwaysRun=true)
	public void browserInitialization(String browser) throws Exception       
	
	{
		if (browser.equalsIgnoreCase("chrome"))  //equalignorecase- checking only content not LCorUC.
			
		{
			driver=new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("firefox"))
		
		{
			driver=new FirefoxDriver();
			
		}
		else if(browser.equalsIgnoreCase("edge"))
			
		{
			driver=new EdgeDriver();
		}
		else
		{
			throw new Exception("Invalid Browser");
		}
		 
		driver.get("http://groceryapp.uniqassosiates.com/admin/login");  
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitUtility.IMPLICITWAIT));  //Duration is Class
	    driver.manage().window().maximize();

	}
	
	@AfterMethod (alwaysRun=true)
	public void browserQuitandClose()
	
	{
	driver.close();   
	}
	

}

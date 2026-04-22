package testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.ExcelUtility;


public class LoginTest extends Base

{
	@Test(priority=1 , groups= {"regression"},retryAnalyzer=retry.Retry.class)   //If priority not mentioned then test cases will run in Alphabetical order
public void verifytheUserIsAbleToLoginUsingValidCredentials() throws IOException

{
	// String usernameValue= "admin";
	// String passwordValue= "admin";
		
		String usernameValue=ExcelUtility.getStringData(1, 0, "loginpage");
		String passwordValue=ExcelUtility.getStringData(1, 1, "loginpage");
		
		LoginPage loginpage=new LoginPage(driver);  //constructor - LoginPage(), Test is passing through one class to another class hence driver should be pass through
		loginpage.enterUserName(usernameValue);
		loginpage.enterPassword(passwordValue);
		loginpage.clickOnSignIn();
	    boolean homepage= loginpage.isHomePageDisplayed();
	    Assert.assertTrue(homepage);  // Hard Assert introduced
}
	
	
	
	
@Test (priority=2)
	public void verifytheUserIsAbleToLoginUsingValidUserNameandInvalidPassword() throws IOException

	{
			//String usernameValue= "admin";
			//String passwordValue= "Sree";
	String usernameValue=ExcelUtility.getStringData(2, 0, "loginpage");
	String passwordValue=ExcelUtility.getStringData(2, 1, "loginpage");
			
			LoginPage loginpage=new LoginPage(driver);  //constructor - LoginPage(), Test is passing through one class to another class hence driver should be pass through
			loginpage.enterUserName(usernameValue);
			loginpage.enterPassword(passwordValue);
			loginpage.clickOnSignIn();
			boolean alertmessage=loginpage.isAlertDispayed();
			Assert.assertTrue(alertmessage);
	}
	
	@Test (priority=3, groups= {"regression"})
	public void verifytheUserIsAbleToLoginUsingInValidUserNameandValidPassword() throws IOException

	{
			//String usernameValue= "Sree";
			//String passwordValue= "admin";
		
		String usernameValue=ExcelUtility.getStringData(3, 0, "loginpage");
		String passwordValue=ExcelUtility.getStringData(3, 1, "loginpage");
			
			LoginPage loginpage=new LoginPage(driver);  //constructor - LoginPage(), Test is passing through one class to another class hence driver should be pass through
			loginpage.enterUserName(usernameValue);
			loginpage.enterPassword(passwordValue);
			loginpage.clickOnSignIn();
			boolean alertmessage=loginpage.isAlertDispayed();
			Assert.assertTrue(alertmessage);
			
	}
	@Test (priority=4) 
	public void verifytheUserIsAbleToLoginUsingInValidUserNameandInValidPassword() throws IOException

	{
			//String usernameValue= "Sree";
			//String passwordValue= "Sree";
		String usernameValue=ExcelUtility.getStringData(4, 0, "loginpage");
		String passwordValue=ExcelUtility.getStringData(4, 1, "loginpage");
			
			LoginPage loginpage=new LoginPage(driver);  //constructor - LoginPage(), Test is passing through one class to another class hence driver should be pass through
			loginpage.enterUserName(usernameValue);
			loginpage.enterPassword(passwordValue);
			loginpage.clickOnSignIn();
			boolean alertmessage=loginpage.isAlertDispayed();
			Assert.assertTrue(alertmessage);
			
	}
	
	
	
	
	
}

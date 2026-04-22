package testscripts;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.LogOutPage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LogOutTest extends Base

{
	@Test
public void verifytheUserIsAbleToLoginUsingValidCredentials() throws IOException
{
	String usernameValue=ExcelUtility.getStringData(1, 0, "loginpage");
	String passwordValue=ExcelUtility.getStringData(1, 1, "loginpage");
	
	LoginPage loginpage=new LoginPage(driver);  
	loginpage.enterUserName(usernameValue);
	loginpage.enterPassword(passwordValue);
	loginpage.clickOnSignIn();
	
	
	LogOutPage logoutpage= new LogOutPage(driver);
	logoutpage.ClickonAdmin();
	logoutpage.ClickonLogOut();
}
}

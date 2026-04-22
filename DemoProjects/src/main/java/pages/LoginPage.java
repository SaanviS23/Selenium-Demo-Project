package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.PageUtility;
import utilities.WaitUtility;


public class LoginPage 

{
 @FindBy(xpath="//input[@placeholder=\"Username\"]")WebElement userName;
 @FindBy(xpath="//input[@placeholder=\"Password\"]")WebElement password;
 @FindBy(xpath="//button[@class=\"btn btn-dark btn-block\"]")WebElement signin;
 @FindBy(xpath="//p[text()='Dashboard']") WebElement dashboard;
 @FindBy(xpath="//div[@class=\"alert alert-danger alert-dismissible\"]") WebElement alert;
 
 public WebDriver driver; //Making driver public to access across class
 public LoginPage(WebDriver driver)  //CONSTRUCTOR CREATED
 
 {
	this.driver=driver;
	PageFactory.initElements(driver,this);   //  PageFactory is a class -to locate webelements & initElements is a method inside PageFactory class -  used to initialize webelements.driver -local driver & this-current class instant driver
}
 
 public void enterUserName(String usernameValue)  //Methods created
 {
	 userName.sendKeys(usernameValue);
 }
 public void enterPassword(String passwordValue)
 {
	 password.sendKeys(passwordValue);
 }
 
 public void clickOnSignIn()
 {
	//WaitUtility w=new WaitUtility();
	//w.waitForElementToBeClickable(driver,signin);
			 
	 signin.click();
 }
 
  public boolean isHomePageDisplayed()   // Return result is boolean so changing from void to boolean
  
  {
	  
	  return dashboard.isDisplayed();
  }
 
  public boolean isAlertDispayed()
  
  {
	  return alert.isDisplayed();
	  
  }
  
 
 /* public void countyDropdown()                   // page utility
	{
		PageUtility pageutility=new PageUtility();
		pageutility.selectByVisibleTextMethod(country, "India");
		
	}
	*/
}

package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Login extends Base
{
	@Test
	public void validUserNameandPassword()
	{
		
		driver.navigate().to("http://groceryapp.uniqassosiates.com/admin/login");
		WebElement userName=driver.findElement(By.xpath("//input[@placeholder=\"Username\"]"));
		userName.sendKeys("admin");
		WebElement password=driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
		password.sendKeys("admin");
		WebElement signin=driver.findElement(By.xpath("//button[@class=\"btn btn-dark btn-block\"]"));
		signin.click();
		
	}
	
	@Test
	public void validUserNameandInValidPassword()
	{
		
		driver.navigate().to("http://groceryapp.uniqassosiates.com/admin/login");
		WebElement userName=driver.findElement(By.xpath("//input[@placeholder=\"Username\"]"));
		userName.sendKeys("admin");
		WebElement password=driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
		password.sendKeys("Sree");
		WebElement signin=driver.findElement(By.xpath("//button[@class=\"btn btn-dark btn-block\"]"));
		signin.click();
		
	}
	 @Test
	public void inValidUserNameandValidPassword()
	{
		
		driver.navigate().to("http://groceryapp.uniqassosiates.com/admin/login");
		WebElement userName=driver.findElement(By.xpath("//input[@placeholder=\"Username\"]"));
		userName.sendKeys("Sree");
		WebElement password=driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
		password.sendKeys("admin");
		WebElement signin=driver.findElement(By.xpath("//button[@class=\"btn btn-dark btn-block\"]"));
		signin.click();
		
	}
	
	
	@Test
	public void inValidUserNameandInValidPassword()
	{
		
		driver.navigate().to("http://groceryapp.uniqassosiates.com/admin/login");
		WebElement userName=driver.findElement(By.xpath("//input[@placeholder=\"Username\"]"));
		userName.sendKeys("Sree");
		WebElement password=driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
		password.sendKeys("Sree");
		WebElement signin=driver.findElement(By.xpath("//button[@class=\"btn btn-dark btn-block\"]"));
		signin.click();
		
	}

}

package day47;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	// constructor
	LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	// Locators
	By txt_username = By.xpath("//input[@placeholder='Username']");
	By txt_password = By.xpath("//input[@placeholder='Password']");
	By btn_login = By.xpath("//button[normalize-space()='Login']");
	
	
	// Action Methods
	void setUserName(String user)
	{
		driver.findElement(txt_username).sendKeys(user);		
	}
	
	void setPassword(String pass)
	{
		driver.findElement(txt_password).sendKeys(pass);
	}
	
	void clickLogin()
	{
		driver.findElement(btn_login).click();
	}
	
	

}

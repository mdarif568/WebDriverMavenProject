package day47;

import java.util.List;

// creating LoginPage by using PageFactory

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {
	
	WebDriver driver;
	
	// constructor
	LoginPage2(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	// Locators
	/*By txt_username = By.xpath("//input[@placeholder='Username']");
	By txt_password = By.xpath("//input[@placeholder='Password']");
	By btn_login = By.xpath("//button[normalize-space()='Login']");
	*/
	
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement txt_username;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement txt_password;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement btn_login;
	
	// How to get multiple elements without using findElements method
	@FindBy(tagName="a")
	List<WebElement> links;
	
	
	// Action Methods
	void setUserName(String user)
	{
		txt_username.sendKeys(user);		
	}
	
	void setPassword(String pass)
	{
		txt_password.sendKeys(pass);
	}
	
	void clickLogin()
	{
		btn_login.click();
	}
	
	

}

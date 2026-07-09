package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		// isDisplayed()
//		WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
//		System.out.println("Display status of logo: " +logo.isDisplayed());
		
//		boolean status = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
//		System.out.println("Display status: " + status);
		
		// isEnabled()
		boolean status  = driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
		System.out.println("Enable status: " + status);
		
		
		
		
		
		
		
		

	}

}
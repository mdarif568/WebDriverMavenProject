package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateRegularize {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://hrms.hashcashconsultants.com/employee/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Email Address']/following::input[1]")).sendKeys("arif@hashcashconsultants.com");
		driver.findElement(By.xpath("//input[@class='form-control']/following::input")).sendKeys("@1Hrms1@");
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		
		Thread.sleep(15000);
		
		driver.findElement(By.xpath("//button[text()='Verify OTP']")).click();
		
		Thread.sleep(5000);
		
		
		
		

	}

}

package day38;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTesting {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new"); // setting for headless mode of execution
		
//		WebDriver driver = new ChromeDriver(); // This will launch the browser.
		WebDriver driver = new ChromeDriver(options); // This options should pass in webdriver otherwise headless will not work.
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		System.out.println("Test Passed");
		
		
		
		

	}

}

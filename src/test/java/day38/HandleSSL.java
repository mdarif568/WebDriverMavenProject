package day38;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleSSL {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://expired.badssl.com/");
		
		System.out.println("The title of the page is: " + driver.getTitle());
		// Before adding ChromeOptions - The title of the page is: Privacy error
		// After  adding ChromeOptions - The title of the page is: expired.badssl.com
		
		
		

	}

}

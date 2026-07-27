package day38;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EnableExtensionAtRunTime {
	public static void main(String[] args) {
		
		
		ChromeOptions options = new ChromeOptions();
		File file = new File("D:\\CRX File\\uBlock-Origin.crx");
		options.addExtensions(file);
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://text-compare.com/");
		
		System.out.println("The title of the page is: " + driver.getTitle());
		
		
		
		
		
		
		
		
	}

}

package day37;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoonInZoomOut {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("document.body.style.zoom='80%'");
		Thread.sleep(2000);
		js.executeScript("document.body.style.zoom='50%'");
		Thread.sleep(2000);
		js.executeScript("document.body.style.zoom='100%'");
		
		

	}

}

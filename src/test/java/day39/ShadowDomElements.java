package day39;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomElements {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		//This Element is inside single shadow DOM.
		SearchContext shadow = driver.findElement(By.cssSelector("#userName")).getShadowRoot();
		Thread.sleep(1000);
		shadow.findElement(By.cssSelector("#kils")).sendKeys("Arif");
		
		
		
		
		
		
		
		

	}

}

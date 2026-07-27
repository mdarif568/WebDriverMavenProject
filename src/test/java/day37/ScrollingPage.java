package day37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		// 1) scroll the page by pixel number
//		js.executeScript("window.scrollBy(0, 1500);", "");
//		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		
		// 2) scroll the page till element is visible
//		WebElement ele = driver.findElement(By.xpath("//h2[normalize-space()='Scrolling DropDown']"));
//		js.executeScript("arguments[0].scrollIntoView();", ele);
//		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		// 3) scroll the page till end of the page
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		Thread.sleep(2000);
		
		// 4) scroll up to the initial position
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
		
		
		

	}

}

package day28;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Assignment
----------

https://testautomationpractice.blogspot.com/

1) provide some string search for it
2) count number of links
3) click on each link using for loop
4) get window ID's for every browser window
5) close specific browser window
 * */

public class Assingments {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@class='wikipedia-search-button']")).click();
		
		List<WebElement> allLinks = driver.findElements(By.id("//input[@class='form-check-input' and @type='checkbox']"));
//		for(String )
		
		Set<String> windowIDs = driver.getWindowHandles();
		
		for(String winId:windowIDs)
		{
			String title = driver.switchTo().window(winId).getTitle();
			
//			if(title)
			
		}

	}

}

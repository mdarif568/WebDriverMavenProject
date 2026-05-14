package day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		// name
//		driver.findElement(By.name("Email")).sendKeys("arif+payment2@hashcashconsultants.com");
		
		// id
//		driver.findElement(By.id("loginEmail")).sendKeys("arif+payment2@hashcashconsultants.com");
//		driver.findElement(By.id("loginPassword")).sendKeys("Test@1234");
		
		// linkText & partialLinkText
//		driver.findElement(By.linkText("Forgot Password?")).click();
		
		//className
//		List<WebElement> headerLinks=driver.findElements(By.className("widget-content"));
//		System.out.println("Total number of header links "+headerLinks.size());
		
		
		//tagName
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links " + links.size());
		for(WebElement x:links) 
		{
			System.out.println(x.getText()); // it will get texts on the link.
		}
		
		
		// search total number of images in a website
		 List<WebElement> images=driver.findElements(By.tagName("img"));
		 System.out.println("Total number of images are " + images.size());
		 
		

	}

}

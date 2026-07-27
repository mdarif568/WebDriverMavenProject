package day32;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch_AutoSuggestionDropdown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		/*
		
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");
		
		List<WebElement> options = driver.findElements(By.xpath("//ul[@class='G43f7e']//li//div[@role='option']"));
		for(int i=0; i<options.size(); i++)
		{
			System.out.println(options.size());
			System.out.println(options.get(i).getText());
			if(options.get(i).getText().equals("selenium"))
			{
				options.get(i).click();
				break;
			}
		}
		*/
		/*driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@class='wikipedia-search-button']")).click();
		
		List<WebElement> options =driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']//a"));
		for(int i=0; i<options.size(); i++)
		{
			String texts = options.get(i).getText();
			System.out.println(texts);
			if(texts.equalsIgnoreCase("selenium"))
			{
				options.get(i).click();
			}
		}*/
		
		// practice
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("selenium");
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		for(WebElement li:list)
		{
			System.out.println(li.getText());
		}
		
		
		
		

	}

}

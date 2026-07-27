package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*
 * Assignment
   -----------

1) Handle country dropdown with/without using Select class:
   https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/
        a) count total number of options
        b) print all the options
        c) select one option
2) Hidden dropdown
   Login to OrangeHRM --> pim --> employee status
3) https://testautomationpractice.blogspot.com/
        colors mult select box
        */
public class Assignments {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
//		driver.findElement(By.xpath("//select[@id='country-list']")).click();
		
		Thread.sleep(3000);
		// total number of options
		/*List<WebElement> options = driver.findElements(By.xpath("//select[@id='country-list']//option"));
		System.out.println(options.size());
		
		for(int i=1; i<options.size(); i++)
		{
			System.out.println(options.get(i).getText());
			if(i==4)
			{
				options.get(i).click();
			}
		}
		
		/*for(WebElement opt:options)
		{
			System.out.println(opt.getText());
		}*/
		
		List<WebElement> options = driver.findElements(By.xpath("//select[@id='colors']//option"));
		System.out.println(options.size());
		for(WebElement opt: options)
		{
			System.out.println(opt.getText());
		}
		WebElement colors = driver.findElement(By.xpath("//select[@id='colors']"));
		Select sel = new Select(colors);
		
		sel.selectByVisibleText("Blue");
		
		

	}

}

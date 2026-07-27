package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropDown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@id='menu1']")).click();
		
		//1) select single element
//		driver.findElement(By.xpath("//a[text()='JavaScript']")).click();
		
		//2) Capture all the options and find out the size
		List<WebElement> options =driver.findElements(By.xpath("//ul[@class='dropdown-menu']//a"));
		System.out.println("Number of options: " + options.size());
		
		//3) Printing options from dropdown
		/*for(int i=0; i<options.size(); i++)
		{
			System.out.println(options.get(i).getText());
		}*/
		/*
		for(WebElement opt:options)
		{
			System.out.println(opt.getText());
		}*/
		
		//4) select multiple options from dropdown
		for(WebElement op:options)
		{
			String option = op.getText();
			if(op.getText().equals("JavaScript"))
			{
				op.click();
			}
		}
		
		
		

	}

}

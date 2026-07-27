package day33;

import java.time.Duration;
//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDynamicPagination {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
//		driver.get("https://demo.opencart.com/TlbeVW/");
		driver.manage().window().maximize();
		/*
		WebElement username = driver.findElement(By.xpath("//input[@id='input-username']"));
		username.clear();
		username.sendKeys("demo");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='input-password']"));
		password.clear();
		password.sendKeys("demo");
		
		driver.findElement(By.xpath("'//button[text()=' Login']")).click();
		driver.findElement(By.xpath("//li[@id='menu-customer']//a[text()=' Customers']")).click();
		*/
		
		int pages = driver.findElements(By.xpath("//ul[@id='pagination']//li")).size();
		
		for(int p=1; p<=pages; p++)
		{
			
			if(p>1)
			{
				// capture the active page	
				WebElement active_page = driver.findElement(By.xpath("//ul[@id='pagination']//a[text()="+p+"]"));
				active_page.click();
			}
			
			// read the data from page
			int rows = driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr")).size();
			
			for(int r=1; r<=rows; r++)
			{
				String price = driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+r+"]/td[3]")).getText().replace("$", "");
				float compprice = Float.parseFloat(price);
				
				if(compprice <= 15.00)
				{
				String name = driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+r+"]/td[2]")).getText();
				String price1 = driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+r+"]/td[3]")).getText();
				driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+r+"]/td[4]/input")).click();
				System.out.println(name + "\t" + price1);
				
				}
				
			}
			
		}
		
	}

}

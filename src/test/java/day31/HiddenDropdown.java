	package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDropdown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		// clicking on PIM
		driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();
		
		//clicking on dropdown
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]/div[1]")).click();
		
		// select single option
		//driver.findElement(By.xpath("//span[normalize-space()='QA Lead']")).click();
		
		//count number of options
		List<WebElement> options = driver.findElements(By.xpath("//div[@role='listbox']//span"));
		System.out.println(options.size());
		
		/*for(int i=0; i<options.size(); i++)
		{
			System.out.println(options.get(i).getText());
		}*/
		for(WebElement opt:options)
		{
			System.out.println(opt.getText());
		}
		
	}

}

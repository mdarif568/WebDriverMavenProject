package day28;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingSpecificBrowserWindow {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.partialLinkText("OrangeHRM, I")).click();
		
		Set<String> windowIDs = driver.getWindowHandles();
		
		for(String winId:windowIDs)
		{
			String title = driver.switchTo().window(winId).getTitle();
			System.out.println(title);
			
			if(title.equals("OrangeHRM: All in One HR Software for Businesses | OrangeHRM"))
			{
				driver.close();
			}
		}

	}

}

package day36;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsAndWindows {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().window().maximize();
		
		
		driver.get("https://www.opencart.com");
		
//		driver.switchTo().newWindow(WindowType.TAB); // OPENS NEW TAB IN EXISTING WINDOW
		driver.switchTo().newWindow(WindowType.WINDOW); // OPENS NEW WINDOW
		
		driver.get("https://orangehrm.com/");
		
		driver.findElement(By.xpath("//button[text()='Book a Free Demo']")).click();
		
//		Set<String> ids = driver.getWindowHandles();
		
		List<String> ids = new ArrayList(driver.getWindowHandles());
		
		//go to first window
		driver.switchTo().window(ids.get(0));
		
		
		

	}

}

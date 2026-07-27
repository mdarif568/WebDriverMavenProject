package day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.paybito.com/");
		driver.manage().window().maximize();
		
		WebElement platform = driver.findElement(By.xpath("//a[normalize-space()='Payments']"));
		
		WebElement testManag = driver.findElement(By.xpath("//span[normalize-space()='Accept Payments Online']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(platform).moveToElement(testManag).build().perform();
		
//		act.moveToElement(testManag).click().build().perform();

	}

}

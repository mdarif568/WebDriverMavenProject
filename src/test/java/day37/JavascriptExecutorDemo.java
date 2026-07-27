package day37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// We use JavascriptExecutor when we get ElementInterceptedException

public class JavascriptExecutorDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
//		 ChromeDriver driver = new ChromeDriver();
		//if we use ChromeDriver class then we have to use JavascriptExecutor js = driver;
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement inputbox = driver.findElement(By.xpath("//input[@id='name']"));
		
		//passing the text into inputbox - alternative of sendKeys()
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		JavascriptExecutor js = driver;
		
		js.executeScript("arguments[0].setAttribute('value', 'Md')", inputbox);
		
		//clicking on element - alternative of click()
		WebElement radiobtn = driver.findElement(By.xpath("//input[@id='male']"));
		js.executeScript("arguments[0].click()", radiobtn);
		
		

	}

}

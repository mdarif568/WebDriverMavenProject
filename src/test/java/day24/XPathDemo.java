package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		// xpath with single attribute
//		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("T-shirts");
		
		// xpath with multiple attribute
//		driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("T-shirts");
		
		// xpath with 'and' operator
//		driver.findElement(By.xpath("//input[@name='search' and @placeholder='Search']")).sendKeys("Tea");
		
		// xpath with 'or' operator
//		driver.findElement(By.xpath("//input[@name='search' or @placeholder='Search']")).sendKeys("Tea");
		
		
		// xpath with text()
		driver.findElement(By.xpath("//*[text()='MacBook']")).click();
		
		boolean displayStatus = driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
		System.out.println(displayStatus);
		
		String getTextData = driver.findElement(By.xpath("//h3[text()='Featured']")).getText();
		System.out.println(getTextData);
		
		
		// xpath with contains()
		driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("T-shirts");
		
		
		// xpath with starts-with()
		driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("T-shirts");
		
		
		
		
		// chained xpath
		boolean status = driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
		System.out.println(status);
		
		
		
		
		
		

	}

}

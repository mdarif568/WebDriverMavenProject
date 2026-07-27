package day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		// Bank
		WebElement bank =driver.findElement(By.xpath("//a[normalize-space()='BANK']"));
		WebElement bankdrop = driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));
		
		WebElement drag5000 =driver.findElement(By.xpath("//section[@id='g-container-main']//li[4]//a[1]"));
		WebElement drop5000 =driver.findElement(By.xpath("//ol[@id='amt7']//li[@class='placeholder']"));
		
		act.dragAndDrop(bank, bankdrop).perform();
		act.dragAndDrop(drag5000, drop5000).perform();
		
		
		// Sales
		//
		WebElement sles =driver.findElement(By.xpath("//a[normalize-space()='SALES']"));
		WebElement slesdrop =driver.findElement(By.xpath("//ol[@id='loan']//li[@class='placeholder']"));
		
		WebElement drag5000sal =driver.findElement(By.xpath("//section[@id='g-container-main']//li[4]//a[1]"));
		WebElement drop5000sal =driver.findElement(By.xpath("//ol[@id='amt8']//li[@class='placeholder']"));
		
		act.dragAndDrop(sles, slesdrop).perform();
		act.dragAndDrop(drag5000sal, drop5000sal).perform();
		
		WebElement perfect = driver.findElement(By.xpath("//a[normalize-space()='Perfect!']"));
		boolean display = perfect.isDisplayed();
		
		if(display==true)
		{
			System.out.println(perfect.getText());
		}
		
		

	}

}

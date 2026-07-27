package day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		// frame 1
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("welcome");
		
		driver.switchTo().defaultContent();  // go back to main page
		
		// frame 2
		WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("selenium");
		
		driver.switchTo().defaultContent();  // go back to main page
		
		// frame 3
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Java");
		
		// inner iframe - part of frame 3
		driver.switchTo().frame(0);  // switching to frame using index
		
		driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']")).click();
		driver.findElement(By.xpath("//div[@id='i21']//div[@class='uHMk6b fsHoPb']")).click();
		Thread.sleep(2000);
		
		WebElement check = driver.findElement(By.xpath("//div[@id='i21']//div[@class='uHMk6b fsHoPb']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", check);
		
		driver.switchTo().defaultContent(); 
		
		
		
		
		
		
		
		
		
		

	}

}

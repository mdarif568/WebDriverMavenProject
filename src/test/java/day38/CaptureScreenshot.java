package day38;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshot {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//1) full page screenshot
		/*TakesScreenshot sc = (TakesScreenshot)driver;
		
		File sourcefile = sc.getScreenshotAs(OutputType.FILE);
		File targetfile = new File("D:\\Selenium Automation\\WebDriverMavenProject\\screenshots\\fullpage.png");
		//File targetfile = new File(System.getProperty("user.dir")+"\\screenshots\\fullpage.png");
		//System.getProperty("user.dir") will get the current file location
		sourcefile.renameTo(targetfile);
		*/
		
		//2) capture screenshot of specific section
		/*WebElement table = driver.findElement(By.xpath("//div[@id='HTML1']"));
		File sourceFile = table.getScreenshotAs(OutputType.FILE);
		File targetFile = new File(System.getProperty("user.dir")+"\\screenshots\\table.png");
		sourceFile.renameTo(targetFile);  */
		
		//3) capture screenshot of specific webelement
		WebElement icon = driver.findElement(By.xpath("//img[@class='wikipedia-icon']"));
		File sourceFile = icon.getScreenshotAs(OutputType.FILE);
		File targetFile = new File(System.getProperty("user.dir")+"\\screenshots\\logo.png");
		sourceFile.renameTo(targetFile);
		
		
		
		

	}

}

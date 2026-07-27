package day29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		//1) normal alert with Ok button
		/*driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		
		Thread.sleep(5000); // to see the changes
		
		Alert myAlert = driver.switchTo().alert();
		System.out.println(myAlert.getText());
		myAlert.accept();
		*/
		
		// 2) confirmation alert   OK and Cancel
		/*driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		
		Thread.sleep(3000);
		
		Alert confirmAlert = driver.switchTo().alert();
		
		System.out.println(confirmAlert.getText());
		
//		confirmAlert.accept();
		confirmAlert.dismiss();	
		*/
		
		// 3) prompt alert 
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("welcome");
		alert.accept();
		
		
		
		
		

	}

}

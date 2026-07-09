package day26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		//get(url) - opens the url on the browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
		//getTitle() - returns title of the page
		System.out.println(driver.getTitle());
		
		//getCurrentUrl() - returns URL of the page
		System.out.println(driver.getCurrentUrl());
		
		//getPageSource() - returns source code of the page
//		System.out.println(driver.getPageSource());
		
		//getWindowHandle() - returns ID of the single browser window
//		System.out.println(driver.getWindowHandle());  //B8ABF94255799879B6E0CDC8B9108CDC
		
		
		//getWindowHandles() - returns IDs of the multiple browser windows
		driver.findElement(By.linkText("OrangeHRM, Inc")).click(); // this will open new browser window
		Set<String> windowids = driver.getWindowHandles();
		System.out.println(windowids);//[AF1620516DE852EF598D10D0A62095FB, B2E7DAE5A08BB68E130C09F02E31CF3A]
		for(String x:windowids) 
			{
			System.out.println(x);  /*CCBAA2C5A64D75A6353A2F5050F3116C
									  08AB97E3EC9E76F54A9C10CD84802682*/
			} 
		
		
		
		
		

	}

}
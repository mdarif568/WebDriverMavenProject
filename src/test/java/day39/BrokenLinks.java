package day39;
/*
 * 1) Link		href="https://xyz.com"
	
	2) https://xyz.com ---> server ---> status code
	
	3) status code >= 400 broken link
	   status code <= 400 not broken link*/

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
//		driver.get("https://www.eddymens.com/blog/page-with-broken-pages-for-testing-53049e870421");
		driver.get("https://testautomationpractice.blogspot.com/");
		
		// capture all the link from website
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("Total number of links: " +links.size());
		
		int noOfBrokenLink = 0;
		for(WebElement linkElement:links)
		{
			String hrefAttValue = linkElement.getAttribute("href");
			if(hrefAttValue == null || hrefAttValue.isEmpty())
			{
				System.out.println("href value is null or empty. Not possible to check");
				continue;
			}
			
			// hit URL to the server
			try
			{
				URL linkURL = new URL(hrefAttValue);//converted href value from String to URL format
				HttpURLConnection conn = (HttpURLConnection)linkURL.openConnection();//open connection to the server
				conn.connect();// connect to the server and open connection to the server
				
				if(conn.getResponseCode() >= 400)
				{
					System.out.println(hrefAttValue + "====> Broken link");
					noOfBrokenLink++;
				}
				else
				{
					System.out.println(hrefAttValue + "====> Not a broken link");
				}
			}
			catch(Exception e)
			{
			}
			
		}
		System.out.println("Number of Broken links are: " + noOfBrokenLink);
		
	}

}

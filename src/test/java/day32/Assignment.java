package day32;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://blazedemo.com");
		
		WebElement from = driver.findElement(By.xpath("//select[@name='fromPort']"));
		
		Select selectFrom = new Select(from);
		selectFrom.selectByValue("Paris");
		
		WebElement To = driver.findElement(By.xpath("//select[@name='toPort']"));
		Select selectTo = new Select(To);
		selectTo.selectByValue("New York");
		
		// click on button
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		
		int rows = driver.findElements(By.xpath("//table[@class='table']//tbody//tr")).size();
		
		List<Double> prices = new ArrayList<>();
		for(int i=1; i<=rows; i++)
		{
			String prices1 = driver.findElement(By.xpath("//table[@class='table']//tr["+i+"]//td[6]")).getText().replace("$", "");
			prices.add(Double.parseDouble(prices1));
			
			
		}
		
		Collections.sort(prices);

		System.out.println(prices);
		
		double cheapestPrice = prices.get(0);
		
	}

}

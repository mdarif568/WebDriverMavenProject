package day29;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//1) select specific checkbox
//		driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		//2) select all the checkboxes
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
		/*for(int i=0; i<checkboxes.size(); i++)
		{
			checkboxes.get(i).click();
		} */
		
		/*for(WebElement checkbox:checkboxes)
		{
			checkbox.click();
		}*/
		
		//3) select last 3 checkboxes  -- My formula
		/*for(int i=checkboxes.size()-1; i>3; i--)
		{
			checkboxes.get(i).click();
		}*/
		
		// total no of checkboxes - how many boxes want to select = starting index
		// 7-3=4 (starting index)
		/*for(int i=4; i<checkboxes.size(); i++)
		{
			checkboxes.get(i).click();
		}*/
		
		//4) select first 3 checkboxes
//		for(int i=0; i<checkboxes.size()-4; i++)
		/*for(int i=0; i<3; i++)
		{
			checkboxes.get(i).click();
		}*/
		
		//5) unselect the checkboxes which are selected already
		for(int i=0; i<checkboxes.size(); i++)
		{
			if(i%2==0)
			{
				checkboxes.get(i).click();
			}
		}
		
		Thread.sleep(5000);
		
		for(int i=0; i<checkboxes.size(); i++)
		{
			if(checkboxes.get(i).isSelected())
			{
				checkboxes.get(i).click();
			}
		}
		
		
		

	}

}

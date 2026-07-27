package day36;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		/*
		// Min slider
		WebElement min_slider = driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"));
		System.out.println("Default location of the min slider: "+min_slider.getLocation());//(59, 246)=(x,y)
		act.dragAndDropBy(min_slider, 100, 246).perform();
		System.out.println("Location of the min slider after moving: "+min_slider.getLocation());//(158, 246)
		
		// Max slider
		WebElement max_slider = driver.findElement(By.xpath("//div[@class='price-range-block']//span[2]"));
		System.out.println("Default location of the max slider: "+max_slider.getLocation());//(613, 246)
		act.dragAndDropBy(max_slider, -100, 246).perform();
		System.out.println("Location of the max slider after moving: "+max_slider.getLocation());
		*/
		
		
		
		WebElement min_slider = driver.findElement(By.xpath("//div[@id='HTML7']//span[1]"));
		System.out.println(min_slider.getLocation());//(992, 2067)
		act.dragAndDropBy(min_slider, 990, 2067).perform();
		
		
		
		
		
		
		
		
		
		
	}

}

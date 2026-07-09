package day25;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAxesDemo {

	public static void main(String[] args) {
	
		        WebDriver driver = new ChromeDriver();

		        driver.get("https://money.rediff.com/gainers/bse/daily/groupa");

		     // self axis
		        driver.findElement(By.xpath("//a[contains(text(),'Star Cement')]/self::a"));

		        // parent axis
		        driver.findElement(By.xpath("//a[contains(text(),'Star Cement')]/parent::td"));

		        // child axis
		        driver.findElement(By.xpath("//table[@class='dataTable']/tbody/child::tr"));

		        // ancestor axis
		        driver.findElement(By.xpath("//a[contains(text(),'Star Cement')]/ancestor::tr"));

		        // descendant axis
		        driver.findElement(By.xpath("//table[@class='dataTable']/descendant::a"));

		        // following axis
		        driver.findElement(By.xpath("//a[contains(text(),'Star Cement')]/following::td[1]"));

		        // preceding axis
		        driver.findElement(By.xpath("//a[contains(text(),'Star Cement')]/preceding::a[1]"));

		        // following-sibling axis
		        driver.findElement(By.xpath("//a[contains(text(),'Star Cement')]/parent::td/following-sibling::td[1]"));

		     // preceding-sibling axis
//		        driver.findElement(By.xpath("//td[contains(text(),'Group')]/preceding-sibling::td[1]"));
		        
		        System.out.println("All XPath Axes executed successfully");
		   }
}

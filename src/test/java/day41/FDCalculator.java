package day41;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FDCalculator {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		
		
		String filePath = System.getProperty("user.dir") + "\\testdata\\caldata.xlsx";
		
		int rows = ExcelUtils.getRowCount(filePath, "Sheet1");
		
		for(int i=1; i<=rows; i++)
		{
			//1) read the data from excel
			
			String princ = ExcelUtils.getCellData(filePath, "Sheet1", i, 0);
			String rateOfInterest = ExcelUtils.getCellData(filePath, "Sheet1", i, 1);
			String period1 = ExcelUtils.getCellData(filePath, "Sheet1", i, 2);
			String period2 = ExcelUtils.getCellData(filePath, "Sheet1", i, 3);
			String freq = ExcelUtils.getCellData(filePath, "Sheet1", i, 4);
			String exp_mValue = ExcelUtils.getCellData(filePath, "Sheet1", i, 5);
			
			//2) pass the above data into application
			driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(princ);
			driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(rateOfInterest);
			driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(period1);
			
			Select perdrop = new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
			perdrop.selectByVisibleText(period2);
			
			Select freqdrop = new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
			freqdrop.selectByVisibleText(freq);
			
			driver.findElement(By.xpath("//div[@class='cal_div']//a[1]")).click();//clicked on calculate button
			
			//3) validation
			String act_mvalue = driver.findElement(By.xpath("//span[@id='resp_matval']")).getText();
			if(Double.parseDouble(exp_mValue) == Double.parseDouble(act_mvalue))
			{
				System.out.println("Test Passed");
				ExcelUtils.setCellData(filePath, "Sheet1", i, 7, "Passed");
			}
			else
			{
				System.out.println("Test Failed");
				ExcelUtils.setCellData(filePath, "Sheet1", i, 7, "Failed");
			}
			//click on clear button
			driver.findElement(By.xpath("//img[@class='PL5']")).click();
			Thread.sleep(2000);
		}
//		driver.quit();
		

	}

}

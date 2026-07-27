package day41;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment {

    public static void main(String[] args) throws IOException {

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");

        String filePath = System.getProperty("user.dir") + "\\testdata\\AssData.xlsx";

        int rows = ExcelUtils.getRowCount(filePath, "Sheet1");

        for (int i = 1; i <= rows; i++) {

            // Read data from Excel
            String deposit = ExcelUtils.getCellData(filePath, "Sheet1", i, 0);
            String length = ExcelUtils.getCellData(filePath, "Sheet1", i, 1);
            String rate = ExcelUtils.getCellData(filePath, "Sheet1", i, 2);
            String comp = ExcelUtils.getCellData(filePath, "Sheet1", i, 3);
            String expected = ExcelUtils.getCellData(filePath, "Sheet1", i, 4);

            // Deposit
            WebElement depositBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mat-input-0")));
            depositBox.clear();
            depositBox.sendKeys(deposit);

            // Length
            WebElement lengthBox = driver.findElement(By.id("mat-input-1"));
            lengthBox.clear();
            lengthBox.sendKeys(length);

            // APY
            WebElement rateBox = driver.findElement(By.id("mat-input-2"));
            rateBox.clear();
            rateBox.sendKeys(rate);

            // Compounding Dropdown
            driver.findElement(By.id("mat-select-value-0")).click();

            wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//span[normalize-space()='" + comp + "']")))
                    .click();

            // Calculate
//            driver.findElement(By.xpath("//button[@id='CIT-chart-submit']")).click();
            
            WebElement calculateBtn = driver.findElement(By.id("CIT-chart-submit"));

            ((JavascriptExecutor) driver)
                    .executeScript("arguments[0].scrollIntoView(true);", calculateBtn);

            new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.elementToBeClickable(calculateBtn));

            calculateBtn.click();

            // Wait for result
            WebElement result = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.id("displayTotalValue")));

            String actual = result.getText();

            // Remove $ and commas
            actual = actual.replace("$", "")
                           .replace(",", "")
                           .trim();

            expected = expected.replace("$", "")
                               .replace(",", "")
                               .trim();

            double actualValue = Double.parseDouble(actual);
            double expectedValue = Double.parseDouble(expected);

            if (Math.abs(actualValue - expectedValue) < 0.01) {
                System.out.println("Row " + i + " : PASS");
                ExcelUtils.setCellData(filePath, "Sheet1", i, 5, "PASS");
            } else {
                System.out.println("Row " + i + " : FAIL");
                ExcelUtils.setCellData(filePath, "Sheet1", i, 5, "FAIL");
            }

        }

        driver.quit();
    }
}
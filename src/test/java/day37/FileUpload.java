package day37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		
	/*	//1) single file upload - animal1.pdf
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\Md Arif\\Downloads\\animal1.pdf");
		
		// validation
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("animal1.pdf"))
		{
			System.out.println("File uploaded successfully");
		}
		else
		{
			System.out.println("File not uploaded");
		} */
		
		//2) multiple file upload
		String file1 = "C:\\Users\\Md Arif\\Downloads\\animal1.pdf";
		String file2 = "C:\\Users\\Md Arif\\Downloads\\animal2.pdf";
		
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1 + "\n" + file2);
		
		// validation 1 - number of files
		int noOfFilesUploaded = driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
		if(noOfFilesUploaded == 2)
		{
			System.out.println("All files uploaded successfully");
		}
		else 
		{
			System.out.println("Files not uploaded");
		}
		
		// Validate file names
		if((driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText()).equals("animal1.pdf") 
				&& (driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("animal2.pdf")))
		{
			System.out.println("File names matching...");
		}
		else
		{
			System.out.println("Files not matching...");
		}
		
		
		
		
		

	}

}

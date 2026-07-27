package day32;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
		//1) find all the number of rows in a table
//		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();// Number of rows: 7
////		int allrows = driver.findElements(By.tagName("tr")).size();  //Number of rows: 19-->it will not work in multiple tables
//		System.out.println("Number of rows are: "+rows);
////		System.out.println("Number of rows: "+allrows);
		
		//2) find all the number of columns in a table
//		int columns = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]/th")).size();
////		int or = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
//		int tags = driver.findElements(By.tagName("th")).size();
//		System.out.println("Number of columns are: "+columns);
//		System.out.println("Number of colums are: " + tags); // 13 --> coming from multiple tables
		
		
		//3) Read data from a specific row and columns (ex: 5th row and 1st column)
//		String bookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]/td[1]")).getText();
//		String singlerow = driver.findElement(By.xpath("//table[@name='BookTable']//tr[6]")).getText();//to get whole row
//		System.out.println(bookName); //Master In Selenium
//		System.out.println(singlerow); //Master In Java Amod JAVA 2000
		
		
		//4) Read data from all the rows and columns
		// To get table header
		/*List<WebElement> header =driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]//th"));
		for(int h=0; h<header.size(); h++)
		{
			System.out.print(header.get(h).getText() + "\t");
		}
		System.out.println();
		*/
		// To get table data
		/*for(int r=2; r<=rows; r++)
		{
			for(int c=1; c<=columns; c++)
			{
				String table = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td["+c+"]")).getText();
				System.out.print(table + "\t");
			}
			System.out.println();
		}*/
			
		// Print book names written by Mukesh
		/*int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("Number of rows: "+rows);
		for(int r=2; r<=rows; r++)
		{
			String authorName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
			
			if(authorName.equals("Mukesh"))
			{
				String bookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
				System.out.println(bookName +"\t" + authorName);
			}
		
		}*/
		
		// Get all books written by Amit
		/*int forRows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		for(int r=2; r<=forRows; r++)
		{
			String auNames=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
			if(auNames.equals("Amit"))
			{
				String bookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
				System.out.println(bookName + "\t" + auNames);
			}
		}*/
		
		
		// find total price of all the books
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		int total=0;
		for(int i=2; i<=rows; i++)
		{
			String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[4]")).getText();
			System.out.println(price);
			total = total + Integer.parseInt(price);
			
		}
		
		System.out.println("Total = "+total);
		
		

	}

}

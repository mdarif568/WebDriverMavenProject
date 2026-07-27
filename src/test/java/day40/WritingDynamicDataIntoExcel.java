package day40;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDynamicDataIntoExcel {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myFile_Dynamic.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("DynamicData");
		
//		XSSFRow row1 = sheet.createRow(0);
//			row1.createCell(0).setCellValue("Java");
//			row1.createCell(1).setCellValue(19);
//			row1.createCell(2).setCellValue("Automation");
//			
//		XSSFRow row2 = sheet.createRow(1);
//			row2.createCell(0).setCellValue("Python");
//			row2.createCell(1).setCellValue(3);
//			row2.createCell(2).setCellValue("Automation");
//			
//		XSSFRow row3 = sheet.createRow(2);
//			row3.createCell(0).setCellValue("C#");
//			row3.createCell(1).setCellValue(5);
//			row3.createCell(2).setCellValue("Automation");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of rows");
		int noOfRows = sc.nextInt();
		
		System.out.println("Enter number of columns");
		int noOfCells = sc.nextInt();
		
		for(int r=0; r<=noOfRows; r++)
		{
			XSSFRow currentRow = sheet.createRow(r);
			for(int c=0; c<noOfCells; c++)
			{
				XSSFCell cell = currentRow.createCell(c);
				cell.setCellValue(sc.next());
			}
		}
			
			workbook.write(file);  // attach workbook to the file
			workbook.close();
			file.close();
			
			
			System.out.println("File created....");
			
		
		
		
		

	}

}

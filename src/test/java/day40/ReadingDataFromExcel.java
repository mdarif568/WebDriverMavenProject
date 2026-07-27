package day40;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\data.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheet("Sheet");
		
		int noOfRows = sheet.getLastRowNum();
		int noOfCells = sheet.getRow(1).getLastCellNum();
		
		System.out.println("Total number of rows: " + noOfRows);
		System.out.println("Total number of cells: " + noOfCells +"\n");
		
		for(int r=0; r<=noOfRows; r++)
		{
			XSSFRow currentRow= sheet.getRow(r);
			for(int c=0; c<noOfCells; c++)
			{
				XSSFCell cell = currentRow.getCell(c);
				System.out.print(cell.toString() + "\t");
			}
			System.out.println();
		}
		workbook.close();
		fis.close();

	}

}

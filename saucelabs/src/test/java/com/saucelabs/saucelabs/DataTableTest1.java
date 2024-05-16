package com.saucelabs.saucelabs;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//import com.google.common.collect.Table.Cell;

public class DataTableTest1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File loc=new File("C:\\\\Users\\\\RSOQLAIN\\\\eclipse-workspace\\\\project\\\\saucelabs\\\\ExcelData\\\\Test2.xls");
		FileInputStream fis=new FileInputStream(loc);
		Workbook work =new HSSFWorkbook(fis);
		
		Sheet s=work.getSheetAt(0);
		
		int rowcount=s.getPhysicalNumberOfRows();
		for(int i=0;i<rowcount;i++)
		{Row r=s.getRow(i);
		//System.out.println();
			int cellcount=r.getPhysicalNumberOfCells();
			for(int j=0;j<cellcount;j++)
			{
				Cell c=r.getCell(j);
				String cellValue=getCellValue(c);
				System.out.print("||"+cellValue);
			}
			System.out.println();
		}
		//System.out.println();
		work.close();
		fis.close();
		
	}
		
		public static String getCellValue(Cell c)
		{
			switch(c.getCellType())
			{
			case STRING:
				return c.getStringCellValue();
			case NUMERIC:
				return String.valueOf(c.getStringCellValue());
			case BOOLEAN:
				return String.valueOf(c.getStringCellValue());
			default:
				return c.getStringCellValue();
			}
		
		
		
		
		
		
		
		
		/*File loc=new File("C:\\\\Users\\\\RSOQLAIN\\\\eclipse-workspace\\\\project\\\\saucelabs\\\\ExcelData\\\\Test2.xls");
		FileInputStream fis=new FileInputStream(loc);
		Workbook work =new HSSFWorkbook(fis);
		
		Sheet s=work.getSheetAt(0);
		//Sheet s=work.getSheet("Sheet0");
		
		//using for loop
		
		int rows=s.getLastRowNum();
		int cols=s.getRow(1).getLastCellNum();
		
		System.out.println(rows);
		System.out.println(cols);
		
		work.close();
		fis.close();*/
		
		
		
		
		
		
		
		/*File loc=new File("C:\\\\Users\\\\RSOQLAIN\\\\eclipse-workspace\\\\project\\\\saucelabs\\\\ExcelData\\\\Test3.xlsx");
		FileInputStream fis=new FileInputStream(loc);
		Workbook work =new XSSFWorkbook(fis);
		
		Sheet s=work.getSheetAt(0);
		
		String cellvalue=s.getRow(0).getCell(1).getStringCellValue();
		
		System.out.println(cellvalue);
		work.close();
		fis.close();*/
		
		
		
		
		
		
		/*File loc=new File("C:\\\\Users\\\\RSOQLAIN\\\\eclipse-workspace\\\\project\\\\saucelabs\\\\ExcelData\\\\Test3.xlsx");
		
		FileInputStream fis=new FileInputStream(loc);
		Workbook work =new XSSFWorkbook(fis);
		Sheet s=work.getSheet("TestSheet");
		Row r=s.getRow(0);
		Cell c=r.getCell(1);
        System.out.println(c);
		
		work.close();
		fis.close();*/
		
		
		
		/*File loc=new File("C:\\\\Users\\\\RSOQLAIN\\\\eclipse-workspace\\\\project\\\\saucelabs\\\\ExcelData\\\\Test2.xls");
		
		//read the input
		FileInputStream fis=new FileInputStream(loc);
		Workbook work =new HSSFWorkbook(fis);
		
		Sheet s=work.getSheet("Sheet0");
		
		//Rows
		Row r=s.getRow(0);
		
		//cells
		Cell c=r.getCell(2);
		
		System.out.println(c);
		
		work.close();
		fis.close();*/
		
        
	}

}

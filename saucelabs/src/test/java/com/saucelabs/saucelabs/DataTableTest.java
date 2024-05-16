package com.saucelabs.saucelabs;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class DataTableTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file=new File("C:\\Users\\RSOQLAIN\\eclipse-workspace\\project\\saucelabs\\ExcelData\\Test3.xlsx");
		
		FileOutputStream fos=new FileOutputStream(file);
		
		Workbook work=new XSSFWorkbook();
		
		//1st sheet
		Sheet sheet=work.createSheet("TestSheet");
		
		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("Ruvaidha");
		sheet.getRow(0).createCell(1).setCellValue("12345");
		
		//2nd Sheet
		Sheet s=work.createSheet("TestS1");
		s.createRow(0);
		s.getRow(0).createCell(0).setCellValue("Soqlaine");
		s.getRow(0).createCell(1).setCellValue("67890");
		
		work.write(fos);
		work.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*Workbook work=new HSSFWorkbook();
		//HSSFWorkbook work=new HSSFWorkbook();   or
		
		Sheet sheet=work.createSheet();
		
		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("Hello");
		sheet.getRow(0).createCell(1).setCellValue("World");
		sheet.getRow(0).createCell(2).setCellValue("Welcome");
		sheet.getRow(0).createCell(3).setCellValue("All");
		
		
		sheet.createRow(1);
		sheet.getRow(1).createCell(0).setCellValue("Capgemini");
		sheet.getRow(1).createCell(1).setCellValue("Welcome");
		sheet.getRow(1).createCell(2).setCellValue("Employee");
		
		work.write(fos);
		work.close();*/
		
		
		
		
		
 
	}

	
}

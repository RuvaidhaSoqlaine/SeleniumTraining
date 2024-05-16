package revision;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcWrt {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		FileOutputStream os=new FileOutputStream("C:\\Users\\RSOQLAIN\\Desktop\\SELENIUM\\Ex.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook();
		
		XSSFSheet sheet=wb.createSheet("Sheet1");
		
		XSSFRow row=sheet.createRow(0);
		
		row.createCell(0).setCellValue("Ruvaidha");
		row.createCell(1).setCellValue("Soqlaine");
		row.createCell(2).setCellValue("ruvaidha.soqlaine-u@gmail.com");
		
		
		wb.write(os);
		
		wb.close();
	}

}

package revision;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		FileInputStream read=new FileInputStream("C:\\Users\\RSOQLAIN\\Desktop\\SELENIUM\\Ex.xlsx");
		
		XSSFWorkbook s=new XSSFWorkbook(read);
		
		XSSFSheet sheet=s.getSheet("Sheet1");
		
		XSSFRow r=sheet.getRow(0);
		
		XSSFCell c=r.getCell(0);
		XSSFCell c1=r.getCell(1);
		
		String str=c.getStringCellValue();
		String str2=c1.getStringCellValue();

		System.out.println(str);
		System.out.println(str2);

		s.close();
	}

}

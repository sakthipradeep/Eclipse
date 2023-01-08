package testcase.testcase;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcellRead {
public static void main(String[] args) throws IOException {
	

	XSSFWorkbook book=new XSSFWorkbook("./New folder/login.xls.xlsx");
	XSSFSheet sheet=book.getSheetAt(0);

	for (int i = 0; i <=2; i++) {
		XSSFRow row= sheet.getRow(i);
	
	for (int j = 0; j <2; j++) {
		XSSFCell cell = row.getCell(j);
		String value = cell.getStringCellValue();
		System.out.println(value);
	}
	
	}

}	
	
}
/*
 * for (int i = 1; i <=2; i++) { XSSFRow row = sheet.getRow(i);
 * 
 * for (int j = 0; j <2; j++) { XSSFCell cell = row.getCell(j); String value =
 * cell.getStringCellValue(); System.out.println(value); }
 * 
 * } book.close();
 */
	
	
	
	
	
	
	
	


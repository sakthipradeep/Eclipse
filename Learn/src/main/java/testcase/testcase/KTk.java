package testcase.testcase;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class KTk {
	public static  String[][] callidata() throws IOException{
		XSSFWorkbook book=new XSSFWorkbook("./New folder/login.xls.xlsx");
		XSSFSheet sheet=book.getSheetAt(0);
		int row=sheet.getLastRowNum();
		int cell=sheet.getRow(0).getLastCellNum();
		String[][] data=new String[row][cell];
		for(int i=1;i<row;i++) {
			for(int j=0;j<cell;j++) {
				String ss=sheet.getRow(i).getCell(j).getStringCellValue();
				data[i-1][j]=ss;
			}
		}
		book.close();
		return data;
		
		
		
}}

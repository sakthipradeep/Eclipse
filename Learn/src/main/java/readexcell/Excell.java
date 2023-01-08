package readexcell;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excell {
	
	public static void main (String[]args) throws IOException{
		String location="./new/newer.xlsx";
		XSSFWorkbook book=new XSSFWorkbook(location);
		XSSFSheet sheetAt = book.getSheetAt(0);
		int lastRowNum = sheetAt.getLastRowNum();
		int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();
		short lastCellNum = sheetAt.getRow(0).getLastCellNum();
		
		
		String[][]data=new String[lastRowNum][lastCellNum];
		for (int i = 1; i <=lastRowNum ; i++) {
			XSSFRow row = sheetAt.getRow(i);
			for (int j = 0; j < lastCellNum; j++) {
				XSSFCell cell = row.getCell(j);
				DataFormatter dft=new DataFormatter();
				String formatCellValue = dft.formatCellValue(cell);
				String stringCellValue = cell.getStringCellValue();
				System.out.println(formatCellValue);
			} 
		}
		book.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	/*public static  String[][] calldata() throws IOException{
		XSSFWorkbook book=new XSSFWorkbook("./New folder/login.xls.xlsx");
		XSSFSheet sheet=book.getSheetAt(0);
		int row=sheet.getLastRowNum();
		int cell=sheet.getRow(1).getLastCellNum();
		String[][] data=new String[row][cell];
		for(int i=1;i<row;i++) {
			for(int j=0;j<cell;j++) {
				String ss=sheet.getRow(i).getCell(j).getStringCellValue();
				//data[i-1][j]=ss;
				System.out.println(ss);
			//}
	//	}
		//book.close();
		//return data;
		
			}}
		return data;
		
	}}*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*int row;
		row =sheet.getRow(0);
		int coloum = sheet.getRow(1).getLastCellNum();
		String[][]data=new String[row][coloum];
		for (int i = 1; i <=row; i++) {
			for (int j = 0; j <coloum; j++) {
				String ss=sheet.getRow(i).getCell(j).getStringCellValue();
data[i-1][j]=ss;
			}
		}
		book.close();
		return data;
		}}*/
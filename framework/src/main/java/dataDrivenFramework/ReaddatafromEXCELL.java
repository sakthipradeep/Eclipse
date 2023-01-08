package dataDrivenFramework;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ReaddatafromEXCELL {  //using apachi poi



	static String location="./excell/login.xlsx";

	/*
	 * public void Staticdataproviding() throws IOException {
	 * 
	 * XSSFWorkbook book=new XSSFWorkbook(location); XSSFSheet sheetAt =
	 * book.getSheetAt(0); for (int i = 1; i <=2; i++) { XSSFRow row =
	 * sheetAt.getRow(i); /// STATIC DATA PROVIDING for (int j = 0; j <2; j++) {
	 * XSSFCell cell = row.getCell(j); String stringCellValue =
	 * cell.getStringCellValue(); System.out.println(stringCellValue); } }
	 * book.close(); }
	 */
		

	public String[][] Dynamicdataproviding() throws IOException { XSSFWorkbook book=new
			XSSFWorkbook(location); XSSFSheet sheetAt = book.getSheetAt(0); int
			lastRowNum = sheetAt.getLastRowNum(); int physicalNumberOfRows =
			sheetAt.getPhysicalNumberOfRows(); System.err.println(physicalNumberOfRows);
			short lastCellNum = sheetAt.getRow(0).getLastCellNum(); 
			String[][]data=new String[lastRowNum][lastCellNum]; // DYNAMIC DATA for
			for(int i = 1; i<=lastRowNum ; i++) { 
				XSSFRow row = sheetAt.getRow(i); 
				for (int j = 0; j <	lastCellNum; j++) { 
					XSSFCell cell = row.getCell(j); DataFormatter dft=new
						DataFormatter(); //converting any input into a string 
						String formatCellValue = dft.formatCellValue(cell); //
						/*String stringCellValue = cell.getStringCellValue(); 
						System.out.println(formatCellValue);*/
						
						data[i-1][j]=formatCellValue;
					} }
			book.close();
			return data;
					}
	 		
	 /* @DataProvider(name="hi") 

		public static String[][] DataProviderINTEGRATIONwithExcell()  {
			XSSFWorkbook book = null;
			try {
				book = new XSSFWorkbook(location);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			XSSFSheet sheetAt = book.getSheetAt(0);
			int lastRowNum = sheetAt.getLastRowNum();
			int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();
			System.err.println(physicalNumberOfRows);
			short lastCellNum = sheetAt.getRow(0).getLastCellNum();
			String[][]data=new String[lastRowNum][lastCellNum];    // DYNAMIC DATA
			for (int i = 1; i <=lastRowNum ; i++) {
				XSSFRow row = sheetAt.getRow(i);
				for (int j = 0; j < lastCellNum; j++) {
					XSSFCell cell = row.getCell(j);
					DataFormatter dft=new DataFormatter();  //converting any input into a string
					String formatCellValue = dft.formatCellValue(cell);
					////String stringCellValue = cell.getStringCellValue();
					//System.out.println(formatCellValue);
					data[i-1][j]=formatCellValue;
				} 
			}
			try {
				book.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return data;
		}
		*/
 		
		public static void main(String[] args) throws IOException {
			
			ReaddatafromEXCELL object1=new ReaddatafromEXCELL();
			//object1.Staticdataproviding();
			object1.Dynamicdataproviding();
			//objec1
			
		}		

		
}
	

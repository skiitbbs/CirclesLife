package lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelConfig {
	
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	DataFormatter df = new DataFormatter();
	public ExcelConfig(String excelPath){
		
		//This method is going to initiate the objects present in FileInputStream and WorkBook class.
		//Initiated object is going to use to read the excel data from provided getData.
		
		try {
			File src = new File(excelPath);
			
			FileInputStream fis = new FileInputStream(src);
			
			wb = new XSSFWorkbook(fis);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} //Try catch surrounding is basically used to avoid exceptional error.
		
	}
	
	public String getData(int sheetNum, int row, int column){
		
		//This method is actually going and reading the data from excel saved in the given path and returning the value = data.
		
				sheet1 = wb.getSheetAt(sheetNum);
				String data = df.formatCellValue(sheet1.getRow(row).getCell(column));
				
		
		//String data = new BigDecimal(sheet1.getRow(row).getCell(column).getStringCellValue()).toString();
				
				return data;
	}
	
		public void WriteExcel(String excelPath) {
		
			try {
			File src = new File(excelPath);
			sheet1 = wb.getSheetAt(0);
			
			sheet1.getRow(0).createCell(1).setCellValue("Pass");
			
			FileOutputStream fout = new FileOutputStream(src);
			wb.write(fout);
			wb.close(); 
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} //Try catch surrounding is basically used to avoid exceptional error.
		
			
		}

}
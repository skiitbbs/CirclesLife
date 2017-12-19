package lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteResult {
	
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	File src;
	FileOutputStream fout;
	int count = 0;
	
	public WriteResult(String excelPath) {
		
		try {
			src = new File(excelPath);
			
			FileInputStream fis = new FileInputStream(src);
			
			wb = new XSSFWorkbook(fis);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} //Try catch surrounding is basically used to avoid exceptional error.
		
		
	}
	
	public int getcount(int count) {
		
		return count;
	}
	
	public void writeresult() {
			
			sheet1 = wb.getSheetAt(0);
			if (count==0) {
			sheet1.getRow(0).createCell(1).setCellValue("Pass");
			}
			
			else {
			sheet1.getRow(1).createCell(1).setCellValue("Fail");
			}
			try {
			fout = new FileOutputStream(src);
			wb.write(fout);
			wb.close(); 
		} catch (Exception e) {
				System.out.println(e.getMessage());
		} //Try catch surrounding is basically used to avoid exceptional error.
	
	}
}
	

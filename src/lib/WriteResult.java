package lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class WriteResult {
	
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	File src;
	FileOutputStream fout;
	int count = 0;
	public WebDriver pdriver;
	public String order;
	
	public WriteResult(String excelPath) {
		
		try {
			src = new File(excelPath);
			
			FileInputStream fis = new FileInputStream(src);
			
			wb = new XSSFWorkbook(fis);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} //Try catch surrounding is basically used to avoid exceptional error.
		
		
	}
	
	public void writeOrder(String order2) {
		
		order2 = order;
		sheet1 = wb.getSheetAt(2);
		sheet1.getRow(3).createCell(3).setCellValue(order);
		
		try {
			fout = new FileOutputStream(src);
			wb.write(fout);
			wb.close(); 
		} catch (Exception e) {
				System.out.println(e.getMessage());
		} //Try catch surrounding is basically used to avoid exceptional error.
		
		//return Order;
		
	}
	
	public void writeresult() {
			
			sheet1 = wb.getSheetAt(0);
			sheet1.getRow(0).createCell(1).setCellValue("New result 1");
			sheet1.getRow(1).createCell(1).setCellValue("Fail");
			
			try {
			fout = new FileOutputStream(src);
			wb.write(fout);
			wb.close(); 
		} catch (Exception e) {
				System.out.println(e.getMessage());
		} //Try catch surrounding is basically used to avoid exceptional error.
	
	}
}
	

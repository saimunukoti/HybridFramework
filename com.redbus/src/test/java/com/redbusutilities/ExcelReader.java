package com.redbusutilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	XSSFWorkbook wb;
	public ExcelReader() throws IOException {
		try {
		File src = new File("./TestData/Testdata.xlsx");
		FileInputStream fis = new FileInputStream(src);
		 wb = new XSSFWorkbook(fis);
		
		}
		catch(Exception e) {
			System.out.println("Not able to open Excel"+e.getMessage());
		}
		
		
	}
	
	public String getstringData(String sheetname,int row,int cell) {
		return wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
	}
	public String getstringData(int sheetindex,int row,int cell) {
		return wb.getSheetAt(sheetindex).getRow(row).getCell(cell).getStringCellValue();
	}
	public double getintData(String sheetname,int row,int cell) {
		return wb.getSheet(sheetname).getRow(row).getCell(cell).getNumericCellValue();
	}
	
}

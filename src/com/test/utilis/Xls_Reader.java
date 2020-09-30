package com.test.utilis;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xls_Reader {
	public static void main(String args[]) throws IOException{

		File path = new File("E:\\EXceL Automate\\TestNGDataProvider.xlsx");
		FileInputStream fis = new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
	

	
	int rowCount = sheet.getLastRowNum();
	
	int colmn = sheet.getRow(0).getLastCellNum();
	
	String [][] data = new String [rowCount][colmn];
	
	for (int i=0;i<rowCount;i++){
		XSSFRow row = sheet.getRow(i);
		
	for(int j=0;j<colmn;j++){
		XSSFCell cell = row.getCell(j);
		String value = cell.toString();
		data[i][j] = value;
		
	}
	}
	workbook.close();

		
	}	
		
}		



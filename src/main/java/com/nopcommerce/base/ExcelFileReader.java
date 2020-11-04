package com.nopcommerce.base;

import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelFileReader {
	public static Object[][]  value ;
	
	public static Object[][] getData(String path, String sheetname) {
		DataFormatter df = new DataFormatter();
		try {
			FileInputStream fi = new FileInputStream(path);
			XSSFWorkbook workbook = new XSSFWorkbook(fi);
			
	XSSFSheet sheet= workbook.getSheet(sheetname);
	int rowsize = sheet.getPhysicalNumberOfRows();
		int cellsize  = sheet.getRow(0).getLastCellNum();

		 value = new Object [rowsize][cellsize] ;
		
	Iterator<Row> rowiterator =	sheet.iterator();
	
int	rownum =0;
	
	while(rowiterator.hasNext()) {
	Row row =	rowiterator.next();
	
	
	
	Iterator <Cell> celliterator =row.iterator();
	int cellnum = 0;
	while(celliterator.hasNext()) {
	Cell cell=	celliterator.next();
		value [rownum][cellnum ] =df.formatCellValue(cell).trim();
		
	cellnum++;
	}
	rownum++;	
	}	
		} catch (Exception e) {
			
		}
		
	return value;	
		
		
	}

}

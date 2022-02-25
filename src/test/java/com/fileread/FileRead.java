package com.fileread;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileRead {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Bhuvana\\eclipse-workspace\\Mavenn\\Excel\\WorkBook.xlsx");	
		FileInputStream fileInputStream= new FileInputStream(file);
		Workbook workbook =new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet("Sheet1");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		System.out.println(cell);
		FileOutputStream fileOutputStream= new FileOutputStream(file);
			String stringCellValue = cell.getStringCellValue();
			byte[] bytes = stringCellValue.getBytes();
			fileOutputStream.write(bytes);
			

	}
}

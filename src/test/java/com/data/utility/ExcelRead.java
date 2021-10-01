package com.data.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead extends TestExecutor{
	
	public void readexcel() throws IOException
	{
		File f = new File("C:\\Users\\Karen Amy\\eclipse-workspace\\DataDriven\\resource\\TestDataa.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		XSSFWorkbook book = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = book.getSheet("Sheet1");
		
		int rowcount = sheet.getLastRowNum()+1; //get rowcount
		int colcount = sheet.getRow(0).getLastCellNum(); // getting col count
	//	map.put("FirstName", "Merlin");
		
		for(int i=0;i<colcount;i++)
		{
			System.out.println(formatter.formatCellValue(sheet.getRow(0).getCell(i))+"=" +formatter.formatCellValue(sheet.getRow(1).getCell(i)));
			map.put(formatter.formatCellValue(sheet.getRow(0).getCell(i)), formatter.formatCellValue(sheet.getRow(1).getCell(i)));
		}
	
		
	}
	
	public String getMapValue(String key) throws IOException
	{
		readexcel();
		return map.get(key);
	}

}

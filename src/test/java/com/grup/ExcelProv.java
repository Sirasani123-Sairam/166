package com.grup;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import  org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//import com.sai.ExcelProv;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelProv {
	
	
	//File ExcelFile=new File("/Practicefortesng/src/test/resources/Book1.xlsx");
	@DataProvider(name="sai")
	
	public  static String[][]  ExcelProvide() throws IOException {
		
		File ExcelFile =new File("C:\\Users\\siras\\eclipse-workspace\\Practicefortesng\\src\\test\\resources\\Book1.xlsx");
	FileInputStream fis=new FileInputStream(ExcelFile);
	
	XSSFWorkbook workbook=new XSSFWorkbook(fis);
	XSSFSheet sheet=workbook.getSheet("Sheet1");
	
	int rowcount=sheet.getPhysicalNumberOfRows();
	System.out.println(rowcount);
	int noofcolumns=sheet.getRow(0).getLastCellNum();
	System.out.println(noofcolumns);
	
	String[][] data=new String[rowcount-1][noofcolumns];
	for(int i=0;i<rowcount-1;i++) {
	for(int j=0;j<noofcolumns;j++) {
		
		DataFormatter df=new DataFormatter();
		data[i][j] =df.formatCellValue(sheet.getRow(i+1).getCell(j));
	}
		System.out.println();
		
	}
	workbook.close();
	fis.close();
	return data;
	

}
}

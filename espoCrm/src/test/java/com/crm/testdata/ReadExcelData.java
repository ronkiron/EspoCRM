package com.crm.testdata;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelData {
		
		public static Workbook wb;
		public static Sheet sh;
	
	public static Sheet getExlData() throws EncryptedDocumentException, InvalidFormatException, IOException{
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//com//crm//testdata//testdata.xlsx");
		
		wb = WorkbookFactory.create(fis);
		
		sh= wb.getSheet("loginData");
		
		return sh;

	}
}

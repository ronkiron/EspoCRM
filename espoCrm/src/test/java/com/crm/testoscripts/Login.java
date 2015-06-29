package com.crm.testoscripts;


import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.reusableMethods.ReusableMethods;
import com.crm.testdata.ReadExcelData;
import com.crm.testobjects.ObjRepo;

public class Login extends ReusableMethods{
	
	Properties or_prop;
	Sheet sheet;
	@Test
	public void login() throws IOException, EncryptedDocumentException, InvalidFormatException{
		
		invokeBrowser();
		
		sheet = ReadExcelData.getExlData();			
							
				String userName = sheet.getRow(1).getCell(0).getStringCellValue();				
				String passWord = sheet.getRow(1).getCell(1).getStringCellValue();					
				ReusableMethods.enterText("xpath", ObjRepo.getORProp().getProperty("login_username"), userName, driver);				
				ReusableMethods.enterText("xpath", ObjRepo.getORProp().getProperty("login_password"), passWord, driver);				
				ReusableMethods.click("xpath", ObjRepo.getORProp().getProperty("login_btn"), driver);				
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);				
				
				String title = "EspoCRM";				
				Assert.assertEquals(title, driver.getTitle());				
				System.out.println("Title verified");				
				or_prop = ObjRepo.getORProp();						
				
				boolean logoPresent = driver.findElement(By.xpath(or_prop.getProperty("logo"))).isDisplayed();				
				if (logoPresent==true) {
					
					System.out.println("Logo is present");
					
				}else{
					
					System.out.println("Logo is not present");
				}				
				driver.findElement(By.xpath(or_prop.getProperty("menu_dropdown"))).click();				
				driver.findElement(By.xpath(or_prop.getProperty("logout"))).click();				
	}
	
}

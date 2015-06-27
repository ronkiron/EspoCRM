package com.crm.testoscripts;


import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.reusableMethods.ReusableMethods;
import com.crm.testobjects.ObjRepo;

public class Login extends ReusableMethods{
	
	Properties or_prop;
	
	@Test
	public void login() throws IOException, EncryptedDocumentException, InvalidFormatException{
		
		invokeBrowser();
		
		for (int i = 0; i <=6; i++) {
			
//			String userName = ReadExcelData.getExlData().getRow(i).getStringCellValue();
			
			for (int j = 0; j <= 1; j++) {
				
//				String passWord = ReadExcelData.getExlData().getRow(i).getCell(j).getStringCellValue();
				
				ReusableMethods.enterText("xpath", ObjRepo.getORProp().getProperty("login_username"), "admin", driver);	
				
				ReusableMethods.enterText("xpath", ObjRepo.getORProp().getProperty("login_password"), "welcome1", driver);
				
				ReusableMethods.click("xpath", ObjRepo.getORProp().getProperty("login_btn"), driver);
			}
			
		}
		
	
		String title = "EspoCRM";
		
		Assert.assertEquals(title, driver.getTitle());
		
		System.out.println("Title verified");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		or_prop = ObjRepo.getORProp();
		
		boolean logoPresent = driver.findElement(By.xpath(or_prop.getProperty("logo"))).isDisplayed();
		
		if (logoPresent==true) {
			
			System.out.println("Logo is present");
			
		}else{
			
			System.out.println("Logo is not present");
		}
		
	}

}

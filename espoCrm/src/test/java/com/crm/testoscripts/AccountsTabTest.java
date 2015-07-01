package com.crm.testoscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AccountsTabTest extends Login {
	@Test
	public void accountsTabTest() throws EncryptedDocumentException, InvalidFormatException, IOException{
		login();
		click("xpath", or_prop.getProperty("accounts"),driver);
		String accounts_header = driver.findElement(By.xpath(or_prop.getProperty("header_text"))).getText();
		String actual_acc_header="Accounts";
		Assert.assertEquals(actual_acc_header, accounts_header);
		click("linktext", or_prop.getProperty("create_account"), driver);
		
		
	}
	

}

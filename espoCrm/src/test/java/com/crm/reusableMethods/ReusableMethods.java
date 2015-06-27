package com.crm.reusableMethods;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.config.Config;

public class ReusableMethods {
	public static WebDriver driver;
	public static Properties config_prop;
	
	
	public static void invokeBrowser() throws IOException{
		
		config_prop = Config.getConfigProperties();
		
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://localhost/crm");
		
	}
	
	public static void enterText(String identifiedBy, String locator, String text, WebDriver driver){
		
		if (identifiedBy.equalsIgnoreCase("id")) {
			
			driver.findElement(By.id(locator)).sendKeys(text);
			
		}else if(identifiedBy.equalsIgnoreCase("name")){
			
			driver.findElement(By.name(locator)).sendKeys(text);
			
		}else if(identifiedBy.equalsIgnoreCase("linktext")){
			
			driver.findElement(By.linkText(locator)).sendKeys(text);
		
		}else if(identifiedBy.equalsIgnoreCase("xpath")){
			
			driver.findElement(By.xpath(locator)).sendKeys(text);
		}
	}
	
	public static void click(String identifiedBy, String locator, WebDriver driver){
		
		if (identifiedBy.equalsIgnoreCase("id")) {
			
			driver.findElement(By.id(locator)).click();
			
		}else if(identifiedBy.equalsIgnoreCase("name")){
			
			driver.findElement(By.name(locator)).click();
			
		}else if(identifiedBy.equalsIgnoreCase("linktext")){
			
			driver.findElement(By.linkText(locator)).click();
		
		}else if(identifiedBy.equalsIgnoreCase("xpath")){
			
			driver.findElement(By.xpath(locator)).click();
		}
	}
}

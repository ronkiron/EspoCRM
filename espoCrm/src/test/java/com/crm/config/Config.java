package com.crm.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class Config {
	
	public static Properties getConfigProperties() throws IOException{
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\auro\\config\\config.properties");
		Properties prop = new Properties();
		prop.load(fis);
		return prop;		
	}
}

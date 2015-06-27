package com.crm.testobjects;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ObjRepo {
	
	public static Properties getORProp() throws IOException{		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\auro\\testobjects\\or.properties");
		Properties prop = new Properties();
		prop.load(fis);
		return prop;		
	}

}

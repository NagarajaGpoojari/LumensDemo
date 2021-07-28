package com.lumens.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	//Variables Initialization 
	private Properties prop ;
	
	//Init method
	public Properties init_prop() {
		
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("C:\\Users\\Nagaraj G Poojari\\git\\LumensDemo\\src\\main"
					+ "\\java\\com\\lumens\\config\\config.properties");
			prop.load(ip);
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}		
		return prop;	
	}

}

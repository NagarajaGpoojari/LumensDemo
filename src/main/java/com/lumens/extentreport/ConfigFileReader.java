package com.lumens.extentreport;

import java.util.Properties;

public class ConfigFileReader {

Properties prop=new Properties();
	
	public String getReportConfigPath() {
		String reportConfigPath = prop.getProperty("configfilepath");
		if(reportConfigPath!= null) return reportConfigPath;
		else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");
		}
}

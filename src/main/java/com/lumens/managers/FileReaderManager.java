package com.lumens.managers;

import com.lumens.managers.FileReaderManager;

public class FileReaderManager {

	//EXTENT REPORT RELATED CODE
	private static FileReaderManager fileReaderManager = new FileReaderManager();
	private static com.lumens.extentreport.ConfigFileReader configFileReader;

	private FileReaderManager() {
	}

	 public static FileReaderManager getInstance( ) {
	      return fileReaderManager;
	 }

	 public com.lumens.extentreport.ConfigFileReader getConfigReader() {
		 return (configFileReader == null) ? new com.lumens.extentreport.ConfigFileReader() : configFileReader;
	 }

}

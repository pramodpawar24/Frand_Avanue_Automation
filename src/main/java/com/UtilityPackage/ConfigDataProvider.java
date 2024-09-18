package com.UtilityPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {
	Properties pro;
	public ConfigDataProvider() throws Exception {
		String Pathconfig="C:\\Users\\hp\\eclipse-workspace\\FRAND_Avanue_Project_Staging_Version_1\\Config\\Config.Properties";
		FileInputStream file= new FileInputStream(Pathconfig);
		pro = new Properties();
		pro.load(file);
	}
    public String Staging_Url() {
    	
    	return pro.getProperty("Staging_Url");
    }
    public String Production_Url() {
    	return pro.getProperty("Production_Url");
    	
    	
    }
}

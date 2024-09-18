package com.UtilityPackage;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtendReportGenrator {
	public static ExtentReports extent;
	public static ExtentReports getReport() {
		//String file ="Index"
		//String Path = "C:\\Users\\hp\\eclipse-workspace\\FRAND_Avanue_Project_Staging_Version_demo\\Reports\\Index.html";
		String Path = "C:\\Users\\hp\\eclipse-workspace\\FRAND_Avanue_Project_Staging_Version_prood\\Reports\\Index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(Path);
		reporter.config().setDocumentTitle("FA_Automation_Test_Report");
		reporter.config().setReportName("Frand_Avanue_Automation_Test_Report");
		reporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Project_Name", "FA_Automation_Test_Report");
        extent.setSystemInfo("Browser name", "Chrome");
        extent.setSystemInfo("Version selenium", "4.8.1");
        extent.setSystemInfo("QA", "Pramod_Pawar");
        return extent;
        
        
	}

}

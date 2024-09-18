package com.UtilityPackage;

import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static WebDriver driver;
	public static ExcelDataProvider excel;
	public static ConfigDataProvider Config;
	
	@BeforeSuite
	public void BS() throws Exception {
		 Config=new ConfigDataProvider();
	}
	
	
	@BeforeMethod
	public void setup() {
		
		
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\Chrome_driver_122\\chromedriver.exe");
		
		
		//WebDriver driver=new ChromeDriver();
		
	WebDriverManager.chromedriver().setup();
	
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");

   driver = new ChromeDriver(option);
		
		//driver.get(Config.Staging_Url());
		driver.get("https://test.frandavenue.com/app_staging.php/en/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@AfterMethod
	
	public void teardown() {
		
		driver.quit();
////		if(ITestResult)
////			Library.costom_Screenshot(driver);
	}	
	

}

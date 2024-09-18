
package com.UtilityPackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import net.bytebuddy.utility.RandomString;

public class Library {
	
	      //Extent Report Class 
	public static ExtentTest test;
	
	
	         //Click method
	public static void costom_click(WebElement element, String fieldname) {
		try{
			element.click();
			test.log(Status.PASS, "clicked Successfuly..."+fieldname);
		}catch(Exception e) {
			test.log(Status.FAIL, e.getMessage());
		}
	}
    
	

	
             //sendkey method

public static void costom_sendkeys(WebElement element,String value, String fieldname ) {
	try{
		element.sendKeys(value);	
		test.log(Status.PASS, fieldname+"=Value successfully send ="+value);
	}catch(Exception e) {
		test.log(Status.FAIL, e.getMessage());
		
	}
}


            //Dropdown_Handle

public static void costom_Handale_dropdown(WebElement element, String  text) {
	try{
		Select select = new Select (element);
		select.selectByVisibleText(text);
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
}



           //Mouse_over_action_perform

public static void costom_mouseover(WebDriver driver ,WebElement element) {
	try{
		Actions act = new Actions(driver);
		act.moveToElement(element).click().build().perform();	
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
}


             //Scroll_Bar_handle
public static void costom_scroll(WebDriver driver) {		
	try{//JavascriptExecutor j=(JavascriptExecutor)driver;
		JavascriptExecutor j = (JavascriptExecutor) driver;

	j.executeScript("window.scrollBy(0,350)", "");
	
	Thread.sleep(5000);
	}catch(Exception e) {
		System.out.println(e.getMessage());
}
}


public static  Alert costom_HandleAlert(WebDriver driver) {		
	{
		Alert alt=driver.switchTo().alert();
		return alt;
	}
	
}


            //Take_screen_shot
public static void costom_Screenshot(WebDriver driver) throws IOException {
	try{
		
		
	String path="";
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src =ts.getScreenshotAs(OutputType.FILE);
	String rm = RandomString.make(5);
	File destn=new File("C:\\Users\\hp\\eclipse-workspace\\FRAND_Avanue_Project_Staging_Version_prood\\screenshot"+"\\"+rm+".png");
	FileUtils.copyFile(src, destn);			
	}catch(Exception e) {
		System.out.println(e.getMessage());
}
}

	public static  Alert costom_HandleRR(WebDriver driver) {		
		{
			String rm = RandomString.make(5);
		       System.out.println(rm);
		}
		return null;

		}


}






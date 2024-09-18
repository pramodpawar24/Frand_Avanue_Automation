package com.Test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.UtilityPackage.Baseclass;
import com.UtilityPackage.Library;
import com.pageobject.Create_Portfolio;
import com.pageobject.Home__Page_POM;

public class Create_portfolio_Test extends Baseclass {
	
	@Test
	
	public void Create_portfolio_Test() throws Exception {
		
		Create_Portfolio login=	PageFactory.initElements(driver,Create_Portfolio.class );
		
//		Library.costom_click(login.getAdvance_button(), "Adavace button");
//		Library.costom_click(login.getLink(), "Hyper_Link");
//		Thread.sleep(15000);
		Library.costom_click(login.getAccept(), "Accept_button");
		Library.costom_Screenshot(driver);
		Library.costom_sendkeys(login.getTxt_email(), "contact@frandavenue.com","Email_filed");
		Library.costom_sendkeys(login.getTxt_pass(), "Frandavenue2020!", "Password");
		Thread.sleep(35000);
	    Library.costom_click(login.getTxt_Login_Search_button(), "Search_button");
	    
	    JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,350)", "");
		 Thread.sleep(5000);
	    
		Library.costom_click(login.getYour_Porfolio(), "Your_Porfolio");
		Thread.sleep(5000);
		Library.costom_click(login.getCreate_Porfolio_button(), "Create_Porfolio_button");
		Thread.sleep(5000);
		Library.costom_sendkeys(login.getName_of_Portfolio(), "Testing_Purpose_test200", "Name_of_Portfolio");
		Thread.sleep(5000);
		
//		Library.costom_HandleRR(driver);
		
		
		Library.costom_click(login.getTechnology_dropdown(), "Technology_dropdown");
		Thread.sleep(2000);
		Library.costom_click(login.getTechnology_dropdown_Alarm_Systems(), "Alarm_Systems");
		Thread.sleep(2000);
		Library.costom_click(login.getTechnology_dropdown(), "Technology_dropdown");
		Library.costom_click(login.getTechnology_dropdown_Arcwelding(), "Technology_dropdown_Arcwelding");
		Thread.sleep(2000);
		
		JavascriptExecutor k=(JavascriptExecutor)driver;
		k.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(5000);
		Library.costom_click(login.getTechnology_dropdown(), "Technology_dropdown");
		Library.costom_click(login.getArithmeticCoding(), "ArithmeticCoding");
		Thread.sleep(2000);
		//JavascriptExecutor l=(JavascriptExecutor)driver;
		//l.executeScript("window.scrollBy(0,50)", "");
		
		Library.costom_click(login.getPatent_view_button_1(), "Patent_view_button_1");
		Thread.sleep(10000);
		Library.costom_click(login.getPatent_view_button_2(), "Patent_view_button_2");
		Thread.sleep(10000);
		//Library.costom_click(login.getPatent_view_button_3(), "Patent_view_button_3");
		Library.costom_click(login.getSelect_all(), "Select_all");
		JavascriptExecutor m=(JavascriptExecutor)driver;
		 m.executeScript("window.scrollBy(0,850)", "");
		 Thread.sleep(10000);
		 Library.costom_click(login.getNext_button(), "Next_button");
		 Thread.sleep(5000);		 
		 Library.costom_click(login.getPls_select_situation(), "pls_select_situation");
		 Thread.sleep(5000);		 
		 Library.costom_click(login.getSelect_option(), "Select_option");
		 Thread.sleep(5000);	
		 Library.costom_click(login.getClick_LP(), "Click_LP");
		 Thread.sleep(5000);	
		 Library.costom_click(login.getLP_Name_select(), "LP_Name_select");
		 Thread.sleep(5000);
		 JavascriptExecutor p=(JavascriptExecutor)driver;
		 p.executeScript("window.scrollBy(0,20250)", "");		 
		 Thread.sleep(10000);
//		 Library.costom_click(login.getSelect_file(), "select_file");
//		 Thread.sleep(10000);
		 Library.costom_click(login.getValidate(), "Validate");
		 
	}

}

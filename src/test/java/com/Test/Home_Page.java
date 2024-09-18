package com.Test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.UtilityPackage.Baseclass;
import com.UtilityPackage.Library;
import com.pageobject.Home__Page_POM;

public class Home_Page extends Baseclass {
	@Test
	public void homePageTest() throws Exception {
		
		
Home__Page_POM login=	PageFactory.initElements(driver, Home__Page_POM.class);
		
		Library.costom_click(login.getAdvance_button(), "Adavace button");
		Library.costom_click(login.getLink(), "Hyper_Link");
		Thread.sleep(2000);
		Library.costom_click(login.getAccept(), "Advance_button");
		//Library.costom_Screenshot(driver);
		Library.costom_sendkeys(login.getTxt_email(), "contact@frandavenue.com","Email_filed");
		Library.costom_sendkeys(login.getTxt_pass(), "Frandavenue2020!", "Password");
		Library.costom_scroll(driver);
		Thread.sleep(35000);
	    Library.costom_click(login.getTxt_Login_Search_button(), "Search_button");
	    
	   
	    Library.costom_click(login.getAgumented_Sep_patent(), "Augemented_SEP_Patent");
	    Library.costom_click(login.getGPP_search_button(), "3GPP__search_button");
	    JavascriptExecutor sp=(JavascriptExecutor)driver;
		sp.executeScript("window.scrollBy(0,150)", "");
		Thread.sleep(2000);
	   // Library.costom_click(login.getClose_Button(), "Close_button");
	    Library.costom_click(login.getConfirmed_to_continue(), "Confirmed_to_continue");
	    Library.costom_click(login.getSep_patent(), "SEP_Patent");
	    Library.costom_click(login.getSEP_search_button(), "SEP_Search_Patent");
	     
	     //Library.costom_click(login.getClose_Button(), "Close_button");
	    // Library.costom_click(login.getConfirmed_to_continue(), "Confirmed_to_continue");
	     Library.costom_click(login.getTxt_Portfolio(), "Portfolio"); 
	     Library.costom_click(login.getTxt_Portfolio_Search(), "Portfolio_Search");	
		Thread.sleep(5000);	
		
		Library.costom_click(login.getTxt_LP(), "Licensing_Program");
		Library.costom_click(login.getTxt_LP_Search(), "Licensing_Program_Search");

		Thread.sleep(5000);
		
		Library.costom_click(login.getTxt_member(), "Member");
		Library.costom_click(login.getTxt_member_Search(), "Member_search");
		
		Thread.sleep(5000);
	
		Library.costom_click(login.getTxt_expert(), "Expert");
		Library.costom_click(login.getTxt_Expert_search(), "Expert_search");
		Thread.sleep(5000);
		
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(5000);
		Actions act=new Actions(driver);
		act.moveToElement(login.getView_This_Profile_Expert()).click().build().perform();
	    Library.costom_scroll(driver);
	    
		Library.costom_click(login.getTxt_FRANDAVANUE_main_button(), "home_page");
//		Library.costom_sendkeys(login.getTxt_Publication_number(), "US2001046220A1", "publication no");
//		Library.costom_click(login.getPublication_Search_Button(), "publication_search_button");
//	
//	    Thread.sleep(10000);
//		
//	   JavascriptExecutor js=(JavascriptExecutor)driver;
//	   js.executeScript("window.scrollBy(0,100)", "");
//	    Thread.sleep(5000);
//	   Actions act2=new Actions(driver);
//	   act2.moveToElement(login.getView_This_Patent_button()).click().build().perform();
//	  
//	   Library.costom_click(login.getTxt_FRANDAVANUE_main_button(), "home_page");
//	   Thread.sleep(5000);
//	 	  
	   JavascriptExecutor k=(JavascriptExecutor)driver;
	   j.executeScript("window.scrollBy(0,150)", "");
	   Thread.sleep(5000);
		
		Actions act1=new Actions(driver);
		act.moveToElement(login.getInsight()).click().build().perform();;
	    Library.costom_scroll(driver);
	      	    
	    Library.costom_click(login.getTxt_FRANDAVANUE_main_button(), "home_page");
	    
	    JavascriptExecutor l=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(5000);
		
		Library.costom_click(login.getXtool_Button(), "X-Tool");
		Library.costom_click(login.getTxt_FRANDAVANUE_main_button(), "home_page");
	
	    JavascriptExecutor a=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(5000);
		
		Library.costom_click(login.getNegotiation_Terms_button(), "Negotiation_Terms_button");
		Library.costom_click(login.getTxt_FRANDAVANUE_main_button(), "home_page");
		

	    
	    JavascriptExecutor b=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(5000);
		Library.costom_click(login.getAccess_request_Button(), "Access_request_Button");
		Library.costom_click(login.getTxt_FRANDAVANUE_main_button(), "home_page");
		
	    
	    JavascriptExecutor c=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(5000);
		Library.costom_click(login.getInbox_Button(), "Inbox_Button");
		Library.costom_click(login.getTxt_FRANDAVANUE_main_button(), "home_page");

	    JavascriptExecutor d=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(5000);
		Library.costom_click(login.getTemplate_button(), "Template_button");
		Library.costom_click(login.getTxt_FRANDAVANUE_main_button(), "home_page");
		
	    
	    Thread.sleep(5000);
	    JavascriptExecutor f=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,350)", "");	
	    Thread.sleep(5000);

		Library.costom_click(login.getYour_patent_button(), "Your_patent_button");
		Library.costom_click(login.getTxt_FRANDAVANUE_main_button(), "home_page");
	    
	    Thread.sleep(5000);
	    JavascriptExecutor g=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,450)", "");
		Thread.sleep(5000);
		Library.costom_click(login.getYour_Portfolio_Button(), "Your_Portfolio_Button");

		Library.costom_click(login.getTxt_FRANDAVANUE_main_button(), "home_page");

	    
	    Thread.sleep(5000);
	    JavascriptExecutor h=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,650)", "");
		Thread.sleep(5000);
		Library.costom_click(login.getYour_Licensing_Program(), "Licensing_Program");
		Library.costom_click(login.getTxt_FRANDAVANUE_main_button(), "home_page");

	    Thread.sleep(5000);
	    JavascriptExecutor i=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,650)", "");
		Thread.sleep(5000);
		Library.costom_click(login.getYour_Save_result(), "Save_result");
		Library.costom_click(login.getTxt_FRANDAVANUE_main_button(), "home_page");
		
		
	}	
	
	

}
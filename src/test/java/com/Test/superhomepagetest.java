package com.Test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.UtilityPackage.Baseclass;
import com.UtilityPackage.Library;
import com.pageobject.superhomepagepom;

public class superhomepagetest extends Baseclass {
	
	@Test
	public void superhomepagetest1() throws Exception {
		superhomepagepom login = PageFactory.initElements(driver, superhomepagepom.class);
		
		Library.costom_click(login.getAdvance_button(), "Adavace button");
		Library.costom_click(login.getLink(), "Hyper_Link");
		Thread.sleep(15000);
		Library.costom_click(login.getAccept(), "Accept_button");
		Library.costom_Screenshot(driver);
		Library.costom_sendkeys(login.getTxt_email(), "contact@frandavenue.com","Email_filed");
		Library.costom_sendkeys(login.getTxt_pass(), "Frandavenue2020!", "Password");
		Thread.sleep(35000);
	    Library.costom_click(login.getTxt_Login_Search_button(), "Search_button");
	    Library.costom_click(login.getTxt_FRANDAVANUE_main_button(), "Super_home_page");
	    Thread.sleep(5000);
	    JavascriptExecutor j=(JavascriptExecutor)driver;
	    j.executeScript("window.scrollBy(0,750)", "");
	    Thread.sleep(5000);
	    Library.costom_click(login.getAbout_Us(), "About us");
	    Thread.sleep(5000);
	    j.executeScript("window.scrollBy(0,850)", "");
	    Thread.sleep(5000);
	    Library.costom_click(login.getContact_Us(), "contact us");
	  
	    
	    Library.costom_click(login.getTxt_FRANDAVANUE_main_button(), "home_page");
	    Library.costom_click(login.getTxt_FRANDAVANUE_main_button(), "Super_home_page");
	    j.executeScript("window.scrollBy(0,800)", "superhomepage_scroll_bar");
	    Thread.sleep(5000);
	    Library.costom_click(login.getDatabase_search(), "getDatabase_search_visitplatform");
	    Library.costom_click(login.getTxt_FRANDAVANUE_main_button(), "Super_home_page");
	    Thread.sleep(5000);
	    j.executeScript("window.scrollBy(0,1210)", "superhomepage_scroll_bar");
	    Thread.sleep(5000);
	    Library.costom_click(login.getMarketPlace_visitplatform(), "MarketPlace_visitplatform");
	    Library.costom_click(login.getTxt_FRANDAVANUE_main_button(), "Super_home_page");
	    Library.costom_click(login.getTxt_FRANDAVANUE_main_button(), "Super_home_page");
   
	    Thread.sleep(5000);    
	    j.executeScript("window.scrollBy(0,400000)", "superhomepage_scroll_bar");
	    Thread.sleep(5000);
	    Library.costom_click(login.getHome_Button(), "Home_button");
//	    Actions act4=new Actions(driver);
//		act4.moveToElement(login.getHome_Button()).click().build().perform();
	    
		
		j.executeScript("window.scrollBy(0,400000)", "superhomepage_scroll_bar");
		Thread.sleep(5000);
		 Library.costom_click(login.getAbout_us_footer(), "About_us_footer");
		 Library.costom_click(login.getTxt_FRANDAVANUE_main_button(), "Super_home_page");
		 j.executeScript("window.scrollBy(0,400000)", "superhomepage_scroll_bar");
		 
		 Thread.sleep(5000);
		 Library.costom_click(login.getFrandAvanue_Blog(), "FrandAvanue_Blog");
		 Library.costom_click(login.getTxt_FRANDAVANUE_main_button(), "Super_home_page");
		 j.executeScript("window.scrollBy(0,400000)", "superhomepage_scroll_bar");
		 
		 Thread.sleep(5000);
		 Library.costom_click(login.getMembership_Plans(), "Membership_Plans");
		 Library.costom_click(login.getTxt_FRANDAVANUE_main_button(), "Super_home_page");
		 j.executeScript("window.scrollBy(0,400000)", "superhomepage_scroll_bar");
		 
		 Thread.sleep(5000);
		 Library.costom_click(login.getExpert_Plans(), "Expert_Plans");
		 Library.costom_click(login.getTxt_FRANDAVANUE_main_button(), "Super_home_page");
		 j.executeScript("window.scrollBy(0,400000)", "superhomepage_scroll_bar");
		 
		 Thread.sleep(5000);
		 Library.costom_click(login.getFAQ(), "FAQ");
		 Library.costom_click(login.getTxt_FRANDAVANUE_main_button(), "Super_home_page");
		 j.executeScript("window.scrollBy(0,400000)", "superhomepage_scroll_bar");
		 
		 Thread.sleep(5000);
		 Library.costom_click(login.getPrivacy_Policy(), "Privacy_Policy");
		 Library.costom_click(login.getTxt_FRANDAVANUE_main_button(), "Super_home_page");
		 j.executeScript("window.scrollBy(0,400000)", "superhomepage_scroll_bar");
		 
		 Thread.sleep(5000);
		 Library.costom_click(login.getTerms_conditions(), "Terms_conditions");
		 Library.costom_click(login.getTxt_FRANDAVANUE_main_button(), "Super_home_page");
		 j.executeScript("window.scrollBy(0,400000)", "superhomepage_scroll_bar");
		 
		 Thread.sleep(5000);
		 Library.costom_click(login.getTrial_License_Conditions(), "Trial_License_Conditions");
		 Library.costom_click(login.getTxt_FRANDAVANUE_main_button(), "Super_home_page");
		 j.executeScript("window.scrollBy(0,400000)", "superhomepage_scroll_bar");
		 
		 
		 Thread.sleep(5000);
		 Library.costom_click(login.getLegal_Mentions(), "Legal Mentions");
		 Library.costom_click(login.getTxt_FRANDAVANUE_main_button(), "Super_home_page");
		 j.executeScript("window.scrollBy(0,400000)", "superhomepage_scroll_bar");
		 
	}
	

}

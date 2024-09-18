package com.Test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.UtilityPackage.Baseclass;
import com.UtilityPackage.Library;
import com.pageobject.Create_New_Time_Line_and_DRP_POM;
import com.pageobject.Create_Portfolio;

public class Create_Time_Line_and_DRP extends Baseclass{
	
	@Test
	
public void Create_Time_Line_and_DRP() throws Exception  {
		
		Create_New_Time_Line_and_DRP_POM login=	PageFactory.initElements(driver,Create_New_Time_Line_and_DRP_POM.class );
		Library.costom_click(login.getAdvance_button(), "Adavace button");
		Library.costom_click(login.getLink(), "Hyper_Link");
		Thread.sleep(15000);
		Library.costom_click(login.getAccept(), "Advance_button");
		Library.costom_Screenshot(driver);
		Library.costom_sendkeys(login.getTxt_email(), "pramodpawar1145@gmail.com","Email_filed");
		Library.costom_sendkeys(login.getTxt_pass(), "Pramod@123", "Password");
	    Library.costom_click(login.getTxt_Login_Search_button(), "Search_button");
	    
	    JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,450)", "");
		 Thread.sleep(5000);
		 Library.costom_click(login.getYour_Negotiation_Terms(), "Your_Negotiation_Terms");
		 
		 JavascriptExecutor l=(JavascriptExecutor)driver;
     	 l.executeScript("window.scrollBy(0,450)", "");
		 Thread.sleep(5000);
		 Library.costom_click(login.getDropdown(), "Dropdown");
		 Thread.sleep(5000);
		 Library.costom_click(login.getSelect_LP(), "Select_LP");
		 Thread.sleep(5000);
		 JavascriptExecutor k=(JavascriptExecutor)driver;
		 k.executeScript("window.scrollBy(0,550)", "");
		 Thread.sleep(5000);
		 Library.costom_click(login.getManage_your_Timeline(), "Manage_your_Timeline");
		 Thread.sleep(2500);
		 		 		 
		 Library.costom_sendkeys(login.getSteps1(), "4", "Steps1");
		 Thread.sleep(2500);
		 Library.costom_sendkeys(login.getSteps2(), "3", "Steps2");
		 Thread.sleep(2500);
		 Library.costom_sendkeys(login.getSteps3(), "2", "Steps3");
		 Thread.sleep(2500);
		 JavascriptExecutor o=(JavascriptExecutor)driver;
		 o.executeScript("window.scrollBy(0,750)", "");
		 Thread.sleep(2500);
		 Library.costom_click(login.getSave_button(), "Save_button");
		 Thread.sleep(7500);
		 JavascriptExecutor s=(JavascriptExecutor)driver;
		 s.executeScript("window.scrollBy(0,1200)", "");
		 Thread.sleep(7500);
		 Library.costom_click(login.getManage_your_DRP(), "Manage_your_DRP");
		 Thread.sleep(7500);		 
		 JavascriptExecutor m=(JavascriptExecutor)driver;
		 m.executeScript("window.scrollBy(0,500)", "");
		 Thread.sleep(7500);
		 Library.costom_click(login.getPreferenceDropdown_DRP1(), "PreferenceDropdown_DRP1");
		 Thread.sleep(7500);
		 Library.costom_click(login.getSelect_Arbitration(), "Select_Arbitration");
		 Thread.sleep(7500);
		 Library.costom_click(login.getPreferenceDropdown_DRP2(), "PreferenceDropdown_DRP2");
		 Thread.sleep(7500);
		 Library.costom_click(login.getSelect_Mediation(), "Select_Mediation");
		 Thread.sleep(7500);
		 Library.costom_click(login.getPreferenceDropdown_DRP3(), "PreferenceDropdown_DRP3");
		 Thread.sleep(7500);
		 Library.costom_click(login.getSelect_Courts(), "Select_Courts");
		 Thread.sleep(7500);
		 Library.costom_click(login.getSave_to_proceed(), "Save_to_proceed");
		 JavascriptExecutor n=(JavascriptExecutor)driver;
		 n.executeScript("window.scrollBy(0,500)", "");
		 
		 Thread.sleep(10500);
		 Library.costom_click(login.getPreference_1(), "Preference_1");
		 Thread.sleep(5500);
		 Library.costom_click(login.getPreference_Show(), "Preference_Show");
		 Thread.sleep(5500);
		 Library.costom_click(login.getPreference_2(), "Preference_2");
		 Thread.sleep(5500);
		 Library.costom_click(login.getPreference_Show(), "Preference_Show");
		 Thread.sleep(5500);
		 Library.costom_click(login.getPreference_3(), "Preference_3");
		 Thread.sleep(5500);
		 Library.costom_click(login.getPreference_Show(), "Preference_Show");
		 Thread.sleep(5500);
		 Library.costom_click(login.getLocation_dropdown_1(), "Location_dropdown_1");
		 Thread.sleep(5500);
		 Library.costom_click(login.getPreference_Paris(), "Preference_Paris");
		 Thread.sleep(5500);
		 Library.costom_click(login.getLocation_dropdown_1(), "Location_dropdown_1");
		 Thread.sleep(5500);
		 Library.costom_sendkeys(login.getSearch_Box(),"Paris" , "Search_Box");;
		 Thread.sleep(5500);
		 
	}
}

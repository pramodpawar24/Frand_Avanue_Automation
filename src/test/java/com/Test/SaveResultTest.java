package com.Test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.UtilityPackage.Baseclass;
import com.UtilityPackage.Library;
import com.pageobject.Profile_Page;
import com.pageobject.SaveResultPom;

public class SaveResultTest extends Baseclass {
  
	@Test
	public void SaveResultTest () throws Exception {
		SaveResultPom login=	PageFactory.initElements(driver, SaveResultPom.class);
//		Library.costom_click(login.getAdvance_button(), "Adavace button");
//		Library.costom_click(login.getLink(), "Hyper_Link");
//		Thread.sleep(15000);
		Library.costom_click(login.getAccept(), "Accept_button");
		Library.costom_Screenshot(driver);
		Library.costom_sendkeys(login.getTxt_email(), "contact@frandavenue.com","Email_filed");
		Library.costom_sendkeys(login.getTxt_pass(), "Frandavenue2020!", "Password");
		Thread.sleep(35000);
	    Library.costom_click(login.getTxt_Login_Search_button(), "Search_button");
	    Thread.sleep(5000);
	    JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,650)", "");
		 Thread.sleep(5000);
		 Library.costom_click(login.getSaveResultButton(), "SaveResultButton");
		 Thread.sleep(5000);
		 Library.costom_click(login.getViewPatent(), "ViewPatent");
		 Thread.sleep(2000);
		 Library.costom_click(login.getView_button(), "Viewbutton");
		 Library.costom_click(login.getTxt_FRANDAVANUE_main_button(), "HomePagebutton");
		 Thread.sleep(5000);
		 JavascriptExecutor k=(JavascriptExecutor)driver;
		 k.executeScript("window.scrollBy(0,650)", "");
		 Thread.sleep(5000);
		 Library.costom_click(login.getSaveResultButton(), "SaveResultButton");
		 Library.costom_click(login.getViewPortfolio(), "Viewportfolo");
		 Library.costom_click(login.getView_button(), "Viewbutton");
		 Library.costom_click(login.getTxt_FRANDAVANUE_main_button(), "HomePagebutton");
		 Thread.sleep(5000);
		 JavascriptExecutor m=(JavascriptExecutor)driver;
		 m.executeScript("window.scrollBy(0,650)", "");
		 Thread.sleep(5000);
		 Library.costom_click(login.getSaveResultButton(), "SaveResultButton");
		 Library.costom_click(login.getViewLicensingProgram(), "LicensingProgram");
		 Library.costom_click(login.getView_button(), "Viewbutton");
		 Library.costom_click(login.getTxt_FRANDAVANUE_main_button(), "HomePagebutton");
		 
		 JavascriptExecutor n=(JavascriptExecutor)driver;
		 n.executeScript("window.scrollBy(0,650)", "");
		 Thread.sleep(5000);
		 Library.costom_click(login.getSaveResultButton(), "SaveResultButton");
		 Thread.sleep(5000);
		 JavascriptExecutor a=(JavascriptExecutor)driver;
		 a.executeScript("window.scrollBy(0,2230)", "");
		 Thread.sleep(5000);
		 Library.costom_click(login.getViewMember(), "");
		 Thread.sleep(5000);
		 Library.costom_click(login.getView_button(), "Viewbutton");
		 Thread.sleep(5000);
		 Library.costom_click(login.getTxt_FRANDAVANUE_main_button(), "HomePagebutton");
		 
		 JavascriptExecutor p=(JavascriptExecutor)driver;
		 p.executeScript("window.scrollBy(0,650)", "");
		 Thread.sleep(5000);
		 Library.costom_click(login.getSaveResultButton(), "SaveResultButton");
		 Thread.sleep(5000);
		 JavascriptExecutor s=(JavascriptExecutor)driver;
		 s.executeScript("window.scrollBy(0,2200)", "");	
		 Thread.sleep(5000);
		 Library.costom_click(login.getViewExpert(), "Expert");
		 Thread.sleep(5000);
		 Library.costom_click(login.getView_button(), "Viewbutton");
		 Thread.sleep(5000);
		 
		 
		 
	}
}

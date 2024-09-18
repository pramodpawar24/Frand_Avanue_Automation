package com.Test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.UtilityPackage.Baseclass;
import com.UtilityPackage.Library;
import com.pageobject.Create_Portfolio;
import com.pageobject.Patent_DashBoard_POM;

public class Patent_dashboard_Test extends Baseclass {
	
	@Test
	public void Patent_dashboard_Test () throws Exception {
		
		Patent_DashBoard_POM login=	PageFactory.initElements(driver,Patent_DashBoard_POM.class );
		
		Library.costom_click(login.getAdvance_button(), "Adavace button");
		Library.costom_click(login.getLink(), "Hyper_Link");
		Thread.sleep(15000);
		Library.costom_click(login.getAccept(), "Advance_button");
		Library.costom_Screenshot(driver);
		Library.costom_sendkeys(login.getTxt_email(), "pramodpawar1145@gmail.com","Email_filed");
		Library.costom_sendkeys(login.getTxt_pass(), "Pramod@123", "Password");
	    Library.costom_click(login.getTxt_Login_Search_button(), "Search_button");	    
	    JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,350)", "");
		 Thread.sleep(2000);
		 Library.costom_click(login.getYourPatent(), "YourPatent");
		 Thread.sleep(2000);
		 Library.costom_click(login.getShortBy(), "ShortBy");
		 Thread.sleep(2000);
		 Library.costom_click(login.getAscendingOrder(), "AscendingOrder");
		 Thread.sleep(2000);
		 Library.costom_click(login.getShortBy(), "ShortBy");
		 Thread.sleep(2000);
		 Library.costom_click(login.getDescendingOrder(), "dscendingOrder");
		 Thread.sleep(2000);
		 Library.costom_click(login.getShortBy(), "ShortBy");
		 Thread.sleep(2000);
		 Library.costom_click(login.getFamilyAcesendingOrder(), "FamilyAcesendingOrder");
		 Thread.sleep(2000);
		 Library.costom_click(login.getShortBy(), "ShortBy");
		 Thread.sleep(2000);
		 Library.costom_click(login.getFamilydcesendingOrder(), "FamilyAcesendingOrder");
		 Thread.sleep(2000);
		 Library.costom_click(login.getShortBy(), "ShortBy");
		 Thread.sleep(2000);
		 Library.costom_click(login.getPublicationacsendingOrder(), "PublicationAcesendingOrder");
		 Thread.sleep(2000);
		 Library.costom_click(login.getShortBy(), "ShortBy");
		 Thread.sleep(2000);
		 Library.costom_click(login.getPublicationdcesendingOrder(), "PublicationdcesendingOrder");
		 Thread.sleep(2000);
		 Library.costom_click(login.getApplicationCount(), "ApplicationCount");
		 Thread.sleep(2000);
		 Library.costom_click(login.getFamilyCount(), "FamilyCount");
		 Thread.sleep(2000);
		 Library.costom_click(login.getIndivedual_record(), "Indivedual_record");
		 Thread.sleep(2000);
		 Library.costom_click(login.getAssociatedPatent(), "AssociatedPatent");
		 Thread.sleep(2000);
		 Library.costom_click(login.getTxt_FRANDAVANUE_main_button(), "home_page");
		 Thread.sleep(2000);
		 Library.costom_click(login.getYourPatent(), "YourPatent");
		 Thread.sleep(2000);
		 Library.costom_click(login.getUploadpatentdoc(), "Uploadpatentdoc");
		 Thread.sleep(2000);
		 Library.costom_click(login.getTxt_FRANDAVANUE_main_button(), "home_page");
		 Thread.sleep(2000);
		 
		 JavascriptExecutor k=(JavascriptExecutor)driver;
		 k.executeScript("window.scrollBy(0,350)", "");
	     Thread.sleep(2000);
		 Library.costom_click(login.getYourPatent(), "YourPatent");
		 Thread.sleep(2000);
		 Library.costom_click(login.getYourPatentList(), "YourPatentlist");
		 Thread.sleep(2000);
		 Library.costom_click(login.getTxt_FRANDAVANUE_main_button(), "home_page");
		 Thread.sleep(2000);
		 JavascriptExecutor l=(JavascriptExecutor)driver;
		 l.executeScript("window.scrollBy(0,350)", "");
		 Thread.sleep(2000);
		 Library.costom_click(login.getYourPatent(), "YourPatent");
		 Thread.sleep(2000);
		 Library.costom_click(login.getManageclaimchart(), "Manageclaimchart");
		 Thread.sleep(2000);
	}

}

package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.UtilityPackage.Baseclass;
import com.UtilityPackage.Library;
import com.pageobject.Create_Portfolio;
import com.pageobject.Insight_Page_Pom;

public class Insight_Page_Test extends Baseclass {
	
	@Test
	public void Insight_Page_Test() throws Exception {
		
		Insight_Page_Pom login=	PageFactory.initElements(driver,Insight_Page_Pom.class );
		
//		Library.costom_click(login.getAdvance_button(), "Adavace button");
//		Library.costom_click(login.getLink(), "Hyper_Link");
//		Thread.sleep(15000);
		Library.costom_click(login.getAccept(), "Advance_button");
		Library.costom_Screenshot(driver);
		Library.costom_sendkeys(login.getTxt_email(), "contact@frandavenue.com","Email_filed");
		Library.costom_sendkeys(login.getTxt_pass(), "Frandavenue2020!", "Password");
		Thread.sleep(35000);
	    Library.costom_click(login.getTxt_Login_Search_button(), "Search_button");
	    Thread.sleep(2000);
	    Library.costom_click(login.getInsightButton(), "InsightButton");
	    Thread.sleep(2000);
	    Library.costom_click(login.getInsigt_search_Page_Button(), "Insigt_search_Page_Button");
	    Thread.sleep(2000);
	    Library.costom_click(login.getApplication_Count(), "Applicationcount");
	    Thread.sleep(2000);
	    Library.costom_click(login.getFamily_Count(), "Family_count");
	    Thread.sleep(2000);
	    Library.costom_click(login.getIndivedal_Record(), "Individual Records");
	}

}

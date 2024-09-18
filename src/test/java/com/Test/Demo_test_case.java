package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.UtilityPackage.Baseclass;
import com.UtilityPackage.Library;
import com.pageobject.Demo_Pom;
import com.pageobject.Home__Page_POM;
import com.pageobject.Insight_Page_Pom;

public class Demo_test_case extends Baseclass {
	
	@Test
	
	public void Demo_Test() throws InterruptedException {
		
		Demo_Pom login=	PageFactory.initElements(driver,Demo_Pom.class );
		
		Library.costom_click(login.getAdvance_button(), "Adavace button");
		Library.costom_click(login.getLink(), "Hyper_Link");
		Thread.sleep(2000);
		Library.costom_click(login.getAccept(), "Advance_button");
	}

}

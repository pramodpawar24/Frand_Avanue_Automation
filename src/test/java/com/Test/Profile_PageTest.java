package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.UtilityPackage.Baseclass;
import com.UtilityPackage.Library;
import com.pageobject.Home__Page_POM;
import com.pageobject.Profile_Page;

public class Profile_PageTest extends Baseclass {
	
	@Test
	
	public void Profile_PageTest() throws Exception {
	
		Profile_Page login=	PageFactory.initElements(driver, Profile_Page.class);
	
//	Library.costom_click(login.getAdvance_button(), "Adavace button");
//	Library.costom_click(login.getLink(), "Hyper_Link");
//	Thread.sleep(15000);
	Library.costom_click(login.getAccept(), "Advance_button");
	Library.costom_Screenshot(driver);
	Library.costom_sendkeys(login.getTxt_email(), "contact@frandavenue.com","Email_filed");
	Library.costom_sendkeys(login.getTxt_pass(), "Frandavenue2020!", "Password");
	Thread.sleep(35000);
    Library.costom_click(login.getTxt_Login_Search_button(), "Search_button");
    Library.costom_click(login.getProfile_Icon_Tab(), "Profile_Icon_Tab");
    Library.costom_click(login.getProfile_button(), "Profile_button");
    Thread.sleep(5000);
    
    Library.costom_click(login.getTitle(), "Title");
   
    Library.costom_sendkeys(login.getLast_Name(), "1", "Last_name");
    Thread.sleep(2500);
    Library.costom_sendkeys(login.getFirst_Name(), "2", "First_Name");
    Thread.sleep(2500);
    
    JavascriptExecutor j=(JavascriptExecutor)driver;
	j.executeScript("window.scrollBy(0,650)", "");
	 Thread.sleep(5000);
    Library.costom_click(login.getCompany_size(), "Company_size");
    
    Thread.sleep(5000); 
    Library.costom_click(login.getCompanyaddress(), "Company_address");
    Thread.sleep(5000);
    JavascriptExecutor k=(JavascriptExecutor)driver;
	k.executeScript("window.scrollBy(0,750)", "");
	 Thread.sleep(5000);
    Library.costom_click(login.getSave_button(), "Save_button");
    
    Library.costom_click(login.getPresentation(), "Presentation");
    Library.costom_scroll(driver);
    Thread.sleep(5000);
    Library.costom_click(login.getSubscription(), "Subscription");
    Library.costom_scroll(driver);
    Thread.sleep(5000);
    Library.costom_click(login.getOrders(), "Orders");
    Library.costom_scroll(driver);
    Thread.sleep(5000);
    Library.costom_click(login.getSetting(), "Setting");
    Library.costom_scroll(driver);
    Thread.sleep(5000);       
    Library.costom_click(login.getPresentation(), "Presentation");    Thread.sleep(5000); 
    Library.costom_sendkeys(login.getPresentation_field(), "Introduce your company to FrandAvenue's Members.", "Presentation_field");
    Thread.sleep(5000); 
    
    JavascriptExecutor m=(JavascriptExecutor)driver;
	m.executeScript("window.scrollBy(0,550)", "");
	 Thread.sleep(5000); 
    Library.costom_click(login.getType_of_user(), "Type_of_user");
    Thread.sleep(5000);    
    Library.costom_click(login.getLicensor(), "Licensor");
    JavascriptExecutor l=(JavascriptExecutor)driver;
	l.executeScript("window.scrollBy(0,150)", "");
	Thread.sleep(2000);
    Library.costom_click(login.getImplementation(), "Implementation");
	
	Thread.sleep(2000);
    Library.costom_click(login.getUse_cases(), "Use_cases");
    Thread.sleep(10000);
    JavascriptExecutor n=(JavascriptExecutor)driver;
	n.executeScript("window.scrollBy(0,120)", "");
    Thread.sleep(10000);
    Library.costom_click(login.getSave_button123(), "Save_button_Prsentation");
    
    Thread.sleep(2000);
    Library.costom_click(login.getInbox(), "Inbox");
    Thread.sleep(2000);
    Library.costom_sendkeys(login.getInbox_serach(), "Researchwire", "Inbox_serach");
    Thread.sleep(2000);
    
    Library.costom_click(login.getInbox_serach_button(), "Inbox_serach_button" );
    
    Library.costom_click(login.getSend_msg_icon(), "Send_msg_icon");
    Thread.sleep(2000);
    Library.costom_sendkeys(login.getMsg_field(), "Hi aniket", "Msg_field");
    Thread.sleep(2000);
    Library.costom_click(login.getSend_button(), "Send_button");
    Thread.sleep(2000);
     Library.costom_click(login.getChat_button_icon(), "Chat_button_icon");
    JavascriptExecutor a=(JavascriptExecutor)driver;
	a.executeScript("window.scrollBy(0,1000)", "");
	Thread.sleep(2000);
	//Library.costom_click(login.getAttachment_link(), "Attachment_link");
	
	//Documentation 
	Thread.sleep(2000);
	Library.costom_click(login.getDocuments(), "Documents");
	Thread.sleep(2000);
	Library.costom_click(login.getFolder(), "Folder");
	Thread.sleep(2000);
	Library.costom_click(login.getAccessRequest(), "AccessRequest");
	Thread.sleep(2000);
	Library.costom_click(login.getAccess_request_received(), "AccessRequest_Received");
	Thread.sleep(2000);
	Library.costom_click(login.getFolder_1(), "Folder_1");
	Library.costom_click(login.getAccessRequest(), "AccessRequest");
	Library.costom_click(login.getAccess_request_received(), "AccessRequest_Received");
	Thread.sleep(2000);
	Library.costom_click(login.getFolder_2(), "Folder_2");
	Thread.sleep(2000);
	Library.costom_click(login.getAceess_request_sent(), "AccessRequestSent");
	Thread.sleep(2000);
	Library.costom_click(login.getFolder_access_request_sent(), "FolderAccessRequestSent");
	Thread.sleep(2000);
	Library.costom_click(login.getTemplate(), "Template");
	Thread.sleep(2000);
	
	JavascriptExecutor p =(JavascriptExecutor)driver;
	p.executeScript("window.scrollBy(0,320)", "");
    Thread.sleep(10000);
	
	Library.costom_click(login.getPatent_documentation(), "Patent_documentation");
	Thread.sleep(12000);
	JavascriptExecutor s=(JavascriptExecutor)driver;
	s.executeScript("window.scrollBy(0,320)", "");
	Library.costom_click(login.getSEPClaimChart(), "SEPclaimchart");
    

    
    
    
    
    
    
    
    
	}

}

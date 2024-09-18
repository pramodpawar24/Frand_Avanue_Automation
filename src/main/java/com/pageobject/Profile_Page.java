package com.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Profile_Page {
	
	@FindBy(how=How.XPATH,using="//button[@id='details-button']")
	private WebElement Advance_button;

	@FindBy(how=How.XPATH,using="//a[@id='proceed-link']")
	private WebElement link;
	
	@FindBy(how=How.XPATH,using="//a[text()='Accept']")
	private WebElement accept;
	
	@FindBy(how=How.XPATH,using="//input[@id='_username']")
	private WebElement txt_email;
	
	@FindBy(how=How.XPATH,using="//input[@id='_password']")
	private WebElement txt_pass;
	
	@FindBy(how=How.XPATH,using="//button[@type='submit'][1]")
	private WebElement txt_Login_Search_button;
	
	@FindBy(how=How.XPATH,using="(//img[@class='img-fluid'])[1]")
    private WebElement txt_FRANDAVANUE_main_button;	
	
	@FindBy(how=How.XPATH,using="//div[@class='user-avatar rounded-circle flex-shrink-0 mr-1']")
	private WebElement Profile_Icon_Tab;
	
	@FindBy(how=How.XPATH,using="(//a[@class='nav-link text-weight-medium px-1'])[1]")
	private WebElement Profile_button;
	
	@FindBy(how=How.XPATH,using="(//span[@class='text-weight-medium'])[2]")
	private WebElement Presentation;
	
	@FindBy(how=How.XPATH,using="(//span[@class='text-weight-medium'])[5]")
	private WebElement Subscription ;
	
	@FindBy(how=How.XPATH,using="(//span[@class='text-weight-medium'])[6]")
	private WebElement Orders ;
	
	@FindBy(how=How.XPATH,using="(//span[@class='text-weight-medium'])[7]")
	private WebElement setting ;
	
	@FindBy(how=How.XPATH,using="(//span[@class='select2-selection__arrow'])[1]")
	private WebElement Title ;
	
	@FindBy(how=How.XPATH,using="//li[@id='select2-user_title-result-1mj9-mrs']")
	private WebElement Title_select ;
	
	public WebElement getTitle_select() {
		return Title_select;
	}

	@FindBy(how=How.XPATH,using="//input[@id='user_lastName']")
	private WebElement Last_Name ;
	
	@FindBy(how=How.XPATH,using="//input[@id='user_firstName']")
	private WebElement First_Name ; 
	
	@FindBy(how=How.XPATH,using="//span[@id='select2-user_billingAddress_country-container']")
	private WebElement Companyaddress  ; 
	
	@FindBy(how=How.XPATH,using="(//span[@class='selection'])[2]")
	private WebElement Company_size ; 
	
	@FindBy(how=How.XPATH,using="//button[@id='smart-submit-button']")
	private WebElement Save_button ; 
	
	@FindBy(how=How.XPATH,using="//textarea[@id='user_translations_en_description']")
	private WebElement Presentation_field ; 
	
	@FindBy(how=How.XPATH,using="//span[@id='select2-user_usertype-container']")
	private WebElement Type_of_user ; 
	
	@FindBy(how=How.XPATH,using="//span[@class='select2-selection select2-selection--single']")
	private WebElement Licensor ;
	
	@FindBy(how=How.XPATH,using="//li[@id='select2-user_usertype-result-1mmx-3']")
	private WebElement Both ; 
	
	@FindBy(how=How.XPATH,using="//span[@id='select2-user_usertype-container']")
	private WebElement Licensee ;
	
	@FindBy(how=How.XPATH,using="(//ul[@class='select2-selection__rendered'])[1]")
	private WebElement Implementation ;
	
	@FindBy(how=How.XPATH,using="(//ul[@class='select2-selection__rendered'])[2]")
	private WebElement Use_cases ;
	
	@FindBy(how=How.XPATH,using="//button[@class='btn btn-primary w-25 btn-save']")
	private WebElement save_button123 ;
	
	@FindBy(how=How.XPATH,using="(//a[@class='nav-link'])[2]")
	private WebElement inbox ;
	
	@FindBy(how=How.XPATH,using="//input[@id='body']")
	private WebElement inbox_serach ;
	
	@FindBy(how=How.XPATH,using="//i[@class='icon-share']")
	private WebElement send_msg_icon ;
	
	@FindBy(how=How.XPATH,using="//textarea[@class='form-control textarea-height-md border-0']")
	private WebElement msg_field ;
	
	@FindBy(how=How.XPATH,using="//button[@class='btn btn-primary btn-sm px-2 h-100']")
	private WebElement inbox_serach_button  ;
	
	@FindBy(how=How.XPATH,using="//button[@class='btn btn-link text-blue-700 p-0 text-weight-semibold ml-1']")
	private WebElement Send_button  ;
	
	@FindBy(how=How.XPATH,using="(//i[@class='icon-comments'])[1]")
	private WebElement chat_button_icon  ;
	
	@FindBy(how=How.XPATH,using="//a[@class='collapse-opener h2 icon-close-thin flex-shrink-0 m-0 alpha-40 text-black-900']")
	private WebElement Plus_button_icon  ;
	
	@FindBy(how=How.XPATH,using="//a[@class='btn btn-primary']")
	private WebElement edit_profile_button_icon  ;
	
	@FindBy(how=How.XPATH,using="(//a[@class='text-weight-semibold text-black-400 text-primary bg-transparent'])[3]")
	private WebElement Attachment_link  ;
	
	//Documentation
	@FindBy(how=How.XPATH,using="(//a[@class='nav-link'])[3]")
	private WebElement Documents  ;
	
	@FindBy(how=How.XPATH,using="(//img[@class='folder'])[1]")
	private WebElement Folder  ;
	

	
	@FindBy(how=How.XPATH,using="//div[@class='py-0_5 px-1 accessrequest-dropdown']")
	private WebElement AccessRequest  ;
	
	@FindBy(how=How.XPATH,using="(//span[@class='text-weight-medium'])[2]")
	private WebElement access_request_received  ;
	
	@FindBy(how=How.XPATH,using="(//img[@class='folder'])[1]")
	private WebElement Folder_1  ;
	
	@FindBy(how=How.XPATH,using="(//img[@class='folder'])[2]")
	private WebElement Folder_2  ;
	
	@FindBy(how=How.XPATH,using="(//span[@class='text-weight-medium'])[3]")
	private WebElement Aceess_request_sent  ;

	@FindBy(how=How.XPATH,using="(//div[@class='text-size-md text-gray-900 same-height'])[1]")
	private WebElement Folder_access_request_sent  ;
	
	@FindBy(how=How.XPATH,using="(//div[@class='text-size-md text-gray-900 same-height'])[1]")
	private WebElement Template  ;
	
	@FindBy(how=How.XPATH,using="(//span[@class='text-weight-medium'])[5]")
	private WebElement Patent_documentation  ;
	
	@FindBy(how=How.XPATH,using="(//p[@class='text-center text-grey h6 folder-title'])[1]")
	private WebElement SEPClaimChart  ;
	
	public WebElement getAceess_request_sent() {
		return Aceess_request_sent;
	}

	

	public WebElement getFolder_access_request_sent() {
		return Folder_access_request_sent;
	}



	public WebElement getTemplate() {
		return Template;
	}

	public WebElement getPatent_documentation() {
		return Patent_documentation;
	}

	public WebElement getSEPClaimChart() {
		return SEPClaimChart;
	}

	public WebElement getDocuments() {
		return Documents;
	}

	public WebElement getFolder() {
		return Folder;
	}

	public WebElement getAccessRequest() {
		return AccessRequest;
	}

	public WebElement getAccess_request_received() {
		return access_request_received;
	}

	public WebElement getFolder_1() {
		return Folder_1;
	}

	public WebElement getFolder_2() {
		return Folder_2;
	}

	public WebElement getAttachment_link() {
		return Attachment_link;
	}

	public WebElement getPlus_button_icon() {
		return Plus_button_icon;
	}

	public WebElement getEdit_profile_button_icon() {
		return edit_profile_button_icon;
	}

	public WebElement getInbox_serach_button() {
		return inbox_serach_button;
	}

	public WebElement getSend_button() {
		return Send_button;
	}

	public WebElement getChat_button_icon() {
		return chat_button_icon;
	}

	public WebElement getSend_msg_icon() {
		return send_msg_icon;
	}

	public WebElement getInbox() {
		return inbox;
	}

	public WebElement getInbox_serach() {
		return inbox_serach;
	}

	public WebElement getMsg_field() {
		return msg_field;
	}

	public WebElement getSave_button123() {
		return save_button123;
	}

	public WebElement getImplementation() {
		return Implementation;
	}

	public WebElement getUse_cases() {
		return Use_cases;
	}

	public WebElement getType_of_user() {
		return Type_of_user;
	}

	public WebElement getLicensor() {
		return Licensor;
	}

	public WebElement getBoth() {
		return Both;
	}

	public WebElement getLicensee() {
		return Licensee;
	}

	public WebElement getCompanyaddress() {
		return Companyaddress;
	}

	public WebElement getCompany_size() {
		return Company_size;
	}

	public WebElement getPresentation_field() {
		return Presentation_field;
	}

	public WebElement getSave_button() {
		return Save_button;
	}

	public WebElement getPresentation() {
		return Presentation;
	}

	public WebElement getSubscription() {
		return Subscription;
	}

	public WebElement getTitle() {
		return Title;
	}

	public WebElement getLast_Name() {
		return Last_Name;
	}

	public WebElement getFirst_Name() {
		return First_Name;
	}

	public WebElement getOrders() {
		return Orders;
	}

	public WebElement getSetting() {
		return setting;
	}

	public WebElement getAdvance_button() {
		return Advance_button;
	}

	public WebElement getLink() {
		return link;
	}

	public WebElement getAccept() {
		return accept;
	}

	public WebElement getTxt_email() {
		return txt_email;
	}

	public WebElement getTxt_pass() {
		return txt_pass;
	}

	public WebElement getTxt_Login_Search_button() {
		return txt_Login_Search_button;
	}

	public WebElement getTxt_FRANDAVANUE_main_button() {
		return txt_FRANDAVANUE_main_button;
	}

	public WebElement getProfile_Icon_Tab() {
		return Profile_Icon_Tab;
	}

	public WebElement getProfile_button() {
		return Profile_button;
	}

	

}

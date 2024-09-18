package com.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class superhomepagepom {
   
	@FindBy(how=How.XPATH,using="//button[@id='details-button']")
	private WebElement Advance_button;

	@FindBy(how=How.XPATH,using="//a[@id='proceed-link']")
	private WebElement link;
	
	@FindBy(how=How.XPATH,using="//a[text()='Accept']")
	private WebElement accept;
	
	@FindBy(how=How.XPATH,using="//a[@class='px-1 py-1 font-weight-bold']")
	private WebElement Access_Plateform;
	
	
	public WebElement getAccess_Plateform() {
		return Access_Plateform;
	}

	@FindBy(how=How.XPATH,using="//input[@id='_username']")
	private WebElement txt_email;
	
	@FindBy(how=How.XPATH,using="//input[@id='_password']")
	private WebElement txt_pass;
	
	@FindBy(how=How.XPATH,using="//button[@type='submit'][1]")
	private WebElement txt_Login_Search_button;
	
	@FindBy(how=How.XPATH,using="(//img[@class='img-fluid'])[1]")
    private WebElement txt_FRANDAVANUE_main_button;		
	@FindBy(how=How.XPATH,using="(//p[@class='font-weight-light mb-0 f-16'])[1]")
    private WebElement About_Us;	
	
	@FindBy(how=How.XPATH,using="//p[@class='text-purple-900 font-weight-light mb-0 f-16']")
    private WebElement contact_Us;
	
	@FindBy(how=How.XPATH,using="//a[@class='visit-btn text-center text-white mt-1 mx-1']")
     WebElement database_search;
	
	@FindBy(how=How.XPATH,using="(//a[@class='visit-btn text-center text-white mt-1'])[1]")
    WebElement MarketPlace_visitplatform;
	
	@FindBy(how=How.XPATH,using="(//div[@class='visitbtn'])[3]")
    WebElement Mangement_tools_visitplatform;


	
	@FindBy(how=How.XPATH,using="(//a[@class='visit-btn text-center text-white mt-1'])[3]")
    WebElement analysis;
	
	
	@FindBy(how=How.XPATH,using="(//a[@class='visit-btn text-center text-white mt-1'])[4]")
    WebElement complince_visitplatform;
	
	@FindBy(how=How.XPATH,using="(//a[@class='visit-btn text-center text-white mt-1'])[5]")
    WebElement Service_on_demand_visitplatform;
		
	@FindBy(how=How.XPATH,using="(//button[@class='dot'])[2]")
    WebElement Youtube_button_1;

	@FindBy(how=How.XPATH,using="(//button[@class='dot'])[3]")
    WebElement Youtube_button_2;
	
	@FindBy(how=How.XPATH,using="(//button[@class='dot'])[4]")
    WebElement Youtube_button_3;
	
	@FindBy(how=How.XPATH,using="(//a[@class='link-1'])[1]")
    WebElement Home_Button ;
	
	
	@FindBy(how=How.XPATH,using="//a[text()='About us']")
    WebElement About_us_footer ;
	
	@FindBy(how=How.XPATH,using="//a[text()='The FrandAvenue Blog']")
    WebElement FrandAvanue_Blog ;
	
	@FindBy(how=How.XPATH,using="//a[text()='Membership Plans']")
    WebElement Membership_Plans ;
	
	@FindBy(how=How.XPATH,using="//a[text()='Expert Plans']")
    WebElement Expert_Plans ;
	
	@FindBy(how=How.XPATH,using="//a[text()='FAQ']")
    WebElement FAQ ;
	
	@FindBy(how=How.XPATH,using="//a[text()='Privacy Policy']")
    WebElement Privacy_Policy ;
	
	@FindBy(how=How.XPATH,using="//a[text()='Terms & Conditions']")
    WebElement Terms_conditions ;
	
	@FindBy(how=How.XPATH,using="//a[text()='Trial License Conditions']")
    WebElement Trial_License_Conditions ;
	
	@FindBy(how=How.XPATH,using="//a[text()='Legal Mentions']")
    WebElement Legal_Mentions ;
	
	
	
	public WebElement getLegal_Mentions() {
		return Legal_Mentions;
	}

	public WebElement getFAQ() {
		return FAQ;
	}

	public WebElement getPrivacy_Policy() {
		return Privacy_Policy;
	}

	public WebElement getTerms_conditions() {
		return Terms_conditions;
	}

	public WebElement getTrial_License_Conditions() {
		return Trial_License_Conditions;
	}

	public WebElement getFrandAvanue_Blog() {
		return FrandAvanue_Blog;
	}

	public WebElement getMembership_Plans() {
		return Membership_Plans;
	}

	public WebElement getExpert_Plans() {
		return Expert_Plans;
	}

	public WebElement getAbout_us_footer() {
		return About_us_footer;
	}

	public WebElement getHome_Button() {
		return Home_Button;
	}

	public WebElement getYoutube_button_2() {
		return Youtube_button_2;
	}

	public WebElement getYoutube_button_3() {
		return Youtube_button_3;
	}

	public WebElement getYoutube_button_1() {
		return Youtube_button_1;
	}

	public WebElement getMangement_tools_visitplatform() {
		return Mangement_tools_visitplatform;
	}

	public WebElement getComplince_visitplatform() {
		return complince_visitplatform;
	}

	public WebElement getAnalysis() {
		return analysis;
	}

	public WebElement getService_on_demand_visitplatform() {
		return Service_on_demand_visitplatform;
	}

	public WebElement getMarketPlace_visitplatform() {
		return MarketPlace_visitplatform;
	}

	public WebElement getDatabase_search() {
		return database_search;
	}

	public WebElement getContact_Us() {
		return contact_Us;
	}

	public WebElement getAbout_Us() {
		return About_Us;
	}

	public WebElement getTxt_FRANDAVANUE_main_button() {
		return txt_FRANDAVANUE_main_button;
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
	


}

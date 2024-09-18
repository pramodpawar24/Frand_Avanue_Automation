package com.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Create_New_Time_Line_and_DRP_POM {
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
	
	@FindBy(how=How.XPATH,using="(//a[@class='text-black'])[4]")
	private WebElement Your_Negotiation_Terms;
    
	@FindBy(how=How.XPATH,using="//span[@class='select2-selection__rendered']")
	private WebElement Dropdown;
	
	@FindBy(how=How.XPATH,using="//li[text()='Default Licensing Program']")
	private WebElement select_LP;
	
	@FindBy(how=How.XPATH,using="(//button[@ class='btn btn-primary px-4 mr-lg-2 mr-md-2'])[1]")
	private WebElement Manage_your_Timeline;
	

	@FindBy(how=How.XPATH,using="//input[@id='drpTimelineGeneratePdf_tlStepOne']")
	private WebElement Steps1;
	
	@FindBy(how=How.XPATH,using="//input[@id='drpTimelineGeneratePdf_tlStepTwo']")
	private WebElement Steps2;
	
	@FindBy(how=How.XPATH,using="//input[@id='drpTimelineGeneratePdf_tlStepThree']")
	private WebElement Steps3;
    
	@FindBy(how=How.XPATH,using="//button[@id='save_data']")
	private WebElement Save_button;
	
	@FindBy(how=How.XPATH,using="//button[@id='manage-drp']")
	private WebElement Manage_your_DRP;
	
	@FindBy(how=How.XPATH,using="(//span[@class='select2-selection__arrow'])[2]")
	private WebElement PreferenceDropdown_DRP1;
	
	@FindBy(how=How.XPATH,using="(//span[@class='select2-selection__arrow'])[3]")
	private WebElement PreferenceDropdown_DRP2;
	
	@FindBy(how=How.XPATH,using="(//span[@class='select2-selection__arrow'])[4]")
	private WebElement PreferenceDropdown_DRP3;
	
	@FindBy(how=How.XPATH,using="//li[text()='Arbitration']")
	private WebElement Select_Arbitration;
	
	@FindBy(how=How.XPATH,using="//li[text()='Mediation']")
	private WebElement Select_Mediation;
	
	@FindBy(how=How.XPATH,using="//li[text()='Courts']")
	private WebElement Select_Courts;
	
	@FindBy(how=How.XPATH,using="//span[@class='btn btn-primary customize-drp-modes']")
	private WebElement Save_to_proceed;
	
	@FindBy(how=How.XPATH,using="(//span[@class='select2-selection__arrow'])[5]")
	private WebElement Preference_1;
	
	@FindBy(how=How.XPATH,using="(//span[@class='select2-selection__arrow'])[6]")
	private WebElement Preference_2;
	
	@FindBy(how=How.XPATH,using="(//span[@class='select2-selection__arrow'])[7]")
	private WebElement Preference_3;
	
	@FindBy(how=How.XPATH,using="//li[text()='Show']")
	private WebElement Preference_Show ;
	
	
	
	@FindBy(how=How.XPATH,using="(//li[@class='select2-results__option'])[1]")
	private WebElement Preference_Paris ;
	
	@FindBy(how=How.XPATH,using="//input[@class='select2-search__field not-disclosed']")
	private WebElement Search_Box ;
	
	@FindBy(how=How.XPATH,using="(//span[@class='select2-selection select2-selection--single'])[1]")
	private WebElement Location_dropdown_1 ;
	
	
	
	public WebElement getLocation_dropdown_1() {
		return Location_dropdown_1;
	}

	public WebElement getPreference_Paris() {
		return Preference_Paris;
	}

	public WebElement getSearch_Box() {
		return Search_Box;
	}

	public WebElement getPreference_1() {
		return Preference_1;
	}

	public WebElement getPreference_2() {
		return Preference_2;
	}

	public WebElement getPreference_3() {
		return Preference_3;
	}

	public WebElement getPreference_Show() {
		return Preference_Show;
	}

	public WebElement getSave_to_proceed() {
		return Save_to_proceed;
	}

	public WebElement getSelect_Arbitration() {
		return Select_Arbitration;
	}

	public WebElement getSelect_Mediation() {
		return Select_Mediation;
	}

	public WebElement getSelect_Courts() {
		return Select_Courts;
	}

	public WebElement getPreferenceDropdown_DRP1() {
		return PreferenceDropdown_DRP1;
	}

	public WebElement getPreferenceDropdown_DRP2() {
		return PreferenceDropdown_DRP2;
	}

	public WebElement getPreferenceDropdown_DRP3() {
		return PreferenceDropdown_DRP3;
	}

	public WebElement getManage_your_DRP() {
		return Manage_your_DRP;
	}

	public WebElement getSave_button() {
		return Save_button;
	}

	public WebElement getManage_your_Timeline() {
		return Manage_your_Timeline;
	}

	public WebElement getSteps1() {
		return Steps1;
	}

	public WebElement getSteps2() {
		return Steps2;
	}

	public WebElement getSteps3() {
		return Steps3;
	}

	public WebElement getYour_Negotiation_Terms() {
		return Your_Negotiation_Terms;
	}

	public WebElement getDropdown() {
		return Dropdown;
	}

	public WebElement getSelect_LP() {
		return select_LP;
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

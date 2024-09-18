package com.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Insight_Page_Pom {
	

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
	
	@FindBy(how=How.XPATH,using="//a[text()='Insights Graphs']")
    private WebElement InsightButton;
	 
	@FindBy(how=How.XPATH,using="//a[@class='btn btn-info btn-info btn btn-primary shadow-none btn-sm insight-viewresult']")
    private WebElement SearchResultPage;
	
	@FindBy(how=How.XPATH,using="//a[@class='btn btn-info btn_insight_patent shadow-none btn-sm insight_button']")
    private WebElement Insigt_search_Page_Button;
	
	@FindBy(how=How.XPATH,using="(//input[@id='countDependencies'])[1]")
    private WebElement Application_Count;
	
	@FindBy(how=How.XPATH,using="(//input[@id='countFamilies'])[1]")
    private WebElement Family_Count;
	
	@FindBy(how=How.XPATH,using="(//input[@id='allPatents'])[1]")
    private WebElement Indivedal_Record;
	
	
   
	public WebElement getSearchResultPage() {
		return SearchResultPage;
	}

	public WebElement getInsigt_search_Page_Button() {
		return Insigt_search_Page_Button;
	}

	public WebElement getApplication_Count() {
		return Application_Count;
	}

	public WebElement getFamily_Count() {
		return Family_Count;
	}

	public WebElement getIndivedal_Record() {
		return Indivedal_Record;
	}

	public WebElement getInsightButton() {
		return InsightButton;
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
	
	

}

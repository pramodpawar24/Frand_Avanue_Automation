package com.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SaveResultPom {
	
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
	
	@FindBy(how=How.XPATH,using="//a[text()='Your Saved Results']")
	private WebElement SaveResultButton;
	
	@FindBy(how=How.XPATH,using="(//a[@class='btn btn-primary rounded px-4 mr-2'])[1]")
	private WebElement ViewPatent;
	
	@FindBy(how=How.XPATH,using="(//a[@class='btn btn-white-new btn-sm w-100'])[1]")
	private WebElement View_button;
	
	@FindBy(how=How.XPATH,using="(//a[@class='btn btn-white-new btn-sm w-100'])[2]")
	private WebElement View_buttonPortfolio;
	
	public WebElement getView_buttonPortfolio() {
		return View_buttonPortfolio;
	}

	@FindBy(how=How.XPATH,using="(//a[@id='view-favorite-data'])[3]")
	private WebElement ViewLicensingProgram;
	
	@FindBy(how=How.XPATH,using="(//a[@class='btn btn-primary rounded px-4 mr-2'])[2]")
	private WebElement ViewPortfolio;
	
	@FindBy(how=How.XPATH,using="(//a[@id='view-favorite-data'])[4]")
	private WebElement ViewMember;
	
	@FindBy(how=How.XPATH,using="(//a[@id='view-favorite-data'])[5]")
	private WebElement ViewExpert;
    
	public WebElement getViewMember() {
		return ViewMember;
	}

	public WebElement getViewExpert() {
		return ViewExpert;
	}

	public WebElement getTxt_FRANDAVANUE_main_button() {
		return txt_FRANDAVANUE_main_button;
	}

	public WebElement getView_button() {
		return View_button;
	}

	public WebElement getSaveResultButton() {
		return SaveResultButton;
	}

	public WebElement getViewPatent() {
		return ViewPatent;
	}

	public WebElement getViewLicensingProgram() {
		return ViewLicensingProgram;
	}

	public WebElement getViewPortfolio() {
		return ViewPortfolio;
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

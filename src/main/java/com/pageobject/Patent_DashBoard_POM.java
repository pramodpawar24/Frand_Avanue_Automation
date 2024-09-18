package com.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Patent_DashBoard_POM {
	
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
	
	@FindBy(how=How.XPATH,using="//a[text()='Your Patents']")
    private WebElement YourPatent;
	
	@FindBy(how=How.XPATH,using="//span[@id='select2-patentSearch_sortBy-container']")
    private WebElement ShortBy;
	
	@FindBy(how=How.XPATH,using="//li[text()='Application number ascending']")
    private WebElement AscendingOrder;
	
	@FindBy(how=How.XPATH,using="//li[text()='Application number descending']")
    private WebElement descendingOrder;
	
	@FindBy(how=How.XPATH,using="//li[text()='Family id ascending']")
    private WebElement FamilyAcesendingOrder;
	
	@FindBy(how=How.XPATH,using="//li[text()='Family id descending']")
    private WebElement FamilydcesendingOrder;
	
	@FindBy(how=How.XPATH,using="//li[text()='Publication number ascending']")
    private WebElement PublicationacsendingOrder;
	
	@FindBy(how=How.XPATH,using="//li[text()='Publication number descending']")
    private WebElement PublicationdcesendingOrder;
	
	@FindBy(how=How.XPATH,using="//input[@id='yourPatentsCountDependencies']")
    private WebElement ApplicationCount;
	
	@FindBy(how=How.XPATH,using="//span[text()='Associate patents to your account']")
    private WebElement AssociatedPatent;
	
	@FindBy(how=How.XPATH,using="//input[@id='yourPatentsCountFamilies']")
    private WebElement FamilyCount;
	
	@FindBy(how=How.XPATH,using="//input[@id='yourPatentsAllRecords']")
    private WebElement indivedual_record;
	
	@FindBy(how=How.XPATH,using="//span[text()='Uploaded patent management documents']")
    private WebElement Uploadpatentdoc;
	
	@FindBy(how=How.XPATH,using="(//div[@class='dashboardmain'])[3]")
    private WebElement YourPatentList;
	
	@FindBy(how=How.XPATH,using="(//div[@class='dashboardmain'])[4]")
    private WebElement Manageclaimchart;
	
	
	
	public WebElement getIndivedual_record() {
		return indivedual_record;
	}

	public WebElement getUploadpatentdoc() {
		return Uploadpatentdoc;
	}

	public WebElement getYourPatentList() {
		return YourPatentList;
	}

	public WebElement getManageclaimchart() {
		return Manageclaimchart;
	}

	public WebElement getAssociatedPatent() {
		return AssociatedPatent;
	}

	public WebElement getApplicationCount() {
		return ApplicationCount;
	}

	public WebElement getFamilyCount() {
		return FamilyCount;
	}

	public WebElement getFamilyAcesendingOrder() {
		return FamilyAcesendingOrder;
	}

	public WebElement getFamilydcesendingOrder() {
		return FamilydcesendingOrder;
	}

	public WebElement getPublicationacsendingOrder() {
		return PublicationacsendingOrder;
	}

	public WebElement getPublicationdcesendingOrder() {
		return PublicationdcesendingOrder;
	}

	public WebElement getYourPatent() {
		return YourPatent;
	}

	public WebElement getShortBy() {
		return ShortBy;
	}

	public WebElement getAscendingOrder() {
		return AscendingOrder;
	}

	public WebElement getDescendingOrder() {
		return descendingOrder;
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

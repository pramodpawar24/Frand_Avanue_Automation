package com.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Create_Portfolio {
	
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
	
	
	@FindBy(how=How.XPATH,using="(//a[@class='text-black'])[9]")
    private WebElement Your_Porfolio;
	
	@FindBy(how=How.XPATH,using="//img[@class='mr-1']")
    private WebElement Create_Porfolio_button;
	
	@FindBy(how=How.XPATH,using="//input[@class='form-control potfolio-name']")
    private WebElement Name_of_Portfolio;
	
	@FindBy(how=How.XPATH,using="//input[@class='select2-search__field']")
    private WebElement Technology_dropdown;
	
	@FindBy(how=How.XPATH,using="//li[text()='Alarm Systems']")
    private WebElement Technology_dropdown_Alarm_Systems;
	
	@FindBy(how=How.XPATH,using="//li[text()='Arc welding']")
    private WebElement Technology_dropdown_Arcwelding;
	
	@FindBy(how=How.XPATH,using="//li[text()='Arithmetic Coding']")
    private WebElement ArithmeticCoding;
	
	
	
	public WebElement getArithmeticCoding() {
		return ArithmeticCoding;
	}

	@FindBy(how=How.XPATH,using="(//button[@class='btn btn-block btn-sm col-md-6 new-select-button btn-info'])[1]")
    private WebElement Patent_view_button_1;
	
	@FindBy(how=How.XPATH,using="(//button[@class='btn btn-block btn-sm col-md-6 new-select-button btn-info'])[2]")
    private WebElement Patent_view_button_2;
	
	@FindBy(how=How.XPATH,using="(//button[@class='btn btn-block btn-sm col-md-6 new-select-button btn-info'])[3]")
    private WebElement Patent_view_button_3;
	
	@FindBy(how=How.XPATH,using="//button[@class='btn btn-info select-all-patent']")
    private WebElement Select_all;
	
	@FindBy(how=How.XPATH,using="//button[@id='flow-submit-next']")
    private WebElement Next_button;
	
	@FindBy(how=How.XPATH,using="//span[@class='select2-selection select2-selection--single form-control js-custom-select select-situation mb-3 form-control-sm other-textfield']")
    private WebElement pls_select_situation;
	
	@FindBy(how=How.XPATH,using="//li[text()='I wish to associate this portfolio to a licensing program'] ")
    private WebElement select_option;
	
	@FindBy(how=How.XPATH,using="(//span[@class='select2-selection__rendered'])[2] ")
    private WebElement Click_LP;
	
	@FindBy(how=How.XPATH,using="//li[text()='DEMO_Test_1'] ")
    private WebElement LP_Name_select;
	
	@FindBy(how=How.XPATH,using="//span[@class='custom-file-label-text']")
    private WebElement select_file;
	
	@FindBy(how=How.XPATH,using="//button[@id='flow-submit-next']")
    private WebElement validate;
	
	
	

	public WebElement getTechnology_dropdown_Alarm_Systems() {
		return Technology_dropdown_Alarm_Systems;
	}

	public WebElement getTechnology_dropdown_Arcwelding() {
		return Technology_dropdown_Arcwelding;
	}

	public WebElement getValidate() {
		return validate;
	}

	public WebElement getSelect_file() {
		return select_file;
	}

	public WebElement getClick_LP() {
		return Click_LP;
	}

	public WebElement getLP_Name_select() {
		return LP_Name_select;
	}

	public WebElement getNext_button() {
		return Next_button;
	}

	public WebElement getSelect_all() {
		return Select_all;
	}

	public WebElement getPls_select_situation() {
		return pls_select_situation;
	}

	public WebElement getSelect_option() {
		return select_option;
	}

	public WebElement getPatent_view_button_1() {
		return Patent_view_button_1;
	}

	public WebElement getPatent_view_button_2() {
		return Patent_view_button_2;
	}

	public WebElement getPatent_view_button_3() {
		return Patent_view_button_3;
	}

	
	
	
	
	

	
	
	public WebElement getYour_Porfolio() {
		return Your_Porfolio;
	}

	public WebElement getCreate_Porfolio_button() {
		return Create_Porfolio_button;
	}

	public WebElement getName_of_Portfolio() {
		return Name_of_Portfolio;
	}

	public WebElement getTechnology_dropdown() {
		return Technology_dropdown;
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

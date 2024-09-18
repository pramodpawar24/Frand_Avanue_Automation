package com.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Demo_Pom {
	@FindBy(how=How.XPATH,using="//button[@id='details-button']")
	private WebElement Advance_button;
	
	@FindBy(how=How.XPATH,using="//a[@id='proceed-link']")
	private WebElement link;
	
	@FindBy(how=How.XPATH,using="//a[text()='Accept']")
	private WebElement accept;
	

	public WebElement getLink() {
		return link;
	}


	public WebElement getAccept() {
		return accept;
	}


	public WebElement getAdvance_button() {
		return Advance_button;
	}

	

	

}

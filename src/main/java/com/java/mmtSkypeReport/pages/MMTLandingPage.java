package com.java.mmtSkypeReport.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.java.mmtSkypeReport.base.TestBase;

public class MMTLandingPage extends TestBase{
	
	@FindBy(id = "ch_login_icon")
	WebElement login_Lnk;
	
	@FindBy(id = "ch_login_email")
	WebElement email_feild;
	
	@FindBy(id = "ch_login_password")
	WebElement password_feild;
	
	@FindBy(id = "ch_login_btn")
	WebElement login_btn;
	
	public MMTLandingPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnLoginLink() {
		login_Lnk.click();
	}
	
	public void enterEmailId(String username) {
		email_feild.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		password_feild.sendKeys(password);
	}
	
	public void clickOnLoginButton() {
		login_btn.click();	
	}
	
	public HomePage login(String username,String password) {
		clickOnLoginLink();
		enterEmailId(username);
		enterPassword(password);
		clickOnLoginButton();
		return new HomePage();
	}
}

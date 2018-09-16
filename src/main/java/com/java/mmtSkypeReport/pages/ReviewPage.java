package com.java.mmtSkypeReport.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.java.mmtSkypeReport.base.TestBase;

public class ReviewPage extends TestBase {
	@FindBy(id= "continueToReview")
	WebElement continue_Btn;
	
	public ReviewPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnContinueBtn() {
//		waitObj.until(ExpectedConditions.elementToBeClickable(continue_Btn));
		continue_Btn.click();
	}
}

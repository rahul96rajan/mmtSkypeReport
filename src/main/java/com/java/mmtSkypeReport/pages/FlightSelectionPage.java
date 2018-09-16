package com.java.mmtSkypeReport.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.java.mmtSkypeReport.base.TestBase;

public class FlightSelectionPage extends TestBase {
	@FindBy(xpath = "//a[text()='Book']")
	List<WebElement> allBookLinksInAscending;
	
	public FlightSelectionPage() {
		PageFactory.initElements(driver, this);
	}
	
	public ReviewPage clickOnFirstLink() {
		allBookLinksInAscending.get(0).click();
		return new ReviewPage();
	}
}

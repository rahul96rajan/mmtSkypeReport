package com.java.mmtSkypeReport.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.java.mmtSkypeReport.base.TestBase;
import com.java.mmtSkypeReport.pages.FlightSelectionPage;
import com.java.mmtSkypeReport.pages.HomePage;
import com.java.mmtSkypeReport.pages.MMTLandingPage;
import com.java.mmtSkypeReport.pages.ReviewPage;

public class TestReviewPage extends TestBase{
	MMTLandingPage landing;
	HomePage homePage;
	FlightSelectionPage flightPage;
	ReviewPage reviewPage;
	
	TestReviewPage(){
		super();
	}
	
	@BeforeClass
	public void setUp() {
		initialization();
		landing = new MMTLandingPage();
		homePage = landing.login(prop.getProperty("email_id"), prop.getProperty("password"));
		homePage.selectFromToDepartAndDate(prop.getProperty("from_location_code"), prop.getProperty("to_location_code"),
				prop.getProperty("depart_month_numerics"), prop.getProperty("depart_date_numerics"));
		flightPage = homePage.clickOnSearchButton();
		reviewPage = flightPage.clickOnFirstLink();
	}
	
	@Test
	public void Test_5_testClickOnContinueBtn() {
		reviewPage.clickOnContinueBtn();
	}
}

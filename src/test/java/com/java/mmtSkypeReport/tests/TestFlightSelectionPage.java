package com.java.mmtSkypeReport.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.java.mmtSkypeReport.base.TestBase;
import com.java.mmtSkypeReport.pages.FlightSelectionPage;
import com.java.mmtSkypeReport.pages.HomePage;
import com.java.mmtSkypeReport.pages.MMTLandingPage;

public class TestFlightSelectionPage extends TestBase {
	MMTLandingPage landing;
	HomePage homePage;
	FlightSelectionPage flightPage;
	
	TestFlightSelectionPage(){
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
	}
	
	@Test
	public void Test_4_testClickOnFirstLink() {
		flightPage.clickOnFirstLink();
	}
}

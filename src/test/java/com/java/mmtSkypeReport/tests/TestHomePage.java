package com.java.mmtSkypeReport.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.java.mmtSkypeReport.base.TestBase;
import com.java.mmtSkypeReport.pages.HomePage;
import com.java.mmtSkypeReport.pages.MMTLandingPage;

public class TestHomePage extends TestBase{
	
	MMTLandingPage landing;
	HomePage homePage;
	
	TestHomePage(){
		super();
	}
	
	@BeforeClass
	public void setUp() {
		initialization();
		landing = new MMTLandingPage();
		homePage = landing.login(prop.getProperty("email_id"), prop.getProperty("password"));
	}
	
	@Test
	public void Test_2_testSelectFromToDepartAndSearch() {
		boolean result = homePage.selectFromToDepartAndDate(prop.getProperty("from_location_code"), prop.getProperty("to_location_code"),
				prop.getProperty("depart_month_numerics"), prop.getProperty("depart_date_numerics"));
		Assert.assertTrue(result, "The Date provided is invalid as element is not displayed.");
	}

	@Test(dependsOnMethods="Test_2_testSelectFromToDepartAndSearch")
	public void Test_3_testClickOnSearch() {
		homePage.clickOnSearchButton();
	}
}

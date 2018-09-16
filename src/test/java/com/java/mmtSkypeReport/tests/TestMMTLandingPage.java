package com.java.mmtSkypeReport.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.java.mmtSkypeReport.base.TestBase;
import com.java.mmtSkypeReport.pages.MMTLandingPage;

public class TestMMTLandingPage extends TestBase {
	MMTLandingPage landing;
	
	TestMMTLandingPage(){
		super();
	}
	
	@BeforeClass
	public void setUp() {
		initialization();
		landing = new MMTLandingPage();
	}
	
	@Test
	public void Test_1_Login() {
		landing.login(prop.getProperty("email_id"), prop.getProperty("password"));
	}
	
}

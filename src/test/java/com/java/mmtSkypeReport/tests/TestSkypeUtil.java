package com.java.mmtSkypeReport.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.java.mmtSkypeReport.util.SkypeUtil;

public class TestSkypeUtil {
	SkypeUtil sk;

	@BeforeClass
	public void setUp() {
		sk = new SkypeUtil("rahulrajanqa@gmail.com", "Sample987*#");
	}

	@Test
	public void Test_1_testSendingASampleMessage() {
		sk.sendMessage("This is a test message too as well. ", "live:rahul96rajan");
	}
	
	@AfterClass
	public void tearDown() {
		sk.disconnect();
	}
	/*
	 * public static void main(String[] args) { SkypeUtil sk = new
	 * SkypeUtil("rahulrajanqa@gmail.com", "Sample987*#");
	 * sk.sendMessage("This is a test message. ", "live:rahul96rajan"); }
	 */
}

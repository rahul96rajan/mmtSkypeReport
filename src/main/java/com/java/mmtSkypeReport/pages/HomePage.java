package com.java.mmtSkypeReport.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.java.mmtSkypeReport.base.TestBase;



public class HomePage extends TestBase{
	@FindBy(id = "hp-widget__sfrom")
	WebElement from_field;
	
	@FindBy(id = "hp-widget__sTo")
	WebElement to_field;
	
	@FindBy(id = "hp-widget__depart")
	WebElement depart_feild;
	
	@FindBy(id = "searchBtn")
	WebElement search_btn;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	//  //td[@data-handler='selectDay' and @data-month = '8' ]/a[text()='16']   --->   month-1

	public void enterFromLocation(String from_location_code) {
		from_field.clear();
		from_field.sendKeys(from_location_code);
		from_field.sendKeys(Keys.ENTER);
	}

	public void enterToLocation(String to_location_code) {
		to_field.clear();
		to_field.sendKeys(to_location_code);
	}
	
	public boolean  selectDepartDate(String depart_month_numerics, String depart_date_numerics) {
		depart_feild.click();
		String departMonth = prop.getProperty("depart_month_numerics");
		departMonth = Integer.toString((Integer.parseInt(departMonth)-1));
		String xpath_of_date = "//td[@data-handler='selectDay' and @data-month='"+departMonth
								+"' ]/a[text()='"+depart_date_numerics+"']/parent::td";
		WebElement day = driver.findElement(By.xpath(xpath_of_date));
		if(day.isDisplayed()) {
			day.click();
			return true;
		}else {
			return false;
		}
		
	}
	
	public FlightSelectionPage clickOnSearchButton() {
		search_btn.click();
		return new FlightSelectionPage();
	}
	
	public boolean selectFromToDepartAndDate(String from_location_code,String to_location_code,String depart_month_numerics, String depart_date_numerics) {
		enterFromLocation(from_location_code);
		enterToLocation(to_location_code);
		boolean dateSelection = selectDepartDate(depart_month_numerics,depart_date_numerics);
		return dateSelection;
	}
}

package com.serge.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {

	
	
	@FindBy(css = "#tab-flight-tab-hp")
	public WebElement flightTab;
	
	@FindBy(css = "#flight-origin-hp-flight")
	public WebElement fromCity;
	
	@FindBy(css = "#flight-destination-hp-flight")
	public WebElement toCity;
	
	@FindBy(css = "#flight-departing-hp-flight")
	public WebElement departDate;
	
	@FindBy(css = "#flight-returning-hp-flight")
	public WebElement returnDate;
	
	@FindBy(css = "#gcw-flights-form-hp-flight [type*=submit]")
	public WebElement searchButton;
	
	
	
	
	
	
}

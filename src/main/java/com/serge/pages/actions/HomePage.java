package com.serge.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.serge.base.Page;
import com.serge.pages.locators.HomePageLocators;

public class HomePage extends Page {

	public HomePageLocators home;

	public HomePage() {

		this.home = new HomePageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(
				driver, 10);
		PageFactory.initElements(factory, this.home);

	}

	public HomePage gottoFlights() {
		home.flightTab.click();
		return this;
	}

	public void gottoHotels() {

	}

	public void gottoFlightAndHotel() {

	}

	public void bookFlight(String from, String to, String departDate,
			String returnDate) {

		home.fromCity.sendKeys(from);
		home.toCity.sendKeys(to);
		home.departDate.sendKeys(departDate);
		
		home.returnDate.click();
		//home.returnDate.clear();
		//home.returnDate.sendKeys(returnDate);
		home.searchButton.click();
	}

	public int findTabCount() {

		return home.tabCount.size();
				
	}
}

package com.serge.rough;

import com.serge.base.Page;
import com.serge.pages.actions.HomePage;

public class FlightSerachTest {

	public static void main(String[] args) throws InterruptedException {

		Page.initConfiguration();
		HomePage homePage = new HomePage();
		homePage.gottoFlights().bookFlight("YYZ", "SEA", "02/05/2019", "02/06/2019");
		
		//Page.quitBrowser();

	}

}

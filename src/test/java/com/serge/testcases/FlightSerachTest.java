package com.serge.testcases;

import org.testng.annotations.Test;

import com.serge.base.Page;
import com.serge.errorcollectors.ErrorCollector;
import com.serge.pages.actions.HomePage;

import junit.framework.Assert;

public class FlightSerachTest {

	@Test
	public void flightSerachTest() {

		Page.initConfiguration();
		HomePage homePage = new HomePage();
		//Assert.assertEquals(7, homePage.findTabCount());
		ErrorCollector.verifyEquals(homePage.findTabCount(), 8); //soft assertion, does not stop the test
		homePage.gottoFlights().bookFlight("YYZ", "SEA", "02/05/2019", "02/06/2019");
		
		Page.quitBrowser();

	}

}

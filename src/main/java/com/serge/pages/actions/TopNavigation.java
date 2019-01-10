package com.serge.pages.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.serge.base.Page;
import com.serge.pages.locators.TopNavigationLocators;

public class TopNavigation {

	public TopNavigationLocators topNavigation;
	
	public TopNavigation(WebDriver driver) {
		this.topNavigation = new TopNavigationLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(
				driver, 10);
		PageFactory.initElements(factory, this.topNavigation);
	}
	
	
	
	public SignInWindow gotoSignin() {
		
		topNavigation.account.click();
		topNavigation.signIn.click();
		 return new SignInWindow(Page.driver);
		
	}
	public void createAccount() {
		
		
	}
	
	public void gotoList() {
		
		
	}
	public void gotoSupport() {
		
		
	}
	public void gotoFlights() {
		
		
	}
	
}

package com.serge.pages.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.serge.pages.locators.SignInWindowLocators;

public class SignInWindow {

	public SignInWindowLocators signInWindow;

	public SignInWindow(WebDriver driver) {

		this.signInWindow = new SignInWindowLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(
				driver, 10);
		PageFactory.initElements(factory, this.signInWindow);

	}
	
	
	
	public void doLogin(String userName, String password) {
		
		signInWindow.email.sendKeys(userName);
		signInWindow.password.sendKeys(password);
		signInWindow.signInButton.click();
		
	}
	
	
}

package com.serge.testcases;

import org.testng.annotations.Test;

import com.serge.base.Page;
import com.serge.pages.actions.SignInWindow;

public class SignInTest {

	@Test
	public void signInTest() {
		
		Page.initConfiguration();
		SignInWindow signIn = Page.topNav.gotoSignin();
		signIn.doLogin("test@test.com", "test");
		Page.quitBrowser();
		
		
		
		
	}

}

package com.serge.rough;

import com.serge.base.Page;
import com.serge.pages.actions.SignInWindow;

public class SignInTest {

	public static void main(String[] args) {
		
		Page.initConfiguration();
		SignInWindow signIn = Page.topNav.gotoSignin();
		signIn.doLogin("test@test.com", "test");
		Page.quitBrowser();
		
		
		
		
	}

}

package com.etsy.stepdefinition;


import com.etsy.resources.FunctionalLibrary;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	@Before
	public static void method1() {
		FunctionalLibrary.driverInit("Chrome");
	}

	@After
	public static void method2() {
		FunctionalLibrary.closeBrowser();
		FunctionalLibrary.quitBrowser();
	}

}

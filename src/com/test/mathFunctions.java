package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class mathFunctions {

	@BeforeClass(alwaysRun = true)
	private void login() {
		System.out.println("Login to App");

	}

	@BeforeMethod(alwaysRun = true)
	public void enterURL() {
		System.out.println("Google Title Test");
	}

	@Test
	public void googelTitleTest() {
		System.out.println("Google Title Test");
	}

	@AfterMethod
	public void logout() {
		System.out.println("logout from app");
	}

	@AfterTest
	public void deleteAllCookies() {
		System.out.println("delete All Cookies");
	}
	/*********************/

	@AfterClass
	public void closeBrowser() {
		System.out.println("Close Browser");
	}
	/************ End ******************/

}

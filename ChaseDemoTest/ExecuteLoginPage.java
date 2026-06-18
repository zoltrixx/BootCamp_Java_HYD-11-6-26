package com.Chase.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Chase.Page.LoginChase;
import com.helper.BrowserFactory;

public class ExecuteLoginPage {
	@Test
	public void CheckValidUser() throws Exception {

		WebDriver driver = BrowserFactory.BrowserOptions("chrome", "https://www.chase.com/");
		LoginChase loginPagechaselogin = PageFactory.initElements(driver, LoginChase.class);
		loginPagechaselogin.Login_Chase("Ayush_11", "Ayush@11");

	}
}

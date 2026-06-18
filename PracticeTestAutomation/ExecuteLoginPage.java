package com.PracticeAutomation.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.PracticeAutomation.Page.LoginPracticeAuto;
import com.helper.BrowserFactory;

public class ExecuteLoginPage {
	
public void CheckValidUser() throws Exception{
		
		WebDriver driver = BrowserFactory.BrowserOptions("chrome", 
				"https://practicetestautomation.com/practice-test-login/");
		LoginPracticeAuto loginPagePracticeAuto = PageFactory.initElements(driver, LoginPracticeAuto.class);
		loginPagePracticeAuto.Login_PracticeAuto("student", "Password123");
		
	}
}

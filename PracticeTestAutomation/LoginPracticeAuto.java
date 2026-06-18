package com.PracticeAutomation.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPracticeAuto {
	
	WebDriver driver;
	String url = "https://practicetestautomation.com/practice-test-login/";
	
	
	//Create Constructor 
	public LoginPracticeAuto(WebDriver driver) { 
		this.driver = driver;
		 
	}
	@FindBy(id = "username")
	WebElement username;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath = "//button[@id='submit']")
	WebElement submitbtn;
	
	public void Login_PracticeAuto(String name, String pass)	{
		username.sendKeys(name);
		password.sendKeys(pass);
		submitbtn.click();
		
	}
	
}

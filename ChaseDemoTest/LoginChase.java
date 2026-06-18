package com.Chase.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginChase {
	
	WebDriver driver;
	String url = "https://www.chase.com/";
	
	
	//Create Constructor 
	public LoginChase(WebDriver driver) { 
		this.driver = driver;
		 
	}
	@FindBy(id = "userId-text-input-field")
	WebElement username;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath = "//button[@id='signin-button']")
	WebElement signinbtn;
	
	public void Login_Chase(String name, String pass)	{
		username.sendKeys(name);
		password.sendKeys(pass);
		signinbtn.click();
		
	}
	
}

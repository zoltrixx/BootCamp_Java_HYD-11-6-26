package com.BrightestOrg.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginBrightestOrg {
	WebDriver driver;
	String url = "https://profile.brightest.org/accounts/signup/";
	
	
	//Create Constructor 
	public LoginBrightestOrg(WebDriver driver) { 
		this.driver = driver;
		 
	}
	@FindBy(id = "id_email")
	WebElement email;

	@FindBy(name = "id_email2")
	WebElement email2;
	
	@FindBy(name = "div_id_password1")
	WebElement password;
	
	@FindBy(name = "id_password2")
	WebElement password2;
	
	@FindBy(xpath = "//button[@aria-label='Create Account']")
	WebElement createaccbtn;
	
	public void Login_Brightest(String name1, String name2, String pass1, String pass2)	{
		email.sendKeys(name1);
		email.sendKeys(name2);
		password.sendKeys(pass1);
		password2.sendKeys(pass2);
		
		createaccbtn.click();
		
	}
}

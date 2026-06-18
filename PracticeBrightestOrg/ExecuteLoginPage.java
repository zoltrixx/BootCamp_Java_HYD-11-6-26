package comBrightest.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.BrightestOrg.Page.LoginBrightestOrg;
import com.helper.BrowserFactory;

public class ExecuteLoginPage {

	
	@Test
	public void CheckValidUser() throws Exception{
		
		WebDriver driver = BrowserFactory.BrowserOptions("chrome", 
				"https://profile.brightest.org/accounts/signup/");
		LoginBrightestOrg loginPageBrightestorg = PageFactory.initElements(driver, LoginBrightestOrg.class);
		loginPageBrightestorg.Login_Brightest("ayush82106@gmail.com", "ayush82106@gmail.com", "Ayush@11", "Ayush@11");
		
	}
	
	
}

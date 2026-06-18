package com.SeleniumDataDriven.Testing;


import java.io.FileReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import au.com.bytecode.opencsv.CSVReader;


public class DataDrivenTest{
	WebDriver driver;

	String url = "https://only-testing-blog.blogspot.com/2014/05/form.html";
	String CsvPath = "C:\\Coforge Boot Camp Testing/Namesheet.csv";

	@BeforeTest
	public void setup() {

		driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();

	}

	@Test
	public void LocatorsTest() throws Exception {
		CSVReader reader = new CSVReader(new FileReader(CsvPath));
		String[] csvCell;
		while ((csvCell = reader.readNext()) != null) {
			String Fname = csvCell[0];
			String Lname = csvCell[1];
			String Email = csvCell[2];
			String MNumb = csvCell[3];
			String CName = csvCell[4];
			driver.findElement(By.name("FirstName")).sendKeys(Fname);
			driver.findElement(By.name("LastName")).sendKeys(Lname);
			driver.findElement(By.name("EmailID")).sendKeys(Email);
			driver.findElement(By.name("MobNo")).sendKeys(MNumb);
			driver.findElement(By.name("Company")).sendKeys(CName);

			Thread.sleep(8000);
			driver.findElement(By.xpath("//input[@value='Submit']")).click();
			Thread.sleep(8000);
			driver.switchTo().alert().accept();

		}
		reader.close();
	}

	@AfterTest
	public void TearDown() {

		driver.quit();
	}
}


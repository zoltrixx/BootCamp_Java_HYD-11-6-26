package com.SeleniumWebDriverScreenshots;

import java.io.File;
import java.io.FileReader;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.graph.ElementOrder.Type;

import au.com.bytecode.opencsv.CSVReader;

public class ScreenshotsHandling {
	WebDriver driver;

	String url = "https://only-testing-blog.blogspot.com/2014/05/form.html";
	//String CsvPath = "D:\\OneDrive - Coforge Limited\\Desktop\\Eclipse_Docs/Book1.csv";

	@BeforeTest
	public void setup() {

		driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();

	}

	@Test
	public void ScreenshotTest() throws Exception {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("./Screenshots/Homepage.png"));
	}

	@AfterTest
	public void TearDown() {

		driver.quit();
	}
}

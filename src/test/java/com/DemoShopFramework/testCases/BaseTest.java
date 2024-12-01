package com.DemoShopFramework.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	protected WebDriver driver;

	@BeforeMethod
	public void setUp() {

		// Set options for the browser
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");

		// Initialize WebDriver
		driver = new ChromeDriver(options);
		driver.get("https://demowebshop.tricentis.com/");
	}

	@AfterMethod
	public void tearDown() {
		// Quit the browser after each test
		if (driver != null) {
			driver.quit();
		}

	}
}

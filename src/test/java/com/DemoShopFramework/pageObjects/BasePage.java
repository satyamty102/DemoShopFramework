package com.DemoShopFramework.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	protected WebDriver driver;

	// Constructor to initialize the driver
	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}



	/*
	 * // Reusable Methods
	 * 
	 * // Wait for an element to be visible protected WebElement
	 * waitForVisibility(By locator) { return
	 * wait.until(ExpectedConditions.visibilityOfElementLocated(locator)); }
	 * 
	 * // Click an element protected void click(By locator) {
	 * waitForVisibility(locator).click(); }
	 * 
	 * // Send text to an input field protected void sendKeys(By locator, String
	 * text) { WebElement element = waitForVisibility(locator); element.clear();
	 * element.sendKeys(text); }
	 * 
	 * // Get text from an element protected String getText(By locator) { return
	 * waitForVisibility(locator).getText(); }
	 * 
	 * // Check if an element is displayed protected boolean isDisplayed(By locator)
	 * { try { return waitForVisibility(locator).isDisplayed(); } catch (Exception
	 * e) { return false; } }
	 */

}

package com.DemoShopFramework.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Locators
	WebElement registerCTA = driver.findElement(By.xpath("//a[@class=\"ico-register\"]"));
	
	@Test
	public void clickOnRegister()
	{
		registerCTA.click();
	}
	
	
	

}

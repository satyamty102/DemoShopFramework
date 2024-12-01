package com.DemoShopFramework.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {

	public RegistrationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy (xpath="//h1[text()='Register']")
	private WebElement registrationPageTitle;
	
	@FindBy (xpath="//input[@id=\"gender-male\"]")
	private WebElement maleRadioButton;
	
	@FindBy (xpath="//input[@id=\"gender-female\"]")
	private WebElement femaleRadioButton;
	
	@FindBy (xpath="//input[@id=\"FirstName\"]")
	private WebElement firstNameTextBox;
	
	@FindBy (xpath="//input[@id=\"LastName\"]")
	private WebElement lastNameTextBox;
	
	@FindBy (xpath="//input[@id=\"Email\"]")
	private WebElement emailTextBox;
	
	@FindBy (xpath="//input[@id=\"Password\"]")
	private WebElement passwordTextBox;
	
	@FindBy (xpath="//input[@id=\"ConfirmPassword\"]")
	private WebElement confirmPasswordTextBox;
	
	@FindBy (xpath="//input[@id=\"register-button\"]")
	private WebElement registerCTA;
	
	
	

}

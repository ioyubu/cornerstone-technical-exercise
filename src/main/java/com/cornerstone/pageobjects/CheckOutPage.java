package com.cornerstone.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cornerstone.base.BasePage;

public final class CheckOutPage extends BasePage{
	
	private final By emailField = By.id("email");
	private final By customerContinueButton = By.id("checkout-customer-continue");
	private final By privacyCheckbox = By.id("privacyPolicy");
	private final By firstNameInput = By.id("firstNameInput");
	private final By lastNameInput = By.id("lastNameInput");
	private final By addressLine1Input = By.id("addressLine1Input");
	private final By addressLine2Input = By.id("addressLine2Input");
	private final By companyInput = By.id("companyInput");
	private final By cityInput = By.id("cityInput");
	private final By provinceInput = By.id("provinceInput");
	private final By postCodeInput = By.id("postCodeInput");
	private final By phoneInput = By.id("phoneInput");
	private final By orderComment = By.name("orderComment");
	private final By ShippingContinueButton = By.id("checkout-shipping-continue");
	private final By cardNumberInput = By.id("ccNumber");
	private final By cardExpiryInput = By.id("ccExpiry");
	private final By cardNameInput = By.id("ccName");
	private final By cardCvvInput = By.id("ccCvv");
	private final By paymentContinueButton = By.id("checkout-payment-continue");	

	public CheckOutPage(WebDriver driver) {
		super(driver);
	}
	
	public CheckOutPage enterEmail(String email) {
		waitForElementVisibility(emailField, 10);
		driver.findElement(emailField).sendKeys(email);	
		return this;
	}
	
	public CheckOutPage clickCustomerContinueButton() {
		waitForElementClickability(customerContinueButton, 10);
		driver.findElement(customerContinueButton).click();
		return this;		
	}
	
	public CheckOutPage tickPrivacyCheckbox() {
		WebElement checkBox = driver.findElement(privacyCheckbox);
		clickWithJavascriptExecutor(checkBox);
		return this;		
	}
	
	public CheckOutPage enterFirstName(String firstName) {
		waitForElementVisibility(firstNameInput, 10);
		driver.findElement(firstNameInput).sendKeys(firstName);
		return this;		
	}
	
	public CheckOutPage enterLastName(String lastName) {
		driver.findElement(lastNameInput).sendKeys(lastName);
		return this;		
	}
	
	public CheckOutPage enterAddressLine1(String address1) {
		driver.findElement(addressLine1Input).sendKeys(address1);
		return this;		
	}
	
	public CheckOutPage enterAddressLine2(String address2) {
		driver.findElement(addressLine2Input).sendKeys(address2);
		return this;		
	}
	
	public CheckOutPage enterCompanyName(String company) {
		driver.findElement(companyInput).sendKeys(company);
		return this;		
	}
	
	public CheckOutPage enterCity(String city) {
		driver.findElement(cityInput).sendKeys(city);
		return this;		
	}
	
	public CheckOutPage enterProvince(String province) {
		driver.findElement(provinceInput).sendKeys(province);
		return this;		
	}
	
	public CheckOutPage enterPostCode(String postCode) {
		driver.findElement(postCodeInput).sendKeys(postCode);
		return this;		
	}
	
	public CheckOutPage enterPhoneNo(String phone) {
		driver.findElement(phoneInput).sendKeys(phone);
		return this;		
	}

	public CheckOutPage enterOrderComment(String comment) {
		waitForElementVisibility(orderComment, 10);
		driver.findElement(orderComment).sendKeys(comment);
		return this;		
	}
	
	public CheckOutPage clickShippingContinueButton() {
		waitForElementClickability(ShippingContinueButton, 10);
		WebElement element = driver.findElement(ShippingContinueButton);
		clickWithJavascriptExecutor(element);
		return this;		
	}

	public CheckOutPage enterCardNo(String cardNo) {
		waitForElementVisibility(cardNumberInput, 10);
		driver.findElement(cardNumberInput).sendKeys(cardNo);
		return this;		
	}

	public CheckOutPage enterCardExpiry(String cardExpiry) {
		driver.findElement(cardExpiryInput).sendKeys(cardExpiry);
		return this;		
	}

	public CheckOutPage enterCardName(String cardName) {
		driver.findElement(cardNameInput).sendKeys(cardName);
		return this;		
	}

	public CheckOutPage enterCardCvv(String cvv) {
		driver.findElement(cardCvvInput).sendKeys(cvv);
		return this;		
	}
	
	public ConfirmationPage clickPaymentContinueButton() {
		waitForElementClickability(paymentContinueButton, 10);
		driver.findElement(paymentContinueButton).click();
		return new ConfirmationPage(driver);		
	}
	

}

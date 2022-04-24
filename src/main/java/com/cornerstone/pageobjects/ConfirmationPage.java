package com.cornerstone.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cornerstone.base.BasePage;
import com.cornerstore.utilities.Constants;

public final class ConfirmationPage extends BasePage {
	private final By orderNumberText = By.xpath("//p[@data-test='order-confirmation-order-number-text']/span");
	private final By orderConfirmationText = By.xpath("//p[@data-test='order-confirmation-order-status-text']/span");
	private final By purchasedItemCount = By.xpath("//h3[@data-test=\"cart-count-total\"]");
	private final By purchasedProductName = By.xpath("//h5[@data-test='cart-item-product-title']");

	public ConfirmationPage(WebDriver driver) {
		super(driver);
	}
	
	public String getOrderNumberText() {
		waitForElementVisibility(orderNumberText, 10);
		String text = driver.findElement(orderNumberText).getText();
		if (text.contains(Constants.ORDER_NUMBER_TEXT)) {
			//PASS			
		} else {
			//FAIL
		}
		return text;		
	}
	
	public String getOrderConfirmationText() {
		waitForElementVisibility(orderConfirmationText, 10);
		String text = driver.findElement(orderConfirmationText).getText();
		if (text.equalsIgnoreCase(Constants.ORDER_CONFIRMATION_TEXT)) {
			//PASS			
		} else {
			//FAIL
		}
		return text;				
	}
	
	public String getPurchasedItemCount() {
		waitForElementVisibility(purchasedItemCount, 10);
		String text = driver.findElement(purchasedItemCount).getText();
		if (text.equalsIgnoreCase(Constants.PURCHASED_ITEM_cOUNT)) {
			//PASS			
		} else {
			//FAIL
		}
		return text;				
	}
	
	public String getpurchasedProductName () {
		waitForElementVisibility(purchasedProductName, 10);
		String text = driver.findElement(purchasedProductName).getText();
		if (text.equalsIgnoreCase(Constants.PURCHASED_PRODUCT_NAME)) {
			//PASS			
		} else {
			//FAIL
		}
		return text;				
	}

}

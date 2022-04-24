package com.cornerstone.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cornerstone.base.BasePage;
import com.cornerstore.utilities.Constants;

public final class cartPage extends BasePage {
	
	private final By cartItem = By.xpath("//a[@class='cart-item-name__label']");
	private final By checkOutButton = By.xpath("//a[@href='/checkout']");

	public cartPage(WebDriver driver) {
		super(driver);
	}
	
	public String getCartText() {
		String text = getPageText();
		if (text.equalsIgnoreCase(Constants.X1_ITEM_CART_HEADER_TEXT)) {
			//PASS			
		} else {
			//FAIL
		}
		return text;
	}
	
	public String getCartItemName() {
		String text = driver.findElement(cartItem).getText();
		if (text.equalsIgnoreCase(Constants.KETTLE_PRODUCT_NAME)) {
			//PASS			
		} else {
			//FAIL
		}
		return text;
	}
	
	public CheckOutPage clickCheckOut() {
		waitForElementClickability(checkOutButton, 10);
		WebElement button = driver.findElement(checkOutButton);
		clickWithJavascriptExecutor(button);
		return new CheckOutPage(driver);
	}
	
	

}

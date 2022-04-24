package com.cornerstone.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.cornerstone.base.BasePage;
import com.cornerstore.utilities.Constants;

public final class SearchPage extends BasePage {
	
	private final By searchedProduct = By.xpath("//div[@class='card-img-container']");
	private final By addToCartButton = By.xpath("//a[@data-button-type='add-cart']");

	public SearchPage(WebDriver driver) {
		super(driver);
	}
	
	public String getSearchText() {
		String text = getPageText();
		if (text.equalsIgnoreCase(Constants.KETTLE_SEARCH_HEADER_TEXT)) {
			//PASS			
		} else {
			//FAIL
		}
		return text;
	}
	
	public cartPage addProductToCart() {
		hoverOverProduct(searchedProduct);
		WebElement button = driver.findElement(addToCartButton);
		clickWithJavascriptExecutor(button);
		return new cartPage(driver);
	}
	
	private void hoverOverProduct(By by) {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(by)).perform();		
	}
	
	

}

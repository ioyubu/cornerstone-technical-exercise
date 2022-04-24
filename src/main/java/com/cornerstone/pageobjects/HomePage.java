package com.cornerstone.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cornerstone.base.BasePage;

public final class HomePage extends BasePage {
	private final By searchButton = By.id("quick-search-expand");	
	private final By searchBox = By.id("nav-quick-search");

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public HomePage clickSearch(){
		driver.findElement(searchButton).click();
		return this;
	}
	
	public SearchPage productSearch(String keyword) {
		driver.findElement(searchBox).sendKeys(keyword);
		enterKey(searchBox);
		return new SearchPage(driver);
	}

}

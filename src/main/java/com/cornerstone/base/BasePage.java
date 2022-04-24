package com.cornerstone.base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	protected WebDriver driver;
	private WebDriverWait wait;
	private final By pageText = By.xpath("//h1[@class='page-heading']"); 
	
	protected BasePage(WebDriver driver) {
		this.driver = driver;		
	}
	
	protected void enterKey(By by) {
		Actions action = new Actions(driver);
		action.sendKeys(driver.findElement(by), Keys.ENTER).build().perform();		
	}
	
	protected String getPageText() {
		return driver.findElement(pageText).getText();		
	}
	
	protected void clickWithJavascriptExecutor(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);		
	}
	
	protected void waitForElementVisibility(By by, int duration) {		
		try {			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
			wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
		} catch (Exception e) {
			e.printStackTrace();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}			
	}
	
	protected void waitForElementClickability(By by, int duration) {		
		try {			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
			wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
			wait.until(ExpectedConditions.elementToBeClickable(by));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
		} catch (Exception e) {
			e.printStackTrace();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}			
	}
	
}

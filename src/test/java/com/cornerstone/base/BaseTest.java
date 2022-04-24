package com.cornerstone.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.cornerstone.pageobjects.HomePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public WebDriver driver;
	protected HomePage homePage;
	
	protected BaseTest() {		
	}
	
	@BeforeMethod
	public void setUp() {		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://cornerstone-light-demo.mybigcommerce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		homePage = new HomePage(driver);
	}
	
	@AfterMethod
	public void shutDown() {
		//driver.close();		
	}

}

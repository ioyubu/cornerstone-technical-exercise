package com.cornerstone.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.cornerstone.base.BaseTest;
import com.cornerstone.pageobjects.CheckOutPage;
import com.cornerstone.pageobjects.ConfirmationPage;
import com.cornerstone.pageobjects.SearchPage;
import com.cornerstone.pageobjects.cartPage;
import com.cornerstore.utilities.Constants;

public class ProductCheckoutTest extends BaseTest{
	
	private ProductCheckoutTest() {		
	}
	
	@Test(description = "Verify an unregistered customer can add single product to cart and checkout successfully")
	public void singleProductCheckoutForUnregisteredCustomer() {
		
		SearchPage search = homePage.clickSearch().productSearch(Constants.KETTLE_PRODUCT_NAME);
		assertEquals(search.getSearchText(), Constants.KETTLE_SEARCH_HEADER_TEXT);
		cartPage cart = search.addProductToCart();
		assertEquals(cart.getCartText(), Constants.X1_ITEM_CART_HEADER_TEXT);
		assertEquals(cart.getCartItemName(), Constants.KETTLE_PRODUCT_NAME);
		CheckOutPage checkOut = cart.clickCheckOut();
		ConfirmationPage confirmOrder = checkOut.enterEmail(Constants.CUSTOMER_EMAIL)
				.clickCustomerContinueButton()
				.tickPrivacyCheckbox()
				.clickCustomerContinueButton()
				.enterFirstName(Constants.CUSTOMER_FIRST_NAME)
				.enterLastName(Constants.CUSTOMER_LAST_NAME)
				.enterAddressLine1(Constants.CUSTOMER_ADDRESS_LINE_1)
				.enterAddressLine2(Constants.CUSTOMER_ADDRESS_LINE_2)
				.enterCompanyName(Constants.COMPANY_NAME)
				.enterCity(Constants.CITY_NAME)
				.enterProvince(Constants.PROVINCE_NAME)
				.enterPostCode(Constants.POST_CODE)
				.enterPhoneNo(Constants.PHONE_NO)
				.enterOrderComment(Constants.ORDER_COMMENT)				
				.clickShippingContinueButton()
				.enterCardNo(Constants.CARD_NUMBER)
				.enterCardExpiry(Constants.CARD_EXPIRY)
				.enterCardName(Constants.CARD_NAME)
				.enterCardCvv(Constants.CARD_CVV)
				.clickPaymentContinueButton();
		assertTrue(confirmOrder.getOrderNumberText().contains(Constants.ORDER_NUMBER_TEXT));
		assertEquals(confirmOrder.getOrderConfirmationText(), Constants.ORDER_CONFIRMATION_TEXT);
		assertEquals(confirmOrder.getPurchasedItemCount(), Constants.PURCHASED_ITEM_cOUNT);
		assertEquals(confirmOrder.getpurchasedProductName(), Constants.PURCHASED_PRODUCT_NAME);		
	}

}

package com.cornerstore.utilities;

public class Constants {
	
	private Constants() {		
	}
	
	// Search Page
	public static final String KETTLE_SEARCH_HEADER_TEXT = "1 result for 'Pour-Over Kettle'";
	public static final String X1_ITEM_CART_HEADER_TEXT = "Your Cart (1 item)";
	public static final String KETTLE_PRODUCT_NAME = "Pour-Over Kettle";
	
	// Checkout Page
	public static final String CUSTOMER_EMAIL =  Utils.randomX6StringGenerator() + "." + Utils.randomX6StringGenerator() + "@gmail.com";
	public static final String CUSTOMER_FIRST_NAME = "Isaac";
	public static final String CUSTOMER_LAST_NAME = "Oyubu-Johnson";
	public static final String CUSTOMER_ADDRESS_LINE_1 = "Kingdom House";
	public static final String CUSTOMER_ADDRESS_LINE_2 = "77 Brighton Close";
	public static final String COMPANY_NAME = "Mickey Mouse Corp";
	public static final String CITY_NAME = "Bishops Stortford";
	public static final String PROVINCE_NAME = "Hertfortshire";
	public static final String POST_CODE = "CM23 8YZ";
	public static final String PHONE_NO = "01234567890";
	public static final String ORDER_COMMENT = "Please do NOT attempt delivery between 12 - 2 pm as no one will be available";
	public static final String CARD_NUMBER = "4111111111111111";
	public static final String CARD_EXPIRY = "1225";
	public static final String CARD_NAME = "ISAAC JOHNSON";
	public static final String CARD_CVV = "789";
	
	// Confirmation Page
	public static final String ORDER_NUMBER_TEXT = "Your order number is ";
	public static final String ORDER_CONFIRMATION_TEXT = "An email will be sent containing information about your purchase. If you have any questions about your purchase, email us at cory+bc@pixelunion.net or call us at (415) 555-5555.";
	public static final String PURCHASED_ITEM_cOUNT = "1 Item";
	public static final String PURCHASED_PRODUCT_NAME = "1 x " + KETTLE_PRODUCT_NAME;

}

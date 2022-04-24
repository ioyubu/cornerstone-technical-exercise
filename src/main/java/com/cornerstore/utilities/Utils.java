package com.cornerstore.utilities;

public class Utils {

	private Utils() {
	}

	public static String randomX6StringGenerator() {
		String chars = "abcdefghijklmnopqrstuvwx1234567890";
		int length = 6;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < length; i++) {
			int index = (int) (Math.random() * chars.length());
			sb.append(chars.charAt(index));
			}
		return sb.toString();		
	}

}

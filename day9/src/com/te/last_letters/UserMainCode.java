package com.te.last_letters;

public class UserMainCode {
	
	public static String getLastLetter(String str) {

		String[] arr = str.split(" ");
		String str1 = "";
		for (int i = 0; i < arr.length; i++) {
			String temp = arr[i];
			str1 += temp.charAt(temp.length() - 1) + "$";
		}
		str1 = str1.substring(0, str1.length() - 1);
		str1 = str1.toUpperCase();
		return str1;
	}

}

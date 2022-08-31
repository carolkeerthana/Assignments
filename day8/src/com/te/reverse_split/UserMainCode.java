package com.te.reverse_split;

public class UserMainCode {
	
	static String reshape(String str, String ch) {

		String str1 = "";
		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			str1 = str1 + (str.charAt(str.length() - i - 1));
		}

		for (int i = 0; i < str.length(); i++) {
			temp = temp + str1.charAt(i) + ch;
		}
		String result = temp.substring(0, temp.length() - 1);

		return result;
	}


}

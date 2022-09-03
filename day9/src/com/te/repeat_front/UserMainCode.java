package com.te.repeat_front;

public class UserMainCode {
	
	public static String repeatFirstThreeCharacters(String str, int num) {

		String str1 = "";

		if (str.length() < 3) {
			for (int i = 0; i < num; i++) {
				str1 = str1 + str;
			}

		} else {
			String sub = str.substring(0, 3);
			for (int i = 0; i < num; i++) {
				str1 = str1 + sub;
			}
		}

		return str1;
	}

}

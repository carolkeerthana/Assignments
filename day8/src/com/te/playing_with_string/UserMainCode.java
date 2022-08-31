package com.te.playing_with_string;

public class UserMainCode {
	
	static String formString(String arr[], int num) {

		String str1 = "";
		for (int i = 0; i < arr.length; i++) {

			if (arr[i].length() >= num) {

				String str = arr[i].substring(arr[i].length() - 1);
				str1 = str1 + str;
			} else
				str1 = str1 + "$";

		}

		return str1;
	}
}

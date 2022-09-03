package com.te.vowels_arrays_arraylist;

import java.util.ArrayList;

public class UserMainCode {
	public static ArrayList<String> matchCharacter(String[] str) {
		ArrayList<String> arrayList = new ArrayList<String>();
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str[i].length(); j++) {
				if (str[i].charAt(0) == 'a' || str[i].charAt(0) == 'e' || str[i].charAt(0) == 'i'
						|| str[i].charAt(0) == 'o'
						|| str[i].charAt(0) == 'u' && str[i].charAt(str[i].length() - 1) == 'a'
						|| str[i].charAt(str[i].length() - 1) == 'e' || str[i].charAt(str[i].length() - 1) == 'i'
						|| str[i].charAt(str[i].length() - 1) == 'o' || str[i].charAt(str[i].length() - 1) == 'u') {
					arrayList.add(str[i]);
					break;
				}

			}
		}
		return arrayList;

	}

}

package com.te.check_characters;

import java.util.StringTokenizer;

public class UserMainCode {
	public static int checkCharacters(String str) {
		int result = 0;
		String str1 = str.substring(0, 1);
		// System.out.println("str1"+str1);
		String str2 = str.substring(str.length() - 1);
		// System.out.println("str2"+str2);
		if (str1.equals(str2)) {
			result = 1;
		} else {
			result = -1;
		}

		return result;
	}
}

package com.te.removing_vowels;

public class UserMainCode {
	public static String removeEvenVowels(String str) {

		String str1 = "";
		for (int i = 0; i < str.length(); i++) {
			char letter = str.charAt(i);
			// System.out.println("char"+letter);
			if ((i + 1) % 2 == 0) {
				if (letter != 'a' && letter != 'e' && letter != 'i' && letter != 'o' && letter != 'u') {
					str1 = str1 + letter;
					// System.out.println("str1"+str1);
				}
			} else if ((i + 1) % 2 != 0) {
				str1 = str1 + letter;
				// System.out.println("else"+str1);
			}
		}

		return str1;

	}

}

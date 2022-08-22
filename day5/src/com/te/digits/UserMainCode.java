package com.te.digits;

import javax.swing.text.AttributeSet.CharacterAttribute;

public class UserMainCode {

	static String findNoDigits(double num) {

		String str = Double.toString(num);
		int num1 = str.indexOf(".");

		String str1 = str.substring(0, num1);
		String str2 = str.substring(num1 + 1);

		int temp = Integer.parseInt(str2);

		for (int i = 0; i < str2.length(); i++) {
			int rem = temp % 10;

			if (rem == 0)
				temp = temp / 10;

			str2 = Integer.toString(temp);
		}
		int len1 = str1.length();
		int len2 = str2.length();

		String result1 = Integer.toString(len1);
		String result2 = ":";
		String result3 = Integer.toString(len2);
		String result = result1 + result2 + result3;

		return result;
	}

}

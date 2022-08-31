package com.te.string_occurence;

public class UserMainCode {
	public static int getSubstring(String str1, String str2) {
		int count=0;
		int ln=str2.length();
		for (int i = 0; i < str1.length()-2; i++) {
			String temp=str1.substring(i, i+ln);
			if(temp.equals(str2)) {
				count++;
			}
		}
		return count;
		
	}

}

package com.te.middle_characters;

public class UserMainCode {
	public static String getMiddleChars(String string) {
		
			int str1=string.length()/2-1;
			int str2=str1+1;
			StringBuffer buffer= new StringBuffer();
			String str3=buffer.append(string.charAt(str1)).append(string.charAt(str2)).toString();
		
		return str3;
		
	}

}

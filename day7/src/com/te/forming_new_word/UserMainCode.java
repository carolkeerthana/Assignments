package com.te.forming_new_word;

public class UserMainCode {
	public static String formNewWord(String str,int value) {
		int str1= value;
		int str2=str.length();
		
		String str3=str.substring(0, str1);
		//System.out.println("3="+str3);
		String str4=str.substring(str2-str1, str2);
		//System.out.println("4="+str4);
		String word=str3+str4;
		return word;

}
}

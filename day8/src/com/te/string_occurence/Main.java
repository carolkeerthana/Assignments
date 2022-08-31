package com.te.string_occurence;

import java.util.Scanner;

public class Main extends UserMainCode {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the 1st string");
		String str1 = scanner.next();
		System.out.println("Enter the 2nd string");
		String str2 = scanner.next();
		
		System.out.println(getSubstring(str1, str2));

	}

}

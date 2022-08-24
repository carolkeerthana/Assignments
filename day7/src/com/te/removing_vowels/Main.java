package com.te.removing_vowels;

import java.util.Scanner;

public class Main extends UserMainCode {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string :");
		String string = scanner.nextLine();
		String str=new String(string);
		
		System.out.println(removeEvenVowels(str));
	}

}

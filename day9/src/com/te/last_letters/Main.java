package com.te.last_letters;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = scanner.nextLine();
		
		System.out.println(UserMainCode.getLastLetter(str));
	}

}

package com.te.palindrome;

import java.util.Scanner;

public class Main extends UserMainCode {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a integer a ");
		int a = scanner.nextInt();
		System.out.println("Enter a integer b ");
		int b = scanner.nextInt();
		System.out.println(addPalindromes(a, b));
	}

}

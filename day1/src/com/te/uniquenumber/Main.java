package com.te.uniquenumber;

import java.util.Scanner;

public class Main extends UserMainCode {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scanner.nextInt();
		int result = getUnique(n);
		if(result==1) {
			System.out.println("Unique number");
		}
		else {
			System.out.println("Not a Unique number");
		}
	}

}

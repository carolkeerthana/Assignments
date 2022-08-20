package com.te.digits;

import java.util.Scanner;

public class Main extends UserMainCode {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a non negative integer");
		int n = scanner.nextInt();
		if(n>0) {
			countSeven(n);
		}
		else {
			System.out.println("Enter a valid integer");
		}
	}

}

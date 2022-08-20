package com.te.sumofodddigits;

import java.util.Scanner;

public class Main extends UserMainCode {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a integer = ");
		int digits = scanner.nextInt();
		if(digits>0) {
			CheckSum(digits);
		}
		else {
			System.out.println("Enter a positive integer");
		}
	}

}

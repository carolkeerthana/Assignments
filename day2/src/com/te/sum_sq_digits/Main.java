package com.te.sum_sq_digits;

import java.util.Scanner;

public class Main extends UserMainCode {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter an integer value");
		int num = scanner.nextInt();
		System.out.println(getSumOfSquareOfDigits(num));

	}

}

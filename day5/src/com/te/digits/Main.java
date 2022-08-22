package com.te.digits;

import java.util.Scanner;

public class Main extends UserMainCode{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a double number:");
		double num = scanner.nextDouble();

		String str = findNoDigits(num);

		System.out.println(str);
	

	}

}

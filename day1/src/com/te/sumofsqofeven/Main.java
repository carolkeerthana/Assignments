package com.te.sumofsqofeven;

import java.util.Scanner;
public class Main extends UserMainCode {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a positive integer");
		int n = scanner.nextInt();
		SumOfSquaresOfEvenDigits(n);
	}

}
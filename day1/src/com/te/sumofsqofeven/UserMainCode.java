package com.te.sumofsqofeven;

public class UserMainCode {
	public static int SumOfSquaresOfEvenDigits(int n) {
		int sum = 0;
		int rem = 0;
		while (n > 0) {
			rem = n % 10;
			if (rem % 2 == 0) {
				sum = sum + rem * rem;
			}
			n=n/10;
		}
		System.out.println("Sum of square of even digits = " + sum);
		return sum;
	}

}

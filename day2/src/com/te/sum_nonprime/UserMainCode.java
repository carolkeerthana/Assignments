package com.te.sum_nonprime;

public class UserMainCode {
	public static int addNumbers(int num) {
		int sum = 0;
		int count = 0;
		for (int i = 1; i <= num; i++) {
			count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count != 2)
				sum = sum + i;
		}
		return sum;
	}
}

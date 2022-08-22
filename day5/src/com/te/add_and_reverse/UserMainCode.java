package com.te.add_and_reverse;

public class UserMainCode {
	public static int addAndReverse(int[] arr, int num) {
		int sum = 0;
		int rem = 0;
		int temp1 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > num) {
				sum = sum + arr[i];
			}

		}
		System.out.println("sum of elements "+sum);
		int temp = sum;
		while (temp > 0) {
			rem = temp % 10;
			temp1 = temp1 * 10 + rem;
			// System.out.println("temp"+temp1);
			temp = temp / 10;
		}
		return temp1;
	}
}
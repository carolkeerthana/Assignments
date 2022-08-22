package com.te.add_even_odd;

public class UserMainCode {
	public static int addEvenOdd(int[] arr) {
		int sq = 0;
		int cu = 0;
		int num = 0;
		int sum = 0;
		int sum1 = 0;
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				num = arr[i];			
				sq = num * num;
				sum = sum + sq;	
			} else if (arr[i] % 2 == 1) {
				num = arr[i];		
				cu = num * num * num;
				sum1 = sum1 + cu;
			}
			total = sum + sum1;
		}
		return total;

	}

}

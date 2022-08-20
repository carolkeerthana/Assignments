package com.te.sum_of_powers;

public class UserMainCode {
	public static int Power(int value, int k) {
		int pro=1;
		for (int i = 0; i < k; i++) {
			pro=pro*value;
		}
		
		return pro;
	}
	
	
	public static int getSumOfPower(int[] arr ) {
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum+Power(arr[i], i);
		}
		return sum;
		
	}

}

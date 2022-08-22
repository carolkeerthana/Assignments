package com.te.median;

import java.util.Arrays;

public class UserMainCode {
	public static double calculateMedian(int[] arr) {
		Arrays.sort(arr);
		for (int i : arr) {
			//System.out.println("after sorting" + i);
		}
		double median = 0;
		int len=0;
		for (int i = 0; i < arr.length; i++) {
			if( arr.length % 2==1) {
				len = arr.length / 2;
				median = arr[len];
			} else {
				len = arr.length / 2;
				double sum = arr[len-1] + arr[len];
				median = sum / 2;
				if(median%2!=0) {
					median=Math.ceil(median);
				}
			}
		}
		
		return median;

	}

}

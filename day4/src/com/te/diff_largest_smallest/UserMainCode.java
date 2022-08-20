package com.te.diff_largest_smallest;

public class UserMainCode {
	public static int getBigDiff(int[] arr) {
		int max = arr[0];
		int min = arr[0];
		int diff = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i]>max) {
				max = arr[i];
			}
			if (arr[i]<min) {
				min = arr[i];
			}
		}
			diff = diff + max - min;
		return diff;
	}
}

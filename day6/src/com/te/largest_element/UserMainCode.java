package com.te.largest_element;

public class UserMainCode {
	public static int checkLargestAmongCorner(int[] arr) {
		int temp = 0;
		int max = 0;
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			temp = arr.length / 2;
			max = arr[temp];
			if (arr[0] > max) {
				max = arr[0];
			} else if (arr[arr.length - 1] > max) {
				max = arr[arr.length - 1];
			} else {
				return max;
			}
			result = max;
		}
		return result;

	}

}

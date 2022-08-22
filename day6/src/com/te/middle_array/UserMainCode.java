package com.te.middle_array;

public class UserMainCode {
	public static int getMiddleElement(int[] arr) {
		int index = 0;
		int middle = 0;
		for (int i = 0; i < arr.length; i++) {
			index = arr.length / 2;
			middle = arr[index];

		}
		return middle;

	}

}

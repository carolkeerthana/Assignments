package com.te.common_elements;

public class UserMainCode {
	public static int sumCommonElements(int[][] arr) {
		int count = 0;
		int sum = 0;
		int result=0;
		int arr1 []= arr[0];
		int arr2[] = arr[1];
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					sum = sum + arr1[i];
					count++;
				}
			
			}

		}
		if(count>=1)
			result=sum;
		else
			result=-1;
		return result;

	}

}

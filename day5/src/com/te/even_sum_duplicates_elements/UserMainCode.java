package com.te.even_sum_duplicates_elements;

import java.util.Iterator;

public class UserMainCode {
	public static int sumElements(int[] arr) {
		int sum=0;
		int arr1=0;
		int result=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					arr[i]=0;
					//System.out.println("nd"+arr[i]);
				}
			}
		}
			for (int j = 0; j < arr.length; j++) {
			arr1=arr[j];
			if(arr[j]%2==0) {
				sum=sum+arr[j];
				//System.out.println("sum"+sum);
			}
				}
		
		if(sum==0)
			result= -1;
		else 
			result=sum;
		return result;
		
		
		
	}

}

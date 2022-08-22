package com.te.boundary_avg;

public class UserMainCode {
	public static float getBoundaryAverage(int[] arr) {
		int max=0;
		int min=0;
		float sum=0;
		float avg=0;
		max=arr[0];
		min=arr[0];
		for (int i = 0; i < arr.length; i++) {
	
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
			sum=sum+max+min;
			//System.out.println("sum"+sum);
			avg=sum/2;
			//System.out.println("avg"+avg);
	
		return avg;
		
	}

}

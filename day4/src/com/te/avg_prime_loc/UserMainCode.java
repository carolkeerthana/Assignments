package com.te.avg_prime_loc;

public class UserMainCode {
	public static double averageElements(int[] arr) {
		double sum =0;
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			if(i>1) {
			if(i==2||i%2==1) {
				sum=sum+arr[i];
				count++;
			}
		}
		}
		double avg = sum/count;
		return avg;	
	
	}
}

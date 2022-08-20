package com.te.sum_sq_digits;

public class UserMainCode {
	public static int getSumOfSquareOfDigits(int num){
		int sum=0;
		while(num>0) {
			int rem=num%10;
			sum=sum+rem*rem;
			num=num/10;
		}
		return sum;
		
	}

}

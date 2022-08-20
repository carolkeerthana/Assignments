package com.te.reversingnumber;

public class UserMainCode {
	public static int reverseNumber(int n) {
		int rem=0;
		int sum=0;
		while(n>0) {
			rem = n%10;
			sum=sum*10+rem;
			n = n/10;
		}
		return sum;
		
	}

}

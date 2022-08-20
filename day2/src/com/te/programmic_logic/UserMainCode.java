package com.te.programmic_logic;

public class UserMainCode {
	public static int getLuckySum(int a,int b, int c) {
		int sum;
		if(a==13) {
			sum=c;
		}
		else if(b==13) {
			sum=a;
		}
		else if(c==13) {
			sum=a+b;
		}
		else {
			sum=a+b+c;
		}
		return sum;
		
	}

}

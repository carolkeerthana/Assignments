package com.te.perfectno;

public class UserMainCode {
	public static boolean getPerfection(int num) {
		int sum=0;
		int temp=0;
		for (int i = 1; i < num; i++) {
			if(num%i==0) {
				temp =i;
				sum =sum+i;
			}	
		}
		if(sum==num) {
		return true;
		}
		else {
			return false;
		}
		
	}

}

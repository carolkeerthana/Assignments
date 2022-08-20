package com.te.digits;

public class UserMainCode {
	public static int countSeven(int n){
		int count=0;
		while(n>0) {
			int rem =n%10;
		if(rem%7==0) {
			count++;
		}
		n=n/10;
		}
			System.out.println("count of seven is "+count);
			return count;}
	
	}



package com.te.uniquenumber;

public class UserMainCode {
	public static int getUnique(int n) {
		{
			int count = 0;
			while (n > 0) {
				int rem = n % 10;
			while(n>0) {
				int rem1 =n%10;
				if(rem==rem1) {
					count++;
				}
				n=n/10;
			}
			}
			if (count>= 2) {
				return -1;
			} else {
				return 1;
			}
}
}
}
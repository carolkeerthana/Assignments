package com.te.kaprekar_number;

public class UserMainCode1 {
	public static int getKaprekarNumber(int num) {
		int sq1=num*num;
		int sq2=num*num;
		int count=0;
		int right=0;
		int left=0;
		int k=1;
		while(sq1>0) {
			int rem = sq1%10;
			count++;
			sq1=sq1/10;
		}
			for (int i = 1; i <= (count/2); i++) {
				k = k*10;
			}
			if(count%2!=0) {
				left = sq2%(k*10);
				right = sq2/(k*10);
				if(left!=right) {
					left=sq2 % k;
					right=sq2/k;
				}
			}
			else {
				left=sq2%k;
				right=sq2/k;
			}
			if(left+right==num)
				return 1;
			else
				return -1;
	}
}





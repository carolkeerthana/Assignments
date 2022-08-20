package com.te.even_odd_index;

public class UserMainCode {
	public static int sumOfOddEvenPositioned(int num) {
		int temp = num;
		int temp1 = num;
		int oddsum = 0;
		int evensum = 0;
		while (temp > 0) {// 2598//25
			int rem1 = temp % 10;// 8//5
			evensum = evensum + rem1;// 0+8=8//8+5=13
			temp = temp / 100;//25//
			
		}
		temp1 = temp1 / 10;//259
		while (temp1 > 0) {
			int rem2 = temp1 % 10;//9
			oddsum = oddsum + rem2;
			temp1 = temp1 / 100;
		}
		if (evensum == oddsum) {
			return 1;
		} else {
			return -1;
		}
	}
}

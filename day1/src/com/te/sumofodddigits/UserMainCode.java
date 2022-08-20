package com.te.sumofodddigits;

public class UserMainCode {
	public static int CheckSum(int digits) {
		if (digits % 2 == 1) {
			{
				int sum = 0;
				sum = sum + digits;
			}
			System.out.println("Sum of odd digits is odd");
			return 1;
		} else {
			System.out.println("Sum of odd digits is even");
			return -1;
		}

	}

}

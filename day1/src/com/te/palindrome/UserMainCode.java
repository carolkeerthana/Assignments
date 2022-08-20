package com.te.palindrome;

public class UserMainCode {
	public static int addPalindromes(int a, int b) {
		int sum1=0;
		int rem=0;
		for (int i = a; i <= b; i++) {
			int sum=0;
			int temp = i;
			while (temp> 0) {
				rem = temp % 10;
				sum = sum * 10 + rem;
				temp= temp / 10;}
				if (sum == i) {
					// sum1 = sum;
					sum1= sum1 + i;
					
				}
			
		}
		 System.out.println("sum of palindromes" +sum1);
		return sum1;
	}
}
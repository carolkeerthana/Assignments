package com.te.even_odd_index;

import java.util.Scanner;

public class Main extends UserMainCode {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter an integer value");
		int num = scanner.nextInt();
		int result = UserMainCode.sumOfOddEvenPositioned(num);
		if(result==1) {
			System.out.println("yes");
		}
		else {
			System.out.println("No");
		}

	}

}

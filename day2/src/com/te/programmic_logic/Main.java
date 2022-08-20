package com.te.programmic_logic;

import java.util.Scanner;

public class Main extends UserMainCode {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter value for a");
		int a = scanner.nextInt();
		System.out.println("Enter value for b");
		int b = scanner.nextInt();
		System.out.println("Enter value for c");
		int c = scanner.nextInt();
		System.out.println(getLuckySum(a,b,c));


	}

}

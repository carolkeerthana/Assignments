package com.te.perfectno;

import java.util.Scanner;

import com.te.kaprekar_number.UserMainCode1;

public class Main extends UserMainCode {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter an integer value");
		int num = scanner.nextInt();
		System.out.println(getPerfection(num));
	}

}

package com.te.kaprekar_number;

import java.util.Scanner;

public class Main1 extends UserMainCode1{

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter an integer value");
		int num = scanner.nextInt();
		int result = UserMainCode1.getKaprekarNumber(num);
		if(result==1) {
			System.out.println("Number is Kaprekar ");
		}
		else {
			System.out.println("Number is not Kaprekar");
		}
	}

}

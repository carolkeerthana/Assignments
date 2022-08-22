package com.te.middle_array;

import java.util.Scanner;

public class Main extends UserMainCode {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int size = scanner.nextInt();
		if(size%2==1) {
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the array element of " + i);
			arr[i] = scanner.nextInt();
		}
		
		System.out.println("Middle element of array is " + getMiddleElement(arr));
	}
	}
}

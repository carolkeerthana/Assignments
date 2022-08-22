package com.te.add_and_reverse;

import java.util.Scanner;

public class Main extends UserMainCode {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int size = scanner.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the element of " + i);
			arr[i] = scanner.nextInt();
		}
		System.out.println("Enter the number :");
		int num = scanner.nextInt();
		System.out.println("Reversed value =" + addAndReverse(arr, num));

	}
}

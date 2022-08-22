package com.te.add_even_odd;

import java.util.Scanner;

public class Main extends UserMainCode {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int size = scanner.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the array element of " + i);
			arr[i] = scanner.nextInt();
		}
		System.out.println("sum of cubes and squares is "+addEvenOdd(arr));
	}

}

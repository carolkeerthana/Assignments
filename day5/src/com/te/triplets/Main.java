package com.te.triplets;

import java.util.Scanner;

public class Main extends UserMainCode {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size = scanner.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the elements "+i);
			arr[i] = scanner.nextInt();
		}
		System.out.println(checkTripplets(arr));
	}

}

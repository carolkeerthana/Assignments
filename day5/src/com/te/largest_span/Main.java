package com.te.largest_span;

import java.util.Scanner;

public class Main extends UserMainCode{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size = scanner.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i);
			arr[i] = scanner.nextInt();
		}
		System.out.println("Largest span "+getLargestSpan(arr));

	}

}

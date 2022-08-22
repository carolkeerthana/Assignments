package com.te.remove_tens;


import java.util.Scanner;

public class Main extends UserMainCode {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size = scanner.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the elements of array "+i);
			arr[i] = scanner.nextInt();
		}
		int[] result=(removeTens(arr));
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);

		}
		
	}

}

package com.te.common_elements;

import java.util.Scanner;

public class Main extends UserMainCode {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int size = scanner.nextInt();
		int[][] arr = new int[size][];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the array count for column" +(i+1));
			int array = scanner.nextInt();
			arr[i]= new int[array];
		}
			for (int j = 0; j < arr.length; j++) {
				for (int j2 = 0; j2 < arr[j].length; j2++) {
					
			System.out.println("Enter the array element of " +j+ " index : ");
			arr[j][j2] = scanner.nextInt();
			
		}
			}
		System.out.println("sum of common elements = " +sumCommonElements(arr));

	}

}

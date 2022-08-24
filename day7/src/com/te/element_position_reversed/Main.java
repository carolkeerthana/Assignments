package com.te.element_position_reversed;

import java.util.Arrays;
import java.util.Scanner;

public class Main extends UserMainCode {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string size :");
		int size = scanner.nextInt();
		System.out.println("Enter the string :");
		String[] ar = new String[size];
		for (int i = 0; i < size; i++) {
			ar[i] = scanner.next();
		}
		Arrays.sort(ar);
		System.out.println("enter a element");
		String str = scanner.next();
		System.out.println(getElementsPosition(ar, str));
	}

}

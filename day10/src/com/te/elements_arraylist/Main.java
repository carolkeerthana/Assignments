package com.te.elements_arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> arraylist1 = new ArrayList<Integer>();
		ArrayList<Integer> arraylist2 = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first size :");
		int size1 = scanner.nextInt();
		for (int i = 0; i < size1; i++) {
			arraylist1.add(scanner.nextInt());
		}
		System.out.println("Enter the second size :");
		int size2 = scanner.nextInt();
		for (int i = 0; i < size2; i++) {
			arraylist2.add(scanner.nextInt());
		}
		int[] res = UserMainCode.arrayListSubractor(arraylist1, arraylist2);
		for (int i : res) {
			System.out.println(i);
		}
		
	}

}

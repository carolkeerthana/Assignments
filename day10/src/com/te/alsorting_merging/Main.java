package com.te.alsorting_merging;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
		ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of first array :");
		int num = scanner.nextInt();
		for (int i = 0; i < num; i++) {
			arrayList1.add(scanner.nextInt());
		}
		System.out.println("Enter the size of second array :");
		int size1 = scanner.nextInt();
		for (int i = 0; i < size1; i++) {
			arrayList2.add(scanner.nextInt());
		}
		ArrayList<Integer> res = UserMainCode.sortMergedArrayList(arrayList1, arrayList2);
		for (Integer integer : res) {
			System.out.println(integer);
		}
	}

}

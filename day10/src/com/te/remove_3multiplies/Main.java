package com.te.remove_3multiplies;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	ArrayList<Integer> arrayList = new ArrayList<Integer>();
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the size :");
	int size = scanner.nextInt();
	for (int i = 0; i <size; i++) {
		arrayList.add(scanner.nextInt());
	}
	ArrayList<Integer> res=UserMainCode.removeMultiplesOfThreee(arrayList);
	for (Integer integer : res) {
		System.out.println(integer);
	}

}
}
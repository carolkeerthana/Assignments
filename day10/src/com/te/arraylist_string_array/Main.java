package com.te.arraylist_string_array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size :");
		int size = scanner.nextInt();
		for (int i = 0; i < size; i++) {
			arrayList.add(scanner.next());
		}
		String[] res = UserMainCode.convertToStringArray(arrayList);
		for (String string : res) {
			System.out.println(string);
		}
	}

}

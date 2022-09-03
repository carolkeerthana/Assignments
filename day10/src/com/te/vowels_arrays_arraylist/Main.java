package com.te.vowels_arrays_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size :");
		int size = scanner.nextInt();
		String[] str = new String[size];
		for (int i = 0; i < str.length; i++) {
			str[i] = scanner.next();
		}
		ArrayList<String> res = UserMainCode.matchCharacter(str);
		for (String string : res) {
			System.out.println(string);
		}
	}

}

package com.te.largest_key;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Map<Integer, String> map = new HashMap<Integer, String>();
		System.err.println("Enter the Map size:");
		int size = scanner.nextInt();
		for (int i = 0; i < size; i++) {
			int key =scanner.nextInt();
			String value = scanner.next();
			map.put(key, value);
		}
		
		System.out.println(UserMainCode.getMaxValue(map));
	}

}

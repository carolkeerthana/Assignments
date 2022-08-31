package com.te.reverse_split;

import java.util.Scanner;

public class Main extends UserMainCode{

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter a string and character :");
		String str = scanner.next();
		String ch = scanner.next();

		System.out.println(reshape(str, ch));

	}

}

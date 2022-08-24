package com.te.check_characters;

import java.util.Scanner;

public class Main extends UserMainCode {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string :");
		String str = scanner.nextLine();
		
		int res=UserMainCode.checkCharacters(str);
		if(res==1) {
		System.out.println("valid");
		}
		else {
			System.out.println("invalid");
		}
	}

}

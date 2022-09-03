package com.te.asterisk_characters;

public class UserMainCode {
	
	public static boolean scanStarNeighbors( String str) {
		String ast = "*";
		String  [] arr = str.split("\\*");
		
		boolean res = false ;
		for (int i = 0; i < arr.length-1; i++) {
			
				if(arr[i].charAt(arr[i].length()-1)==arr[i+1].charAt(0))
					res = true;	
		
		}
		return res;	
	}

}

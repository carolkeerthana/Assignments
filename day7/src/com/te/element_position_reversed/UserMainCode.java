package com.te.element_position_reversed;

public class UserMainCode {
	public static int getElementsPosition(String[] ar, String str) {
		String[] ar1 = new String[ar.length];
		for (int i = 0; i < ar1.length; i++) {
			ar1[i] = ar[ar1.length - i - 1];
		}
		int temp = 0;
		for (int j = 0; j < ar1.length; j++) {
			if (ar1[j].equals(str))
				temp = j + 1;
		}
		return temp;
	}

}

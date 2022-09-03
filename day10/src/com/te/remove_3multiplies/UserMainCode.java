package com.te.remove_3multiplies;

import java.util.ArrayList;

public class UserMainCode {
	public static ArrayList<Integer> removeMultiplesOfThreee(ArrayList<Integer> arrayList) {

		ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
		for (int i = 0; i < arrayList.size(); i++) {
			if (i != 0 && i % 2 == 0) {
				arrayList.remove(i);
			}
		}
		return arrayList;

	}
}

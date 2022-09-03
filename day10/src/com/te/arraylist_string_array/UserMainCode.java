package com.te.arraylist_string_array;

import java.util.ArrayList;
import java.util.Collections;

public class UserMainCode {
	public static String[] convertToStringArray(ArrayList<String> arrayList) {

		Collections.sort(arrayList);
		String[] arr = new String[arrayList.size()];
		for (int i = 0; i < arrayList.size(); i++) {
			arr[i] = arrayList.get(i);
		}

		return arr;

	}

}

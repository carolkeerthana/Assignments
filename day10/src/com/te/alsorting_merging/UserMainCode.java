package com.te.alsorting_merging;

import java.util.ArrayList;
import java.util.Collections;

public class UserMainCode {
	public static ArrayList sortMergedArrayList(ArrayList<Integer> arrayList1, ArrayList<Integer> arrayList2) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList1.addAll(arrayList2);
		// System.out.println(arrayList1);
		Collections.sort(arrayList1);
		// System.out.println(arrayList1);
		arrayList.add(arrayList1.get(2));
		arrayList.add(arrayList1.get(6));
		arrayList.add(arrayList1.get(8));

		return arrayList;

	}

}

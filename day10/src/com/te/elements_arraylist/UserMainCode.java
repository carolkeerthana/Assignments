package com.te.elements_arraylist;

import java.util.ArrayList;
import java.util.List;

public class UserMainCode {
	public static int[] arrayListSubractor(ArrayList<Integer> arrayList1, ArrayList<Integer> arrayList2){
		
		ArrayList<Integer> list1 = new ArrayList<Integer>(arrayList1);
		list1.removeAll(arrayList2);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>(arrayList2);
		list2.removeAll(arrayList1);
		list1.addAll(list2);
		//System.out.println(list1);
		
		int[] arr = new int[list1.size()];
		Object[] array = list1.toArray();
		for (int i = 0; i < array.length; i++) {
			arr[i] =(int) array[i];
		}
		return arr;

		
}
}
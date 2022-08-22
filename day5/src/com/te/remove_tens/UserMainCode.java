package com.te.remove_tens;

public class UserMainCode {
	public static int[] removeTens(int[] arr) {
	
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==10) {
				arr[i]=0;
			}
			
			for (int j = 0; j < arr.length; j++) {
				if(arr[j]==0) {
					for (int j2 = j; j2 < arr.length; j2++) {
			if(arr[j2]!=0) {
				arr[j]=arr[j2];
				arr[j2]=0;
				j++;
		}
					}
					
				}
			}
		}
		return arr;
		

}
}
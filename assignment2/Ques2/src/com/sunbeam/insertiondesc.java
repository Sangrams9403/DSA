package com.sunbeam;

import java.util.Arrays;

public class insertiondesc {
	
	public static void desc(int arr[]) {
		int n = arr.length;
		for(int i=1;i<n;i++) {
			int j =i-1;
			int temp = arr[i];
			while(j>=0 && temp>arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
		
	}

	public static void main(String[] args) {
		int arr[] = {55, 44, 22, 66, 11, 33};
		
		System.out.println("Array before sort : " + Arrays.toString(arr));

		desc(arr);
			
		System.out.println("Array after sort : " + Arrays.toString(arr));
	}

}

package com.sunbeam;

import java.util.Arrays;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {0, 6, 14, 3, 26, 8, 18, 21, 9, 5};
		
		MinHeap h = new MinHeap();
		
		System.out.println("Array before : " + Arrays.toString(arr));
		h.heapSort(arr);
		System.out.println("Array after : " + Arrays.toString(arr));
	}

}

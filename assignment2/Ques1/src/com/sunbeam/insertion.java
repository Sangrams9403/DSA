package com.sunbeam;

public class insertion {
	
	public static int insort(int arr[]) {
		int n = arr.length;
		int count = 0;
		for(int i=1;i<n;i++) {
			int temp = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>arr[i]) {
				count++;
				arr[j+1]=arr[j];
				
				j--;
			}
			arr[j+1]=temp;
			
		}
		return count;
	}
	public static void main(String[] args) {
		int arr[] = {55, 44, 22, 66, 11, 33};
		
		System.out.println("No of camparisons:"+insort(arr));
	}
}

package com.sunbeam;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashTable tbl = new HashTable(10);
		int arr[] = {10,20,30,40,10,20,70,80,20};
		for(int i=0; i<arr.length;i++)
		{
			tbl.put(arr[i]);
		}
		int newARR[] = null;
		
		int res =tbl.get(20);
		System.out.println(res);
		
		
	}

}

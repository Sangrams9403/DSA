package com.sunbeam;

import java.util.LinkedList;
import java.util.List;

public class HashTable {
	static class Entry{
		private int key;
		private int value;
		
		public Entry(int k)
		{
			key=k;
			value=1;
		}
		
		
	}
	private final int size;
	private List<Entry>arr[];
	private int count;
	public HashTable(int s)
	{
		size=s;
		count=0;
		arr = new List[size];
		for(int i = 0 ; i < size ; i++)
			arr[i] = new LinkedList<HashTable.Entry>();
	}
	public int h(int key) {
		return key % size;
	}

	public void put(int key) {
		//1. find slot for given key
		
		int slot = h(key);
		
		//2. if key value pair is already exist, then update value of the key
		if(!arr[slot].isEmpty()) {
			for(Entry e : arr[slot]) {
				if(e.key == key) {
					e.value +=1;
					
					return;
				}
			}
			
		}
		
		//3. create and add entry at slot
		Entry e = new Entry(key);
		arr[slot].add(e);	
		count++;
		System.out.println("Count:"+count);
	}
	public int get(int key) {
		//1. find slot for given key
		int slot = h(key);

		//2. if list of slot is not empty, then search the key
		if(!arr[slot].isEmpty()) {
			for(Entry e : arr[slot]) {
				if(e.key == key) {
					return e.value;
				}
			}
		}
		// if key is not found
		return 0;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public List<Entry>[] getArr() {
		return arr;
	}
	public void setArr(List<Entry>[] arr) {
		this.arr = arr;
	}
	
	public int getMode()
	{
		for (List<Entry> list : arr) {
			
			
		}
		return 1;
	}

			

}

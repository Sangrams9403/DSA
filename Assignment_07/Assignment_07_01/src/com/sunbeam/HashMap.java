package com.sunbeam;
import java.util.LinkedList;
import java.util.List;
public class HashMap {
	public static class Entry{
		private String key;
		private int value;
		public Entry(String k)
		{
			key=k;
			value=1;
		}
		
			
		
		
		
	}
	private List<Entry> arr[];
	private final int size;
	public HashMap(String[] str) {
		size=str.length;
		arr = new List[size+1];
		for(int i = 0 ; i <size ; i++)
			arr[i] = new LinkedList<HashMap.Entry>();
	}
	public void put(String[] str)
	{
		for(int i=0; i<str.length;i++)
		{
			Entry e = new Entry(str[i]);
			arr[i].add(e);
			for(int j=i+1;j<str.length;j++)
			{
				if(e.key==str[j])
				{
					e.value+=1;
				}
			}
		}
	}
	public void display()
	{
		for (List<Entry> list : arr) {
			System.out.println(list);
			
		}
	}


}

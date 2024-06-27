package com.sunbeam;

import com.sunbeam.List.Node;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List li = new List();
		li.AddFirst(10);
		li.AddFirst(20);
		li.AddFirst(30);
		li.AddFirst(40);
		li.AddFirst(50);
		li.display();
		li.sortedInsert(li.getHead(), 25);
		li.display();
				
	}

}

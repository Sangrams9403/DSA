package com.sunbeam;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List li =new List();
		li.AddFirst(10);
		li.AddFirst(20);
		li.AddFirst(30);
		li.AddFirst(40);
		li.AddFirst(50);
		//li.searchPosition();
	
		//li.insertAfter(100, 10);
		li.insertBefore(100,40);
		li.display();

	}

}

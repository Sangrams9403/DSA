package com.sunbeam;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List li = new List();
		li.addFirst(10);
		li.addFirst(20);
		li.addFirst(50);
		li.addFirst(40);
		li.addLast(100);
		//li.DeleteFirst();
		//li.DeleteLast();
		//li.addPosition(150, 4);
		li.deleltePosition(3);
		
		li.display();
		
				
	}

}

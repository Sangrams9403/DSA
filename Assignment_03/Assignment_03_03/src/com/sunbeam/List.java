package com.sunbeam;

import java.util.Stack;

public class List {
	public static class Node{
		private int data;
		private Node next;
		
		public Node(int value)
		{
			data = value;
			next = null;
		}
	}
	
	private Node head;
	private Node tail;
	int counter;
	public List()
	{
		head=null;
		tail=null;
		counter=0;
		
	}
	
	public void addFirst(int value)
	{
		Node newnode = new Node(value);
		newnode.next =head;
		head = newnode;
		counter++;
		
	}
	public void display()
	{
		Node trav = head;
		Stack <Integer> st =new Stack<Integer>();
		while(trav!=null)
		{
			
			st.push(trav.data);
			System.out.println(trav.data);
			trav = trav.next;
			
		}
		for(int i=0; i<counter ;i++)
		{
			System.out.print(st.pop()+" ");
			
		}
		
		
		//System.out.println(counter);
		
	}
	
	
	

}

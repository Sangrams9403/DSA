package com.sunbeam;

public class List {
	public static class Node{
		private int data;
		private Node next;
		
		public Node(int value)
		{
			data=value;
			next=null;
		}
	}
	
	private Node head;
	public List()
	{
		head=null;
	}
	public boolean isEmpty()
	{
		return head==null;
	}
	
	public void AddFirst(int value)
	{
		Node newnode = new Node(value);
		newnode.next = head;
		head=newnode;
	}
	public void display()
	{
		Node trav =head;
		
		while(trav!=null)
		{
			System.out.print(trav.data+" ");
			trav = trav.next;
		}
	
	}
	public void addPosition(int value, int pos) {
		//1. create newnode with given data
		Node newnode = new Node(value);
		//2. if list is empty
		if(head == null)
			// add newnode into head itself
			head = newnode;
		// special case : pos <= 1
		else if(pos <= 1)
			AddFirst(value);
		//3. if list is not empty
		else {
			//a. traverse till pos -1 node
			Node trav = head;
							// special case 1 : pos > NodeCount + 1
			for(int i = 1 ; i < pos - 1  && trav.next != null; i++)
				trav = trav.next;
			//b. add pos node into next of newnode
			newnode.next = trav.next;
			//c. add newnode into next of pos -1 node 
			trav.next = newnode;
		}
	}

	
	public void insertAfter(int data, int node)
	{
		Node newnode = new Node(data);
		Node trav =head;
		//int count =1;
		
		while(trav!=null)
		{
			//count++;
			
			//trav =trav.next;
			if(trav.data==node)
			{
				//System.out.println(trav.data);
				//System.out.println(count);
				//addPosition(data, count+1);
				
				break;
				
			}
			trav =trav.next;
			
		}
		newnode.next =trav.next;
		trav.next = newnode;
		
		
		
	}
	public void insertBefore(int data, int node)
	{
		Node newnode = new Node(data);
		Node trav =head;
		Node prev =head;
		
		while(trav!=null)
		{
			if(trav.data==node)
			{
				break;
			}
			prev =trav;
			trav = trav.next;
		}
		newnode.next=trav;
		prev.next=newnode;
		
	}
		
	
	
	

}

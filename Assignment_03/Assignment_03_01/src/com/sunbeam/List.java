package com.sunbeam;

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
	//private Node head;
	private Node tail;
	int count;
	public List() {
		//head=null;
		tail=null;
		count =0;
	}
	
	public boolean isEmpty()
	{
		return tail==null;
	}
	
	public void DeleteAll()
	{
		tail=null;
	}
	public void display()
	{
		if(tail==null)
		{
			System.out.println("List is Empty");
		}
		Node trav = tail.next;
		do {
			System.out.println(trav.data);
			trav =trav.next;
		}while(trav!=tail.next);
	}
	public void addFirst(int value)
	{
		Node newnode = new Node(value);
		if(tail==null)
		{
			tail=newnode;
			newnode.next =tail;
		}
		else
		{
			newnode.next = tail.next;
			tail.next = newnode;
		}
		count++;
	}
	public void addLast(int value)
	{
		Node newnode = new Node(value);
		if(tail==null)
		{
			tail=newnode;
			newnode.next =tail;
		}
		else
		{
			newnode.next = tail.next;
			tail.next =newnode;
			tail =newnode;
		}
		count++;
		
	}
	
	public void DeleteFirst()
	{
		if(tail==null)
		{
			return;
		}
		else if(tail.next ==tail)
		{
			tail=null;
		}
		else
		{
			tail.next =tail.next.next;
			
		}
		count--;
	}
	public void DeleteLast()
	{
		if(tail==null)
		{
			return;
		}
		else if(tail.next ==tail)
		{
			tail=null;
		}
		else
		{
			Node trav =tail;
			
			while(trav.next!=tail)
			{
				trav = trav.next;
			}
			trav.next =tail.next;
			tail=trav;
			
		}
		count--;
	}
	
	public void addPosition(int value, int pos)
	{
		Node newnode =new Node(value);
		if(pos<1 || pos >count +1)
		{
			System.out.println("Invalid Position");
		}
		else if(pos==1)
		{
			addFirst(value);
			return;
		}
		else
		{
			Node trav =tail.next;
			System.out.println(count);
			for(int i =1;i<pos-1; i++)
			{
				trav =trav.next;
			}
			newnode.next =trav.next;
			trav.next =newnode;
		}
		count++;

	}
	public void deleltePosition(int pos)
	{
		//Node newnode =new Node(value);
		if(pos<1 || pos >count)
		{
			System.out.println("Invalid Position");
		}
		else if(pos==1)
		{
			DeleteFirst();
			return;
		}
		else
		{
			Node trav =tail.next;
			System.out.println(count);
			for(int i =1;i<pos-1; i++)
			{
				trav =trav.next;
			}
			trav.next = trav.next.next;
		}
		count--;

	}

}

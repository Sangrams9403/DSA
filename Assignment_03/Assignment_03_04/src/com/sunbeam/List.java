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
	private int counter;
	public List()
	{
		head=null;
		counter=0;
	}
	Node sortedInsert(Node head, int value)
	{
		Node newnode = new Node(value);
		if(head==null)
		{
			return newnode;
		}
		if(value <head.data)
		{
			newnode.next =head;
			head=newnode;
			return newnode;
		}
		Node curr =head;
		while(curr.next!=null && curr.next.data<value)
		{
			
			curr = curr.next;
		}
		newnode.next = curr.next;
		curr.next =newnode;
		
		
		return newnode;
	}
	
	public Node getHead() {
		return head;
	}
	public void setHead(Node head) {
		this.head = head;
	}
	public void AddFirst(int value)
	{
		Node newnode = new Node(value);
		newnode.next =head;
		head = newnode;
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
	
}

package com.list;

class CircularLinkedList {

	private Node tail;

	public CircularLinkedList() {

		this.tail = null;
	}

	public void insertElement(int data) {
		Node newNode = new Node(data);

		if (tail == null) {
			tail = newNode;
			newNode.next=newNode;  
		} else {
			Node temp = tail.next;
			
			tail.next=newNode;
			
			newNode.next=temp;
			
		}

	}

	public void deleteElement(int d) {
		
		if (tail == null) {
			
			return;
		}
		
		Node prev = tail;
		
		Node curr = prev.next;
		
			
		while(curr.data!=d)
		{
			prev=curr;
			curr=curr.next;
		}
		
		if(curr==tail)
		{
			tail=prev;
		}
		
		prev.next=curr.next;
		
		curr.next=null;
		

	}
	
	
	
	
	

	public void display() {
		
		Node temp=tail;
		
		
		
		do
		{
			tail=tail.next;
			System.out.println(tail.data);
		}
		while(temp!=tail);
		
		
		
		
	}
}


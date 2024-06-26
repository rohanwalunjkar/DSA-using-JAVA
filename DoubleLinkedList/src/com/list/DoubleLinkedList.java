package com.list;

class DoubleLinkedList {

	private Node head;

	public DoubleLinkedList() {

		this.head = null;
	}

	public void insertAtlast(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
		} else {
			
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
			
			newNode.prev=temp;
		}

	}

	public void deleteAtfirst() {
		
		if (head == null) {
			
			return;
		}

		Node temp = head;
		
		head=head.next;
		
		head.prev=null;
		
		temp.next=null;

	}
	
	
	public void deleteAtlast() {
		
		if (head == null) {
			return;
		}
		
		Node temp = head;
		while (temp.next.next!= null) {
			temp = temp.next;
			
		}
		
		temp.next=null;
		
		
	}
	
	
	public void insertAtfirst(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}

		newNode.next=head;
		
		head.prev=newNode;
		
		head=newNode;
		
		
		
		
		
		

	}
	
	

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
}


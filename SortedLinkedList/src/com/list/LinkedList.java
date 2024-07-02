package com.list;

class LinkedList {

	private Node head;
	private Node current;
	private Node previous; 

	public LinkedList() {

		this.head = null;
		
	}

	public void insertElement(int data) {
		
		Node newNode=new Node(data);
		
		if(head==null){
			
			head=newNode;
		}
		
		previous=null;
		current=head;
		while(current!=null){
			
			if(current.data>newNode.data) {
				break;
			}
			previous=current;
			current=current.next;
		}
		
		if(previous==null) {
			newNode.next=head;
			head=newNode;
			return;
		}
		
		previous.next=newNode;
		
		newNode.next=current;
		

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


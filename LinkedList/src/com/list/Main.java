package com.list;

public class Main {

	public static void main(String[] args) {
	
		
		
		LinkedList l1=new LinkedList();
		
		l1.insertAtlast(10);
		l1.insertAtlast(2);
		l1.insertAtlast(9);
		l1.insertAtlast(15);
		l1.insertAtlast(12);
		
		l1.display();

		//l1.deleteAtfirst();
		
		l1.insertAtfirst(1112);
		
		l1.display();
		
		l1.deleteAtlast();
		l1.display();
		
		

	}

}

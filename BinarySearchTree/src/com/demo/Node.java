package com.demo;



public class Node implements Comparable<Node> {

	 int data;
	 Node left;
	 Node right;
	
	
	public Node(int data) {
		super();
		this.data = data;
		this.left=null;
		this.right=null;
	}


	@Override
	public int compareTo(Node o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

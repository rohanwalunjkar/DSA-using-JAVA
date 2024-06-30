package com.demo;

import java.util.PriorityQueue;
import java.util.Queue;



public class BinarySearchTree {

	public Node root;

	public BinarySearchTree() {
		super();
		this.root = null;
	}
	
	
	public Node addNode(Node root,int value)
	{
		if(root==null)
		{
			root=new Node(value);
			return root;
		}
		
		if(root.data>value)
		{
			root.left=addNode(root.left,value);
		}
		
		if(root.data<value)
		{
			root.right=addNode(root.right,value);
		}
		
		return root;
		
	}
	
	
	void takeInput(int value)
	{
		root=addNode(root,value);
	}
	
	
	public void levelOrder() 
	{

		Queue<Node> q1 = new PriorityQueue<Node>();

		q1.add(root);
		// System.out.println(root.data);

		while (!q1.isEmpty()) {
				
			Node temp=q1.peek();
			System.out.println(temp.data);

			q1.remove();

			if (temp.left != null) {
				q1.add(temp.left);
			}
			if (temp.right != null) {
				q1.add(temp.right);
			}

		}
		
		
	}
	
	public int findMinValue(Node root) {
		if(root==null)
			return 0;
		while(root.left!=null) {
			root=root.left;
		}
		return root.data;
		
	}
	
	public int findMaxValue(Node root) {
		if(root==null)
			return 0;
		
		while(root.right!=null) {
			root=root.right;
		}
		return root.data;
		
	}
	

	
	
	public int height(Node root) {
		if(root==null)
			return 0;
		
		int l=height(root.left);
		int r=height(root.right);
		
		if(l>r)
			return 1+l;
		else  
			return 1+r;

		
	}
	
	public Node findMaxNode(Node root) {
		if(root==null)
			return root;
		
		while(root.right!=null) {
			root=root.right;
		}
		return root;
		
	}

	
	public Node deleteElement(Node roo,int val){
		Node temp;
		
		if(roo==null)
			System.out.println("Root is empty");
		else if(roo.data>val)
			roo.left=deleteElement(roo.left,val);
		else if(roo.data<val)
			roo.right=deleteElement(roo.right,val);
		else {
			if(roo.left!=null && roo.right!=null) {
				temp=findMaxNode(roo.left);
				
				//System.out.println(temp.data);
				roo.data=temp.data;
				//System.out.println(roo.data);
				roo.left=deleteElement(roo.left,roo.data);
			}
			else {
				if(roo.left==null && roo.right==null)
					roo=null;
				else if(roo.left==null)
					roo=roo.right;
				else if(roo.right==null)
					roo=roo.left;
//				else 
//				{
//					roo=null;
//				}
					
			}
			
		}
		
		return roo;
			
		
		
		
		
	}
	
	
}






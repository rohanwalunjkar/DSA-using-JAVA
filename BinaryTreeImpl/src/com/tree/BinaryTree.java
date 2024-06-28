package com.tree;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

import javax.naming.ldap.ExtendedRequest;

public class BinaryTree {

	Scanner sc = new Scanner(System.in);
	private Node root;

	public BinaryTree() {
		this.root = null;
	}
//	public void  addNode(int data) {
//		buildTree(root);
//	}

	public Node buildTree(Node root) {

		System.out.println("Enter data");

		int data = sc.nextInt();

		root = new Node(data);

		if (data == -1) {
			return null;
		}

		System.out.println("Enter data for inserting in the left of" + data);

		root.left = buildTree(root.left);

		System.out.println("Enter data for inserting in the right of" + data);

		root.right = buildTree(root.right);

		return root;

	}

	public void levelOrder(Node root) {

		Queue<Node> q1 = new LinkedList<Node>();

		q1.add(root);
		// System.out.println(root.data);

		while (!q1.isEmpty()) {
				
			Node temp=q1.poll();
			System.out.println(temp.data);

			//q1.remove();

			if (temp.left != null) {
				q1.add(temp.left);
			}
			if (temp.right != null) {
				q1.add(temp.right);
			}

		}
		
		
		
		

	}

	public void inOrder(Node root) {
		if (root == null)
			return;

		inOrder(root.left);
		System.out.println(root.data);
		inOrder(root.right);
		
		

	}
	


	public Node getRoot() {
		// TODO Auto-generated method stub
		return root;
	}

	public int nodeCount(Node root) {
		
		if(root==null)
			return 0;
		
		int l=nodeCount(root.left);
		int r=nodeCount(root.right);
		
		return 1+l+r;
		
	}
	
	
	public int leafNodeCount(Node root) {
		
		if(root==null)
			return 0;
		
		if(root.left==null && root.right==null)
			return 1;
		int l=leafNodeCount(root.left);
		int r=leafNodeCount(root.right);
		
		return l+r;
		
	}
	
	public int CountNodesWithValue(Node root,int value) {
		if(root==null)
			return 0;
		
	
		int l=CountNodesWithValue(root.left,value);
		if(root.data==value)
			return 1;
		int r=CountNodesWithValue(root.right,value);
		
		return l+r;
		
		 
	}


}

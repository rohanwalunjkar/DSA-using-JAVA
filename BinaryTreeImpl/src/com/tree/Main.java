package com.tree;

public class Main {

	public static void main(String[] args) {
		
		
		
		BinaryTree tree=new BinaryTree();
		Node root=tree.getRoot();
		Node r1= tree.buildTree(root);
		//tree.inOrder(r1);
		
		tree.levelOrder(r1);
		
//		System.out.println(tree.leafNodeCount(r1));
//		System.out.println(tree.nodeCount(r1));
//		System.out.println(tree.CountNodesWithValue(r1,20));
		
	}

}

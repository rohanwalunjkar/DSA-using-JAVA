package com.demo;

public class Main {

	public static void main(String[] args) {
		
		
		BinarySearchTree bts=new BinarySearchTree();
		
		bts.takeInput(8);
		bts.takeInput(3);
		bts.takeInput(10);
		bts.takeInput(1);
		bts.takeInput(6);
		bts.takeInput(14);
		bts.takeInput(4);
		bts.takeInput(7);
		bts.takeInput(13);
		
		
		
		
		bts.levelOrder();
		
//		int min= bts.findMinValue(bts.root);
//		System.out.println("Min value : "+min);
//		
//		int max=bts.findMaxValue(bts.root);
//		System.out.println("Max Value : "+max);
//		
//		int height=bts.height(bts.root);
//		System.out.println("Height : "+height);
		
		//System.out.println(bts.root.data);
		
		bts.deleteElement(bts.root,7);
		
		
		System.out.println("////////////////////////");
		bts.levelOrder();
		
	}

}

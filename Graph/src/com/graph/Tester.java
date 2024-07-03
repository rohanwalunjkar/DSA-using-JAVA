package com.graph;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n;
		System.out.println("Enter the number of nodes");
		n=sc.nextInt();
		
		int m;
		System.out.println("Enter the number of edgs");
		m=sc.nextInt();
		
		
		Graph graph=new Graph();
		
		for(int i=0;i<m;i++)
		{
			int u,v;
			u=sc.nextInt();
			v=sc.nextInt();
			
			graph.addEdge(u, v, 0);
		}
		
		graph.printAdjList();
		
		graph.BFS(0);
		System.out.println("////");
		graph.DFS(0);
	}

}

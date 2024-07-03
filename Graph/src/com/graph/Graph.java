package com.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class Graph {

	Map<Integer, List<Integer>> adj = new HashMap<Integer, List<Integer>>();

	void addEdge(int u, int v, int direction) {
		adj.putIfAbsent(u, new ArrayList<Integer>());
		adj.get(u).add(v);

		if (direction == 0) {
			adj.putIfAbsent(v, new ArrayList<Integer>());
			adj.get(v).add(u);
		}
	}

	void printAdjList() {

		for (Map.Entry<Integer, List<Integer>> entry : adj.entrySet()) {
			System.out.print(entry.getKey() + ": ");
			for (Integer neighbor : entry.getValue()) {
				System.out.print(neighbor + " ");
			}

			System.out.println();
		}
	}

	void BFS(int start) {
		Map<Integer, Boolean> visited = new HashMap<Integer, Boolean>();
		Queue<Integer> queue = new LinkedList<>();

		visited.put(start, true);

		queue.add(start);

		while (!queue.isEmpty()) {
			int node = queue.poll();

			System.out.println(node);

			for (int neighbor : adj.get(node)) {
				if (!visited.containsKey(neighbor)) {
					visited.put(neighbor, true);

					queue.add(neighbor);
				}
			}
		}

	}

//	void DFS(int start)
//	{
//		Map<Integer , Boolean> visited=new HashMap<Integer, Boolean>();
//		Stack<Integer> stack=new Stack<Integer>();
//		
//		stack.push(start);
//		
//		while(!stack.isEmpty())
//		{
//			int vertex=stack.pop();
//			
//			if(!visited.containsKey(vertex))
//				stack.push(start);
//			
//			System.out.print(vertex + " ");
//	
//			
//			for(int neighbor:adj.get(vertex))
//			{
//				visited.put(neighbor, true);
//				stack.push(neighbor);
//			}
//		}
//		
//	}

	void DFS(int start) {
		Map<Integer, Boolean> visited = new HashMap<Integer, Boolean>();

		dfs(start, visited);
	}

	private void dfs(int start, Map<Integer, Boolean> visited) {
		
		System.out.println(start);
		
		visited.put(start,true);
		
		for(int i:adj.get(start))
		{
			if(!visited.containsKey(i))
				dfs(i,visited);
		}

	}
}

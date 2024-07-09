package com.sort;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size");

		int size = sc.nextInt();
		int arr[] = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.println("Enter the " + (i + 1) + " element");
			arr[i] = sc.nextInt();
		}
		
		for(int i =0;i<size-1;i++) {
			for(int j=i+1;j<size;j++) {
				
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;					
				}
				
			}
		}
		
		System.out.println("Sorted Array");
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]+" ");
			
		}

	}

}

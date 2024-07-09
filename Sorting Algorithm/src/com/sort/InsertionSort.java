package com.sort;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size");

		int size = sc.nextInt();
		int arr[] = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.println("Enter the " + (i + 1) + " element");
			arr[i] = sc.nextInt();
		}
		
		for(int i=1;i<size;i++)
		{	
			int temp=arr[i];
			int j;
			for(j=i-1;j>=0;j--)
			{
				if(arr[j]>temp)
				{
					arr[j+1]=arr[j];
				}
				else
				{
					break;
				}
			}
			
			arr[j+1]=temp;
		}
		
		System.out.println("Sorted Array");
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]+" ");
			
		}

	
	}
	
	
}

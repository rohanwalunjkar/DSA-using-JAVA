package com.sort;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size");

		int size = sc.nextInt();
		int arr[] = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.println("Enter the " + (i + 1) + " element");
			arr[i] = sc.nextInt();
		}
		
		int f=0;
		
		for(int i =1;i<size;i++) {
			for(int j=0;j<size-i;j++) {
				
				if(arr[j]>arr[j+1]) {
					f=1;
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			
			}
			if(f==0)
			{
				System.out.println("Array is already Sorted");
				break;
			}
		}
		
		System.out.println("Sorted Array");
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]+" ");
			
		}
		
		sc.close();
	}

}

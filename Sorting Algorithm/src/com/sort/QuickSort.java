package com.sort;

import java.util.Scanner;

public class QuickSort {


	private static void quickSort(int[] arr, int s, int e) {
		
		if(s>=e)
		{
			return ;
		}
		
		int p=partition(arr,s,e);
		
		quickSort(arr,s, p-1);
		
		quickSort(arr, p+1, e);
	}
	
		
	private static int partition(int[] arr, int s, int e) {
		
		
//		if(s==e) {
//			return 0;
//		}
		
		int pivot=arr[s];
		int cnt=0;
		
		
		for(int i=0;i<=e;i++)
		{
			if(arr[i]<pivot)
			{
				cnt++;
			}
		}
		
		int pivotIndex=s+cnt;
		
		int temp=arr[s];
		arr[s]=arr[pivotIndex];
		arr[pivotIndex]=temp;
		
		int i=s;
		int j=e;
		
		
		while(i<pivotIndex && j>pivotIndex)
		{
			while(arr[i]<arr[pivotIndex])
			{
				i++;
			}
			
			while(arr[j]>arr[pivotIndex])
			{
				j--;
			}
			
			
			int tem=arr[i];
			arr[i]=arr[j];
			arr[j]=tem;
			
			i++;
			j--;
		}
		
		return pivotIndex;
	}

	
	
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Size");

			int size = sc.nextInt();
			int arr[] = new int[size];

			for (int i = 0; i < size; i++) {
				System.out.println("Enter the " + (i + 1) + " element");
				arr[i] = sc.nextInt();
			}
			
			
			quickSort(arr,0,size-1);
			

			System.out.println("Sorted Array");
			for (int i = 0; i < size; i++) {
				System.out.println(arr[i] + " ");

			}

		}

}
		

package com.demo;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size");
		
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the "+(i+1)+" element");
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the element do you want to search");
		int ele=sc.nextInt();
		
		int s=0;
		int e=size-1;
		int mid=s+(e-s)/2;
		
		int f=0;
		
		while(s<=e)
		{
			if(arr[mid]==ele)
			{
				f =1;
				System.out.println("The number is present at "+mid+" position");
			}
			
			if(arr[mid]>ele)
			{
				e=mid-1;
			}
			else
			{
				s=mid+1;
			}
			
			mid=s+(e-s)/2;
		}
		
		if(f==0)
			System.out.println("The number is not present");
		
		sc.close();
	}
}

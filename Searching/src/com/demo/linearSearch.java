package com.demo;

import java.util.Scanner;

public class linearSearch {

	public static void main(String [] args)
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
		
		int f=0;
		
		for(int i=0;i<size;i++)
		{	
			if(ele==arr[i])
			{	
				f=1;
				System.out.println("The number is present at "+i+" position");
			}
			
			
		}
		
		if(f==0)
			System.out.println("The number is not present");
		
		sc.close();
	}
	
	
}

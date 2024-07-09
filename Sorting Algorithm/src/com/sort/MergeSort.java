package com.sort;

import java.util.Scanner;

public class MergeSort {

	private static void merge(int[] arr, int s, int e) {

		int mid = (s + e )/ 2;

		int len1 = mid - s + 1;
		int len2 = e - mid;

		int first[] = new int[len1];
		int second[] = new int[len2];

		int k = s;
		for (int i = 0; i < len1; i++) {
			first[i] = arr[k++];
		}

		k = mid + 1;
		for (int i = 0; i < len2; i++) {
			second[i] = arr[k++];
		}

		k = s;
		int ind1 = 0;
		int ind2 = 0;
		
		while (ind1 < len1 && ind2 < len2) {

			if (first[ind1] < second[ind2]) {
				arr[k++] = first[ind1++];
			} else {
				arr[k++] = second[ind2++];
			}
		}

		while (ind1 < len1) {

			arr[k++] = first[ind1++];

		}

		while (ind2 < len2) {

			arr[k++] = second[ind2++];

		}

	}

	public static void mergeSort(int arr[], int s, int e) {
		
		if (s >= e)
		{
			return;
		
		}

		int mid = (s + e)/ 2;

		mergeSort(arr, s, mid);

		mergeSort(arr, mid + 1, e);

		merge(arr, s, e);
	
		

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
		
		
		mergeSort(arr,0,size-1);
		

		System.out.println("Sorted Array");
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i] + " ");

		}

	}

}

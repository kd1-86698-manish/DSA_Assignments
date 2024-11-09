package com.manish;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		int arr[] = { 11, 22, 33, 44, 55, 66, 77, 88 };
		int arr[] = { 88, 77, 66, 55, 44, 33, 22, 11 };

		System.out.print("Enter Key to Search Element : ");
		int key = sc.nextInt();

		int index = binarySearch(arr, key);

		if (index == -1)
			System.out.println("Element not found...");
		else
			System.out.println("Element Found at index " + index);

	}

	public static int binarySearch(int[] arr, int key) {
		int left = 0;
		int right = arr.length - 1;
		int mid;

		while (left <= right) {
			mid = (left + right) / 2;

			if (key == arr[mid])
				return mid;
			else if (key < arr[mid])
				left = mid + 1;
			else
				right = mid - 1;
		}

		return -1;
	}
}

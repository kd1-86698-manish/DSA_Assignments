package com.manish;

import java.util.Scanner;

public class BinarySearchMain {

	public static int binarySearch(int[] arr, int ele) {
		int left = 0;
		int right = arr.length - 1;
		int mid;
		int compare = 0;
		while (left <= right) {
			compare++;
			mid = (left + right) / 2;

			if (ele == arr[mid]) {
				System.out.println("Number of Comparisons : " + compare);
				return mid;
			} else if (ele < arr[mid])
				right = mid - 1;
			else
				left = mid + 1;
		}
		System.out.println("Number of Comparisons : " + compare);
		return -1;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = { 11, 22, 33, 44, 55 };

		System.out.print("Enter Element to Search : ");
		int ele = sc.nextInt();

		int index = binarySearch(arr, ele);

		if (index == -1)
			System.out.println("Element is not found");
		else
			System.out.println("Element is Found at index : " + index);
	}

}

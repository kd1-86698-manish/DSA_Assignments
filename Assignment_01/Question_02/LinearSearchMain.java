package com.manish;

import java.util.Scanner;

public class LinearSearchMain {

	public static int linearSearch(int[] arr, int ele) {
		int compare = 0;
		for (int i = 0; i < arr.length; i++) {
			compare++;
			if (ele == arr[i]) {
				System.out.println("Comparisons - " + compare);
				return i;
			}
		}
		System.out.println("Comparisons - " + compare);
		return -1;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = { 33, 66, 88, 44, 99, 77, 11, 22, 55 };

		System.out.println("Enter Element to Search :");
		int ele = sc.nextInt();

		linearSearch(arr, ele);

	}

}

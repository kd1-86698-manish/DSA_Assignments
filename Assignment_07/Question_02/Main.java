package com.manish;

public class Main {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 2, 5, 6, 4, 2, 7, 9, 8, 2, 9 };

		maximumOccuredElement(arr);

	}

	private static void maximumOccuredElement(int[] arr) {

		int maxCount = 0;
		int ele = 0;

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j])
					count++;
			}
			if (count > maxCount) {
				maxCount = count;
				ele = arr[i];
			}
		}
		System.out.println("Element with Highest Occurance : " + ele);
		System.out.println("Count : " + maxCount);
	}

}

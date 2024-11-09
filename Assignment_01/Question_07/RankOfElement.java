package com.manish;

import java.util.Arrays;
import java.util.Scanner;

public class RankOfElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int arr[] = { 10, 20, 15, 3, 4, 4, 1 };

		System.out.println(Arrays.toString(arr));

		System.out.println("Enter Element to find its Rank : ");
		int ele = sc.nextInt();

		int rank = rankOfElement(arr, ele);

		System.out.println("Rank of " + ele + " is " + rank);
	}

	public static int rankOfElement(int[] arr, int ele) {

		int rank = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= ele)
				rank++;
		}
		return rank;
	}

}

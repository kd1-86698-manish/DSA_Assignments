package com.manish;

import java.util.Scanner;

public class NthOccuranceOfElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = { 11, 33, 11, 44, 22, 77, 55, 11, 66, 22 };
		System.out.println("Enter Element Search : ");
		int ele = sc.nextInt();

		System.out.println("Enter Ocurrance OfElement : ");
		int occur = sc.nextInt();

		int index = nthOccurance(arr, ele, occur);

		if (index == -1)
			System.out.println(occur + " nth occurance of element " + ele + " is not found  ");
		else
			System.out.println(occur + " nth occurance of element " + ele + " found at index " + index);
	}

	public static int nthOccurance(int[] arr, int ele, int occur) {

		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ele) {
				count++;
				if (count == occur) {
					return i;
				}
			}
		}
		return -1;
	}

}

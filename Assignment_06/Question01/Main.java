package com.manish;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int arr[] = { 0, 44, 99, 77, 33, 55, 22, 88, 11, 66 };
		HeapSortUsingMeanHeap heap = new HeapSortUsingMeanHeap();

		System.out.println("\nArray Before Sort : " + Arrays.toString(arr));

		heap.minHeap(arr);
		System.out.println("\nArray After Sort : " + Arrays.toString(arr));

	}
}

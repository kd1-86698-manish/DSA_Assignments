package com.manish;

public class MaxHeap {

	private int arr[];
	private int SIZE;

	public MaxHeap(int size) {
		arr = new int[size + 1];
		SIZE = 0;
	}

	public void addHeap(int value) {
		SIZE++;
		arr[SIZE] = value;
		int childIndex = SIZE;
		int parentIndex = childIndex / 2;
		while (parentIndex >= 1) {
			if (arr[parentIndex] > arr[childIndex])
				break;
			int temp = arr[parentIndex];
			arr[parentIndex] = arr[childIndex];
			arr[childIndex] = temp;
			childIndex = parentIndex;
			parentIndex = childIndex / 2;
		}

	}

	public int deleteHeap() {
		int max = arr[1];
		arr[1] = arr[SIZE];
		SIZE--;
		int parentIndex = 1;
		int childIndex = parentIndex * 2;
		while (childIndex <= SIZE) {
			if ((childIndex + 1) <= SIZE && arr[childIndex + 1] > arr[childIndex])
				childIndex = childIndex + 1;
			if (arr[childIndex] < arr[parentIndex])
				break;
			int temp = arr[parentIndex];
			arr[parentIndex] = arr[childIndex];
			arr[childIndex] = temp;
			parentIndex = childIndex;
			childIndex = parentIndex * 2;
		}
		return max;
	}

	public boolean isEmpty() {
		return SIZE == 0;
	}

	public boolean isFull() {
		return SIZE == arr.length - 1;
	}

	public int getMax() {
		return arr[1];
	}
}

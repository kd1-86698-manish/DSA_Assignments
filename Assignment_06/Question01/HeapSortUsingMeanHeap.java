package com.manish;

public class HeapSortUsingMeanHeap {

	private int SIZE;

	public HeapSortUsingMeanHeap() {
		SIZE = 0;
	}

	public void createHeap(int arr[]) {

		for (int i = 1; i < arr.length; i++) {
			SIZE++;
			int childIndex = SIZE;
			int parentIndex = childIndex / 2;

			while (parentIndex >= 1) {

				if (arr[parentIndex] < arr[childIndex])
					break;
				int temp = arr[parentIndex];
				arr[parentIndex] = arr[childIndex];
				arr[childIndex] = temp;

				childIndex = parentIndex;
				parentIndex = childIndex / 2;

			} // while
		}

	}

	public void deleteHeap(int arr[]) {

		for (int i = 1; i < arr.length; i++) {

			int min = arr[1];
			arr[1] = arr[SIZE];
			arr[SIZE] = min;
			SIZE--;

			int parentIndex = 1;
			int childIndex = parentIndex * 2;

			while (childIndex <= SIZE) {

				if ((childIndex + 1) <= SIZE && arr[childIndex + 1] < arr[childIndex])
					childIndex = childIndex + 1;
				if (arr[parentIndex] < arr[childIndex])
					break;
				int temp = arr[parentIndex];
				arr[parentIndex] = arr[childIndex];
				arr[childIndex] = temp;

				parentIndex = childIndex;
				childIndex = parentIndex * 2;
			} // while

		}
	}

	public void minHeap(int arr[]) {
		createHeap(arr);
		deleteHeap(arr);

	}

}

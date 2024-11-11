package com.manish;

import java.util.Arrays;

public class ReverseStack {

	private final int SIZE;
	int arr[];
	int top;

	public ReverseStack(int size) {
		this.SIZE = size;
		arr = new int[SIZE];
		top = -1;
	}

	public void pushRev(int value) {
		top++;
		arr[top] = value;
	}

	public void displayRev() {
		System.out.println("Reverse Array : " + Arrays.toString(arr));

	}
}

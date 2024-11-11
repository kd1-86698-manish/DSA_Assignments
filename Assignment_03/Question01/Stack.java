package com.manish;

import java.util.Arrays;

public class Stack {

	private final int SIZE;
	int top;
	int arr[];

	public Stack(int size) {
		this.SIZE = size;
		arr = new int[SIZE];
		top = -1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == SIZE - 1;
	}

	public void push(int value) {
		arr[++top] = value;
	}

	public int pop() {
		return arr[top--];
	}

	public void display() {
		System.out.println("Array : " + Arrays.toString(arr));
	}

}

package com.manish;

public class LinearQueue {

	int[] arr;
	int front, rear;
	final int SIZE;

	public LinearQueue(int size) {
		this.SIZE = size;
		arr = new int[SIZE];
		front = 0;
		rear = 0;
	}

	public void push(int value) {
		rear++;
		arr[rear] = value;
	}

	public int pop() {
		int temp = arr[front + 1];
		front++;
		return temp;

	}

	public int peek() {
		return arr[front + 1];
	}

	public boolean isEmpty() {
		return front == rear;

	}

	public boolean isFull() {
		return rear == SIZE;
	}
}

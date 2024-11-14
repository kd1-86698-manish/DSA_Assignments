package com.manish;

public class Queue {
	private MaxHeap heap;

	public Queue(int size) {
		heap = new MaxHeap(size);
	}

	public void push(int value) {
		heap.addHeap(value);
	}

	public int pop() {
		return heap.deleteHeap();
	}

	public int peek() {
		return heap.getMax();
	}

	public boolean isEmpty() {
		return heap.isEmpty();
	}

	public boolean isFull() {
		return heap.isFull();
	}

}

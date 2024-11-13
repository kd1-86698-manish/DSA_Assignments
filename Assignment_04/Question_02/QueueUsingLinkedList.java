package com.manish;

public class QueueUsingLinkedList {

	static class Node {

		private int data;
		private Node next;

		public Node(int value) {

			this.data = value;
			next = null;
		}

	}

	private Node front, rear;
	private int size;

	public QueueUsingLinkedList() {
		front = rear = null;
		size = 0;
	}

	public boolean isEmpty() {
		return front == null;

	}

	public void push(int value) {

		Node newnode = new Node(value);
		if (isEmpty()) {
			rear = front = newnode;
		} else {
			rear.next = newnode;
			rear = newnode;

		}
		size++;
	}

	public int pop() {

		int temp = front.data;
		front = front.next;

		if (front == null) {
			rear = null;
		}
		size--;
		return temp;

	}

	public int peek() {
		return front.data;
	}

	public void display() {

		if (isEmpty())
			return;

		Node trav = front;

		System.out.print("Queue : ");
		while (trav != null) {
			System.out.print(" " + trav.data);
			trav = trav.next;
		}
		System.out.println();
		System.out.println("Size : " + size);

	}

	public void deleteAll() {
		front = null;

	}

}

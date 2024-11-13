package com.manish;

public class StackUsingLinkedList {

	static class Node {
		private int data;
		private Node next;

		public Node(int value) {
			this.data = value;
			next = null;
		}
	}

	private Node top;
	private int size;

	public StackUsingLinkedList() {
		top = null;
		size = 0;
	}

	public boolean isEmpty() {
		return top == null;
	}

	public int pop() {
		int temp = top.data;
		top = top.next;
		size--;
		return temp;
	}

	public void push(int value) {
		Node newnode = new Node(value);
		newnode.next = top;
		top = newnode;
		size++;
	}

	public int peek() {
		return top.data;
	}

	public void display() {
		Node trav = top;

		System.out.print("Stack : ");
		while (trav != null) {
			System.out.print(" " + trav.data);
			trav = trav.next;
		}
		System.out.println();
		System.out.println("Size : " + size);
	}

	public void deleteAll() {
		top.next = null;
		size = 0;
	}

}

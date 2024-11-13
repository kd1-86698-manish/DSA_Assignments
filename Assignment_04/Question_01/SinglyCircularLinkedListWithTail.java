package com.manish;

public class SinglyCircularLinkedListWithTail {
	static class Node {
		private int data;
		private Node next;

		public Node(int value) {
			this.data = value;
			next = null;
		}

	}

	private Node tail;
	private int size;

	public SinglyCircularLinkedListWithTail() {
		tail = null;
		size = 0;
	}

	public boolean isEmpty() {
		return tail == null;
	}

	public void addFirst(int value) {

		Node newnode = new Node(value);

		if (size == 0) {
			tail = newnode;
			tail.next = newnode;
		} else {
			newnode.next = tail.next;
			tail.next = newnode;
		}
		size++;
	}

	public void addLast(int value) {

		Node newnode = new Node(value);

		if (size == 0) {
			tail = newnode;
			tail.next = newnode;
		} else {
			newnode.next = tail.next;
			tail.next = newnode;
			tail = newnode;
		}
		size++;
	}

	public void addPosition(int value, int pos) {

		if (pos < 1 || pos > size + 1)
			return;
		Node newnode = new Node(value);
		if (isEmpty()) {
			tail = newnode;
			tail.next = newnode;
		} else if (pos == 1) {
			addFirst(value);
		} else if (pos == size + 1) {
			addLast(value);
		} else {
			Node trav = tail.next;
			for (int i = 1; i < pos - 1; i++) {
				trav = trav.next;
			}
			newnode.next = trav.next;
			trav.next = newnode;
		}
		size++;
	}

	public void deleteFirst() {

		if (size == 0)
			return;
		if (size == 1)
			tail = null;
		else {

			tail.next = tail.next.next;
		}
		size--;
	}

	public void deleteLast() {
		if (size == 0)
			return;
		if (size == 1)
			tail = null;
		else {
			Node trav = tail.next;

			while (trav.next != tail) {
				trav = trav.next;
			}
			trav.next = tail.next;
			tail = trav;
		}
		size--;
	}

	public void deletePosition(int pos) {
		if (pos < 1 || pos > size)
			return;
		if (isEmpty())
			return;
		if (size == 1)
			tail = null;
		else if (pos == 1)
			deleteFirst();
		else if (pos == size)
			deleteLast();
		else {
			Node trav = tail.next;
			for (int i = 1; i < pos - 1; i++) {
				trav = trav.next;
			}
			trav.next = trav.next.next;
		}
		size--;
	}

	public void display() {

		if (isEmpty()) {
			System.out.println("List is Empty");
			return;
		} else {
			Node trav = tail.next;
			System.out.print("List : ");
			do {
				System.out.print(" " + trav.data);
				trav = trav.next;

			} while (trav != tail.next);
		}
		System.out.println();
		System.out.println("Size : " + size);
	}

	public void deleteAll() {
		tail = null;
		size = 0;

	}
}

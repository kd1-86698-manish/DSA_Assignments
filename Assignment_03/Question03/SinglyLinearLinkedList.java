package com.manish;

public class SinglyLinearLinkedList {
	static class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}
	}

	private Node head;

	public SinglyLinearLinkedList() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addBeforeData(int data, int value) {
		Node newNode = new Node(data);
		Node trav = head;
		if (isEmpty()) {
			head = newNode;
		} else if (trav.data == value) {
			newNode.next = head;
			head = newNode;
		} else {
			while (trav.next.data != value) {
				trav = trav.next;

				if (trav.next == null) {
					newNode.next = head;
					head = newNode;
					return;
				}
			}
			newNode.next = trav.next;
			trav.next = newNode;
		}

	}

	public void addAfterData(int data, int value) {

		Node newNode = new Node(data);
		Node trav = head;
		if (isEmpty()) {
			head = newNode;
		} else {
			while (trav.data != value) {
				trav = trav.next;

				if (trav.next == null) {
					trav.next = newNode;
					return;
				}
			}
			newNode.next = trav.next;
			trav.next = newNode;
		}

	}

	public void display() {
		if (isEmpty()) {
			return;
		}
		Node trav = head;
		System.out.print("List = ");
		while (trav != null) {
			System.out.print(" " + trav.data);
			trav = trav.next;
		}
	}
}

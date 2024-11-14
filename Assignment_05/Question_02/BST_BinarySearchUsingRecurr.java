package com.manish;

public class BST_BinarySearchUsingRecurr {

	static class Node {
		private int data;
		private Node left;
		private Node right;

		public Node(int value) {
			this.data = value;
			left = right = null;
		}
	}

	private Node root;

	public BST_BinarySearchUsingRecurr() {
		root = null;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public Node addNodeRecurr(Node trav, int value) {

		if (trav == null) {
			return new Node(value);
		}

		if (value < trav.data) {
			trav.left = addNodeRecurr(trav.left, value); // -> Recursive Call
		} else if (value > trav.data) {
			trav.right = addNodeRecurr(trav.right, value); // -> Recursive Call
		}

		return trav;
	}

	public void addNodeRecurr(int data) {
		root = addNodeRecurr(root, data);
	}

	private Node searchNode(Node trav, int key) {
		if (trav == null) {
			return null;

		}

		if (trav.data == key) {
			return trav;
		}

		if (key < trav.data) {
			return searchNode(trav.left, key);
		} else {
			return searchNode(trav.right, key);
		}
	}

	public Node searchNode(int key) {
		return searchNode(root, key);
	}

	private void inOrder(Node trav) {
		if (trav == null)
			return;
		inOrder(trav.left);
		System.out.print(" " + trav.data);
		inOrder(trav.right);
	}

	public void inOrder() {
		System.out.print("Inorder = ");
		inOrder(root);
	}

}

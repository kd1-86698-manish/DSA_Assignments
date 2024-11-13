package com.shreyash;

public class BST_BinarySearchUsingRecursion {

	static class Node {
		private int data;
		private Node left;
		private Node right;

		public Node(int data) {
			this.data = data;
			left = null;
			right = null;
		}
	}

	private Node root;

	public BST_BinarySearchUsingRecursion() {
		root = null;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public void addNode1(Node trav, int value) {

		Node newNode = new Node(value);

		if (trav == null) {
			trav = newNode;
		}

		if (value < trav.data) {
			if (trav.left == null) {
				trav.left = newNode;
				return;
			} else {
				addNode1(trav.left, value);
			}
		} else if (value > trav.data) {

			if (trav.right == null) {
				trav.right = newNode;
				return;
			} else {
				addNode1(trav.right, value);
			}
		}

	}

	public Node addNode(Node trav, int value) {

		if (trav == null) {
			return new Node(value);
		}

		if (value < trav.data) {
			trav.left = addNode(trav.left, value); // -> Recursive Call
		} else if (value > trav.data) {
			trav.right = addNode(trav.right, value); // -> Recursive Call
		}

		return trav;
	}

	public void addNode(int data) {
		root = addNode(root, data);
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

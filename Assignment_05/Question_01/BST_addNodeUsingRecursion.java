package com.manish;

public class BST_addNodeUsingRecursion {

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

	public BST_addNodeUsingRecursion() {
		root = null;
	}

	public boolean isEmpty() {
		return root == null;
	}

	private Node addNodeRecurr(Node trav, int value) {

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

	public void addNode(int data) {
		root = addNodeRecurr(root, data);
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

package com.shreyash;

public class Main {

	public static void main(String[] args) {
		BST_BinarySearchUsingRecursion tree = new BST_BinarySearchUsingRecursion();

		tree.addNode(8);
		tree.addNode(14);
		tree.addNode(6);
		tree.addNode(3);
		tree.addNode(28);
		tree.addNode(2);
		tree.addNode(77);
		tree.addNode(15);
		tree.addNode(5);

		tree.inOrder();

		BST_BinarySearchUsingRecursion.Node key = tree.searchNode(77);

		if (key != null) {
			System.out.println("\nKey Found");
		} else {

			System.out.println("\nKey Not Found");
		}
	}
}

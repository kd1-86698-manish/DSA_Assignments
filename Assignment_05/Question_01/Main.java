package com.manish;

public class Main {

	public static void main(String[] args) {
		BST_addNodeUsingRecursion tree = new BST_addNodeUsingRecursion();

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

	}
}

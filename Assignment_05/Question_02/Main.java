package com.manish;

public class Main {

	public static void main(String[] args) {
		BST_BinarySearchUsingRecurr bst = new BST_BinarySearchUsingRecurr();

		bst.addNodeRecurr(8);
		bst.addNodeRecurr(14);
		bst.addNodeRecurr(6);
		bst.addNodeRecurr(3);
		bst.addNodeRecurr(28);
		bst.addNodeRecurr(2);
		bst.addNodeRecurr(77);
		bst.addNodeRecurr(15);
		bst.addNodeRecurr(5);

		bst.inOrder();

		BST_BinarySearchUsingRecurr.Node key = bst.searchNode(77);

		if (key != null) {
			System.out.println("\nKey Found");
		} else {

			System.out.println("\nKey Not Found");
		}
	}
}

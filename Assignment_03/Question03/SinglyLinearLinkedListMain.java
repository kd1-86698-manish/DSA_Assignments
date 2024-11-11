package com.manish;

public class SinglyLinearLinkedListMain {

	public static void main(String[] args) {
		SinglyLinearLinkedList list = new SinglyLinearLinkedList();

		list.addBeforeData(11, 22);
		list.addBeforeData(22, 11);
		list.addBeforeData(33, 77);
		list.addAfterData(44, 33);
		list.addAfterData(55, 22);

		list.display();

	}

}

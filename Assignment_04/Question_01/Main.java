package com.manish;

public class Main {

	public static void main(String[] args) {

		SinglyCircularLinkedListWithTail l1 = new SinglyCircularLinkedListWithTail();

		l1.addFirst(30);
		l1.addFirst(20);
		l1.addFirst(10);

		l1.addLast(40);

		l1.addPosition(100, 3);
		l1.display();
		l1.deletePosition(3);
//		l1.deleteFirst();
//		l1.deleteLast();
		l1.display();

	}

}

package com.manish;

public class QueueMain {

	public static void main(String[] args) {

		QueueUsingLinkedList q = new QueueUsingLinkedList();

		q.push(10);
		q.push(20);
		q.push(30);
		q.push(40);
		q.push(50);
		q.display();

		System.out.println("Peek Element : " + q.peek());

		System.out.println("Popped Element : " + q.pop());
		q.display();
	}

}

package com.manish;

public class StackMain {

	public static void main(String[] args) {

		StackUsingLinkedList st = new StackUsingLinkedList();

		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);

		System.out.println("Peek Element : " + st.peek());
		System.out.println("Pop Element : " + st.pop());
		st.display();

	}

}

package com.manish;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Queue q1 = new Queue(6);

		q1.push(50);
		q1.push(20);
		q1.push(30);
		q1.push(15);
		q1.push(10);
		q1.push(8);

		System.out.println("Max Element : " + q1.peek());

		System.out.println("Popped element " + q1.pop());
	}

}

package com.manish;

import java.util.Scanner;

public class LinearQueueMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		LinearQueue q = new LinearQueue(5);
		int choice;
		do {
			System.out.println("----------");
			System.out.println("0.Exit\n1.Push\n2.Pop\n3.Peek");
			System.out.println("----------");

			System.out.print("Enter Your choice : ");
			choice = sc.nextInt();

			switch (choice) {
			case 0: {
				System.out.println("Thank You...");
			}
				break;
			case 1: {

				if (q.isFull())
					System.out.println("Queue is Full");
				else {
					System.out.print("Enter value : ");
					int value = sc.nextInt();
					q.push(value);
				}
			}
				break;
			case 2: {

				if (q.isEmpty())
					System.out.println("Queue is Empty");
				else {
					System.out.println("Popped Element is " + q.pop());
				}
			}
				break;
			case 3: {

				if (q.isEmpty())
					System.out.println("Queue is Empty");
				else {
					System.out.println("Peek Element is " + q.peek());
				}
			}
				break;

			default:
				System.out.println("Invalid Choice...");
				break;
			}
		} while (choice != 0);
		sc.close();
	}

}

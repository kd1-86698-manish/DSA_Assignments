package com.manish;

import java.util.Scanner;

public class StackMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Size Of Array : ");
		int size = sc.nextInt();

		Stack st = new Stack(size);
		ReverseStack rvst = new ReverseStack(size);

		int choice;
		do {
			System.out.println("---------");
			System.out.println("0.Exit\n1.Push\n2.Pop");
			System.out.println("---------");
			System.out.print("Enter Your Choice : ");
			choice = sc.nextInt();

			switch (choice) {
			case 0:
				System.out.println("Thank You..");
				break;
			case 1: {
				if (st.isFull())
					System.out.println("Array is Full.");
				else {
					System.out.print("Enter Element :");
					int value = sc.nextInt();

					st.push(value);
				}
			}
				break;
			case 2: {
				if (st.isEmpty())
					System.out.println("Array is Empty...");
				else {

					int ele = st.pop();
					System.out.println("Popped Element : " + ele);
					rvst.pushRev(ele);
				}
			}
				break;

			default:
				System.out.println("Invalid Choice...");
				break;
			}
		} while (choice != 0);
		st.display();
		rvst.displayRev();
		sc.close();
	}
}
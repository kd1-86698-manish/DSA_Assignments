import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;

		System.out.print("\nEnter Size of the Queue - ");
		int size = sc.nextInt();

		CircularQueueUsingCount q = new CircularQueueUsingCount(size);
		do {

			System.out.println("------------");
			System.out.println("\n0.Exit");
			System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Peek");
			System.out.println("4.Display");
			System.out.println("------------");

			System.out.print("Enter Your Choice - ");
			choice = sc.nextInt();

			switch (choice) {
			case 0: {
				System.out.println("Thank You");
			}
				break;

			case 1: {
				if (q.isFull()) {
					System.out.println("Queue is Full !");
				} else {
					System.out.print("\nEnter Element : ");
					int ele = sc.nextInt();
					q.push(ele);
				}
			}
				break;

			case 2: {

				if (q.isEmpty()) {
					System.out.println("Queue is Empty !");
				} else {
					int ele = q.pop();
					System.out.println("Popped Element : " + ele);
				}
			}
				break;
			case 3: {
				if (q.isEmpty()) {
					System.out.println("Queue is Empty !");
				} else {
					int ele = q.peek();
					System.out.println("Peek Element = " + ele);
				}

			}
				break;

			case 4: {
				q.display();

			}
				break;

			default:
				break;
			}
		} while (choice != 0);

		sc.close();
	}
}

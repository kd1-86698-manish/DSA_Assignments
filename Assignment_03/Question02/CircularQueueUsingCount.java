import java.util.Arrays;

public class CircularQueueUsingCount {

	int arr[];
	int front, rear;
	final int SIZE;
	int count;

	public CircularQueueUsingCount(int size) {
		this.SIZE = size;
		arr = new int[SIZE];
		front = rear = -1;
		count = 0;
	}

	public boolean isEmpty() {
		return count == 0;
	}

	public boolean isFull() {
		return count == SIZE;

	}

	public void push(int ele) {
		rear++;
		arr[rear % SIZE] = ele;
		count++;
	}

	public int pop() {
		front++;
		int temp = arr[front % SIZE];
		if (front == rear) {
			front = rear = -1;
		}
		count--;
		return temp;
	}

	public int peek() {
		return arr[(front + 1) % SIZE];

	}

	public void display() {
		System.out.println("Queue : " + Arrays.toString(arr));
	}
}

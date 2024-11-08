import java.util.Scanner;

public class Question1 {

	public static int searchLastOccurance(int[] arr, int ele) {

		for (int i = arr.length - 1; i >= 0; i--) {
			if (ele == arr[i])
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 5, 6, 9, 8, 7, 5, 2, 3, 4, 5, 7 };
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Element to search :");
		int ele = sc.nextInt();

		int index = searchLastOccurance(arr, ele);

		if (index == -1)
			System.out.println("Element Not Found...");
		else
			System.out.println("Last occurance of element " + index);

	}

}

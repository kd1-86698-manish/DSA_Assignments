import java.util.Arrays;

public class InsertionSortDesc {

	public static void main(String[] args) {

		int[] arr = { 55, 44, 66, 11, 33 };

		System.out.println(Arrays.toString(arr));
		insertionSortDescendingOrder(arr);
		System.out.println("After Sorting : " + Arrays.toString(arr));

	}

	public static void insertionSortDescendingOrder(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j;
			for (j = i - 1; j >= 0 && arr[j] < temp; j--) {

				arr[j + 1] = arr[j];
			}
			arr[j + 1] = temp;
		}

	}
}

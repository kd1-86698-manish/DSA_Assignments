package com.manish;

import com.manish.Employee;
import java.util.Scanner;

public class EmployeeMain {

	public static int linearSearch(Employee[] arr, int id) {

		for (int i = 0; i < arr.length; i++) {

			if (id == arr[i].getId())
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Employee[] arr = new Employee[3];

		arr[0] = new Employee(2, "Manish");
		arr[1] = new Employee(3, "Shreyash");
		arr[2] = new Employee(1, "Aditya");

		System.out.print("Enter Empid to search : ");
		int id = sc.nextInt();

		int index = linearSearch(arr, id);

		if (index == -1)
			System.out.println("Employee Not Found");
		else
			System.out.println("Employee Found at index " + index);
		sc.close();
	}
}

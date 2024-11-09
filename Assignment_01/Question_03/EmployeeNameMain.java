package com.manish;

import com.manish.Employee;
import java.util.Scanner;

public class EmployeeNameMain {

	public static int linearSearch(Employee[] arr, String name) {

		for (int i = 0; i < arr.length; i++) {

			if (arr[i].getName().equals(name))
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

		System.out.print("Enter Name to search : ");
		String name = sc.next();

		int index = linearSearch(arr, name);

		if (index == -1)
			System.out.println("Employee Not Found");
		else
			System.out.println("Employee Found at index " + index);
		sc.close();
	}
}

package com.manish;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee[] arr = new Employee[4];

		arr[0] = new Employee(3, "Manish", 10000);
		arr[1] = new Employee(4, "Aditya", 30000);
		arr[2] = new Employee(2, "Shreyash", 40000);
		arr[3] = new Employee(1, "Ketan", 20000);

		selectionSortSalary(arr);

		for (Employee emp : arr) {
			System.out.println(emp);
		}
	}

	public static void selectionSortSalary(Employee[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].getSalary() > arr[j].getSalary()) {

					Employee temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

		}
	}
}

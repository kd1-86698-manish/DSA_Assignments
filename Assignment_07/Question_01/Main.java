package com.manish;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str;

		System.out.println("Enter Any line :  ");
		str = sc.nextLine();

		String lowwercase = str.toLowerCase();

		String[] words = lowwercase.split(" ");

		countWords(words);

		sc.close();
	}

	private static void countWords(String arr[]) {

		boolean[] visit = new boolean[arr.length];

		for (int i = 0; i < arr.length; i++) {
			if (visit[i])
				continue;
			int count = 0;

			for (int j = 0; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) {
					count++;
					visit[j] = true;
				}

			}
			System.out.println("Count of " + arr[i] + " : " + count);
		}
	}

}

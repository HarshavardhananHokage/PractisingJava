package com.harsh.chapter3.selections;

import java.time.Month;
import java.util.Scanner;

public class Program311 {

	public static void main(String[] args) {
		getMonthDays();
	}

	private static void getMonthDays() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter month:");
		int month = scanner.nextInt();
		
		System.out.println("Enter year:");
		int year = scanner.nextInt();
		
		System.out.println("Total days in month: " +Month.of(month).length(year % 4 == 0));
		
		scanner.close();

	}

}

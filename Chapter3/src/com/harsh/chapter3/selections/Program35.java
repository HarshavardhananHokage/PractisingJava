package com.harsh.chapter3.selections;

import java.time.DayOfWeek;
import java.util.Scanner;

public class Program35 {

	public static void main(String[] args) {
		getFutureDay();
	}

	public static void getFutureDay() {
		try (Scanner scanner = new Scanner(System.in)) {

			System.out.println("Enter today’s day:");
			int today = scanner.nextInt();
			System.out.println("Enter the number of days elapsed since today:");
			int future = scanner.nextInt();

			int futureDay = (today + future) % 7;

			System.out.printf("Today is %s and the future day is %s", DayOfWeek.of(today).name(),
					DayOfWeek.of(futureDay).name());
		}
	}
}

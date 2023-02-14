package com.harsh.chapter3.selections;

import java.time.DayOfWeek;
import java.util.Scanner;

public class Program321 {

	public static void main(String[] args) {
		
		int dayOfMonth = 0;
		int month = 0;
		int year = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Year: ");
		year = scanner.nextInt();
		
		System.out.println("Enter month: ");
		month = scanner.nextInt();
		
		System.out.println("Enter dayOfMonth: ");
		dayOfMonth = scanner.nextInt();
		
		calculateZellerCongruence(dayOfMonth, month, year);
		
		scanner.close();
		
	}

	private static void calculateZellerCongruence(int dayOfMonth, int month, int year) {
		
		if(month == 1 || month == 2) {
			month += 12;
			year -= 1;
		}

		int yearOfCentury = year % 100;
		
		int j = year / 100;
		
		int h = (dayOfMonth + ((26 * (month + 1)) / 10) + yearOfCentury + (yearOfCentury / 4) + (j / 4) + (5 * j)) % 7;
		
		
		if(h < 2)
			System.out.println(DayOfWeek.of(h + 6));
		else
			System.out.println(DayOfWeek.of(h - 1));
	}
}

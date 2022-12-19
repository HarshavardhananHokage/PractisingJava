package com.harsh.chapter3.selections;

import java.util.Scanner;

public class Program39 {
	
	public static void main(String[] args) {
		isbnCalculator();
	}
	
	private static void isbnCalculator() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter 9 digit ISBN code as integer:");
		int isbn9 = scanner.nextInt();
		int temp = isbn9;
		int isbn10 = 0;
		for(int i = 0; i < 9; i++) {
			int currVal = temp % 10;
			temp = temp / 10;
			isbn10 += currVal * (9 - i);
		}
		
		isbn10 = isbn10 % 11;
		if(isbn10 == 10) {
			System.out.println("ISBN-10 is: " +isbn9 + "X");
		} else {
			System.out.println("ISBN-10 is: " +isbn9 + isbn10);
		}
		
		scanner.close();
	}
}

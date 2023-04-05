package com.harsh.chapter04;

import java.util.Scanner;

public class Program_04_11 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int value = scanner.nextInt();

		if (value < 10) {
			System.out.printf("Hex value of %d is %d", value, value);
		} else if (value > 10 && value < 16) {
			System.out.printf("Hex value of %d is %s", value, (char)(55 + value));
		} else {
			System.out.println("Invalid entry");
		}
		
		scanner.close();
	}
}

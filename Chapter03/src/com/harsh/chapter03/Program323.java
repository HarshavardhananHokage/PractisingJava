package com.harsh.chapter03;

import java.util.Scanner;

public class Program323 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter point x: ");
		double x = scanner.nextDouble();

		System.out.println("Enter point y: ");
		double y = scanner.nextDouble();

		isPointInsideRectangle(x, y);
		
		scanner.close();
	}

	private static void isPointInsideRectangle(double x, double y) {

		double horizontalDistance = Math.sqrt(Math.pow(x, 2));
		double verticalDistance = Math.sqrt(Math.pow(y, 2));

		if ((horizontalDistance <= (10 / 2)) && (verticalDistance <= (5 / 2))) {
			System.out.println("Within rectangle");
		} else {
			System.out.println("Outside rectangle");
		}

	}
}
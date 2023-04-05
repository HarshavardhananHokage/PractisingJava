package com.harsh.chapter03;

import java.util.Scanner;

public class Program322 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter point x: ");
		int x = scanner.nextInt();
		
		System.out.println("Enter point y: ");
		int y = scanner.nextInt();
		
		isPointInsideCircle(x, y);
		
		scanner.close();
	}

	private static void isPointInsideCircle(int x, int y) {
		
		double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		
		if(distance <= 10) {
			System.out.println("Within circle");
		} else {
			System.out.println("Outside circle");
		}
	}

}

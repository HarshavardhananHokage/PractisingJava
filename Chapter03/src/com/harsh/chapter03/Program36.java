package com.harsh.chapter03;

import java.util.Scanner;

public class Program36 {

	public static void main(String[] args) {

		calculateBMI();
	}
	
	public static void calculateBMI() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter weight in kilograms: ");
		double weight = scanner.nextDouble();
		System.out.print("Enter height in meters: ");
		double height = scanner.nextDouble();
		
		double bmi = weight / Math.pow(height, 2);
		
		System.out.println("Your BMI is: " +bmi);
		
		scanner.close();
	}

}

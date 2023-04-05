package com.harsh.chapter03;

import java.util.Scanner;

public class Program33 {

	public static void main(String[] args) {
		solveLinearEquations();
	}
	
	public static void solveLinearEquations() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a, b, c, d, e, f: ");
		String input = scanner.nextLine();
		System.out.println(input);
		scanner.close();
		
		double a = Double.parseDouble(input.split(" ")[0]);
		double b = Double.parseDouble(input.split(" ")[1]);
		double c = Double.parseDouble(input.split(" ")[2]);
		double d = Double.parseDouble(input.split(" ")[3]);
		double e = Double.parseDouble(input.split(" ")[4]);
		double f = Double.parseDouble(input.split(" ")[5]);
		
		double denominator = (a * d) - (b * c);
		
		if(denominator == 0) {
			System.out.println("Equation has no solution");
		} else {
			double x = ((e * d) - (b * f)) / denominator;
			double y = ((a * f) - (e * c)) / denominator;
			
			System.out.printf("x is %f and y is %f", x, y);
		}
		
	}
}

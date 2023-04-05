package com.harsh.chapter03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Program31 {
	
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a, b, c");
		String input = scanner.nextLine();
		System.out.println(input);
		scanner.close();
		
		double a = Double.parseDouble(input.split(" ")[0]);
		double b = Double.parseDouble(input.split(" ")[1]);
		double c = Double.parseDouble(input.split(" ")[2]);
		
		quadraticEquation(a, b, c);
		
	}
	
	public static void quadraticEquation(double a, double b, double c) {
		
		double discriminant = Math.pow(b, 2) - 4 * a * c;
		
		DecimalFormat df = new DecimalFormat("#.######");
		
		if(discriminant < 0) {
			System.out.println("The equation has no real roots");
		} else if (discriminant == 0) {
			double root1 = (-b + Math.pow(discriminant, 0.5)) / 2 * a;
			System.out.println("The equation has one root: " +df.format(root1));
		} else {
			double root1 = (-b + Math.pow(discriminant, 0.5)) / 2 * a;
			double root2 = (-b - Math.pow(discriminant, 0.5)) / 2 * a;
			System.out.println("The equation has two roots " +df.format(root1) + " and " +df.format(root2));
		}
	}

}

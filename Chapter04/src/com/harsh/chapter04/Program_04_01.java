package com.harsh.chapter04;

public class Program_04_01 {
	private static double R = 5.5;
	
	public static void main(String[] args) {
		double s = (2 * R) * Math.sin(Math.PI / 5);
		
		double areaOfPentagon = (5 * s * s) / (4 * Math.tan(Math.PI / 5));
		
		System.out.printf("Area of pentagon: %.2f", areaOfPentagon);
	}

}

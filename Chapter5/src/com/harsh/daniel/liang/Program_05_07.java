package com.harsh.daniel.liang;

public class Program_05_07 {
	private static double INITIAL_TUITION = 10000d;
	
	public static void main(String[] args) {
		
		double finalTuitionlAfter10Years = INITIAL_TUITION;
		
		for(int  i = 0; i < 10; i++) {
			finalTuitionlAfter10Years += (finalTuitionlAfter10Years * 0.05);
			System.out.printf("Tution at year %d is %.2f\n", i + 1, finalTuitionlAfter10Years);
		}
		
		for(int  i = 0; i < 4; i++) {
			finalTuitionlAfter10Years += (finalTuitionlAfter10Years * 0.05);
		}
		System.out.printf("Tution at year 14 years is %.2f\n", finalTuitionlAfter10Years);		
	}
	
	
}

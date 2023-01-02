package com.harsh.chapter3.selections;

import java.util.Scanner;

public class Program312 {

	public static void main(String[] args) {
		numberPalindrome();
	}
	
	private static void numberPalindrome() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter number:");
		int num = scanner.nextInt();
		
		String numString = String.valueOf(num);
		String revNum = new StringBuilder(String.valueOf(num)).reverse().toString();
		
		
		String msg = numString.equals(revNum) ? "Palindrome" : "Not a Palindrome";
		
		System.out.println(msg);
		scanner.close();
	}

}

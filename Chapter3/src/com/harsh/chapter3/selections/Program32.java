package com.harsh.chapter3.selections;

import java.util.Random;
import java.util.Scanner;

public class Program32 {

	public static void main(String[] args) {
		additionQuiz();
	}
	
	public static void additionQuiz() {
		Scanner scanner = new Scanner(System.in);
		
		Random random = new Random();
		int a = random.nextInt(1, 11);
		int b = random.nextInt(1, 11);
		int c = random.nextInt(1, 11);
		System.out.printf("Addition of the following three numbers %d, %d, %d is: ", a, b, c);
		int answer = scanner.nextInt();
		
		if (answer == a + b + c) {
			System.out.println("Right");
		} else {
			System.out.println("Wrong");
		}
		scanner.close();
	}

}

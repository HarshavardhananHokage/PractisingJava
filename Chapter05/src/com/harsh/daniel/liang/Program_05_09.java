package com.harsh.daniel.liang;

import java.util.Scanner;

public class Program_05_09 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int highestScore = 0;
		int secondHighestScore = 0;
		
		String highestScoreStudentsName = "";
		String secondHighestScoreStudentsName = "";
		
		System.out.println("Enter total students");
		int noOfStudents = scanner.nextInt();
		
		for(int i = 0; i < noOfStudents; i++) {
			System.out.println("Enter student name: ");
			String name = scanner.next();
			
			System.out.println("Enter student's score");
			int score = scanner.nextInt();
			
			if(highestScore < score) {
				secondHighestScore = highestScore;
				secondHighestScoreStudentsName = highestScoreStudentsName;
				
				highestScore = score;
				highestScoreStudentsName = name;
			}
		}
		
		System.out.printf("Highest score student is %s and they scored %d\n", highestScoreStudentsName, highestScore);
		System.out.printf("Second highest score student is %s and they scored %d\n", secondHighestScoreStudentsName, secondHighestScore);
		scanner.close();
	}

}

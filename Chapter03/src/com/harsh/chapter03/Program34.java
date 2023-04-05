package com.harsh.chapter03;

import java.time.Month;
import java.util.Random;
import java.util.Scanner;

public class Program34 {

	public static void main(String[] args) {
		generateMonth();
	}
	
	public static void generateMonth() {
		Scanner scanner = new Scanner(System.in);
		
		String input = "";
		System.out.println("Type exit to stop generating random month");
		
		Random random = new Random();
		
		do {
			
			int i = random.nextInt(1, 13);
			System.out.println(Month.of(i).name());
			input = scanner.nextLine();
			
		}while(!input.equals("exit"));
		
		scanner.close();
	}

}

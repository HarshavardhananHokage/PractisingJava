package com.harsh.chapter3.selections;

import java.util.Scanner;

public class Program38 {

	public static void main(String[] args) {
		sortIntegers();
	}

	public static void sortIntegers() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter three comma separated integers:");
		String integers = scanner.nextLine();
		
		String[] integerArray = integers.split(",");
		
		int[] intArray = new int[integerArray.length];
		int count = 0;
		for(String number: integerArray) {
			intArray[count] = Integer.parseInt(number.trim());
			count++;
		}
		
		for(int i = 0; i < intArray.length; i++) {
			for(int j = i + 1; j < intArray.length; j++) {
				if(intArray[i] > intArray[j]) {
					int temp = intArray[i];
					intArray[i] = intArray[j];
					intArray[j] = temp;
				}
			}
		}
		
		for(int num: intArray) {
			System.out.println(num);
		}
		
		scanner.close();
	}

}

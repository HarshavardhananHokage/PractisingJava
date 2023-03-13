package com.harsh.chapter04;

import java.util.Random;

public class Program_04_25 {
	
	public static void main(String[] args) {
		Random random = new Random();
		
		char one = (char) random.nextInt(65, 91);
		char two = (char) random.nextInt(65, 91);
		char three = (char) random.nextInt(65, 91);
		
		int number = random.nextInt(1, 10000);
		
		String numberInString = "" + number;
		
		if(number < 10) {
			numberInString += "000";
		} else if(number > 9 && number < 100) {
			numberInString += "00";
		} else if(number > 99 && number < 1000) {
			numberInString += "0";
		}
		
		System.out.println("Plate Number: " +one + two + three + numberInString);
	}

}

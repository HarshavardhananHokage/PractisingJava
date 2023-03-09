package com.harsh.chapter03;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Program315 {

	public static void main(String[] args) {
		lottery();
	}

	private static void lottery() {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a 3-digit integer");
		int userInput = scanner.nextInt();
		
		int winningLottery = 123; //random.nextInt(100, 1000);
		
		System.out.println("Winning Lottery: " +winningLottery);
		
		int reward = pickWinningLottery(userInput, winningLottery);
		if(reward == 4)
			System.out.println("You won the lottery. Reward: $10000");
		else if(reward == 1) {
			System.out.println("One digit match. Reward: $1000");
		} else if(reward == 2) {
			System.out.println("Two digits match. Reward: $2000");
		} else if(reward == 3) {
			System.out.println("All digits match though in different order. Reward: $3000");
		} else {
			System.out.println("You lost the lottery jackass!!!");
		}
		
		scanner.close();
	}

	private static int pickWinningLottery(int userInput, int winningLottery) {
		int reward = 0;
		
		if(userInput == winningLottery)
			reward = 4;
		else {
			int count = 0;
			String userInputString = String.valueOf(userInput);
			String winningLotteryString = String.valueOf(winningLottery);
			
			if(winningLotteryString.contains(userInputString.subSequence(0, 1))) {
				count++;
			}
			
			if(winningLotteryString.contains(userInputString.subSequence(1, 2))) {
				count++;
			}
			
			if(winningLotteryString.contains(userInputString.subSequence(2, 3))) {
				count++;
			}
			
			System.out.println(userInputString.subSequence(0, 1));
			System.out.println(userInputString.subSequence(1, 2));
			System.out.println(userInputString.subSequence(2, 3));
			reward = count;
		}
		
		System.out.println("Reward: "+reward);
		
		return reward;
	}

}

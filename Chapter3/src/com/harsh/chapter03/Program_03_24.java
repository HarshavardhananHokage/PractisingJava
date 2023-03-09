package com.harsh.chapter03;

import java.util.Random;

public class Program_03_24 {

	public enum Cards {
		ACE, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;
	}
	
	public enum Suit {
		CLUBS, DIAMONDS, HEARTS, SPADES;
	}
	
	public static void main(String[] args) {
		Random random = new Random();
		
		int cardRandom = random.nextInt(13);
		int suitRandom = random.nextInt(4);
		
		System.out.println("cardRandom: " + cardRandom + " Suit Random: " +suitRandom);
		
		System.out.printf("You have picked the " +Cards.values()[cardRandom] + " of " +Suit.values()[suitRandom]);
		
	}
}

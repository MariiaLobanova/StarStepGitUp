package scr.MorningSession.Class211.Enums;

import java.util.Random;

// Create an enum named CardSuit to represent the four suits in a standard deck of cards (Hearts, Diamonds, Clubs, Spades).
//Define constants for each suit within the enum.
//Implement a method called getRandomSuit in the enum that selects and returns a random card suit.
//Demonstrate the usage of the CardSuit enum by generating and printing a random card suit.
public enum CardSuit {
    HEARTS, DIAMONDS, CLUBS, SPADES;

    public static CardSuit randomSuit(){
        Random random = new Random();
        int randomCards= random.nextInt(CardSuit.values().length);
        return CardSuit.values()[randomCards];
    }

    public static void main(String[] args) {
        CardSuit randomCards = CardSuit.randomSuit();
        System.out.println("Random card is : " + randomCards);
    }
}

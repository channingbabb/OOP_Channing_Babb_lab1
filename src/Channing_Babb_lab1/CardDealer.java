package Channing_Babb_lab1;

import java.util.Random;

public class CardDealer {

    /**
     * CardDealer function
     */
    public static void cardDealer() {

        // constant for HAND_SIZE
        final int HAND_SIZE = 5;

        String[] deck = new String[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        int[] ranks = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 12, 13};

        // initialize the deck array
        for (int i = 0; i < suits.length; i++) {
            for (int j=0; j<ranks.length; j++) {
                String actualRank;
                switch (ranks[j]){
                    case 1:
                        actualRank = "The Ace";
                        break;
                    case 11:
                        actualRank = "The Jack";
                        break;
                    case 12:
                        actualRank = "The Queen";
                        break;
                    case 13:
                        actualRank = "The King";
                        break;
                    default:
                        actualRank = String.valueOf(ranks[j]);
                        break;
                }
                deck[ranks.length*i + j] = actualRank + " of " + suits[i];
            }
        }

        // create new instance of random
        Random rand = new Random();

        // loop through the array
        for (int i = 0; i < HAND_SIZE; i++) {
            // generate random number between 1 and 52 (there are 52 cards in a deck)
            int card = rand.nextInt(52);
            // output
            System.out.print(deck[card] + "\n");
        }

    }
}


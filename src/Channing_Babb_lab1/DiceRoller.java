package Channing_Babb_lab1;

import java.util.Random;
import java.util.Scanner;

/**
 * DiceRoller Class
 * This class holds the function for the diceroller function
 */
public class DiceRoller {

    /**
     * DiceRoller function
     */
    public static void diceRoller() {
        // create new instance of Scanner
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int[] rolls;
        int sides;
        int dice;

        int total = 0;

        System.out.print("Enter number of dice to roll: ");
        dice = sc.nextInt();

        do {
            // prompt user for number of rolls
            System.out.print("Enter number of sides on each die (platonic solid): ");
            sides = sc.nextInt();
            if (sides != 4 && sides != 6 && sides != 8 && sides != 10 && sides != 12 && sides != 20) {
                System.out.print("Invalid number of sides. Please enter a platonic solid (4, 6, 8, 10, 12, 20). \n");
            }
        } while (sides != 4 && sides != 6 && sides != 8 && sides != 10 && sides != 12 && sides != 20);

        // create new array of size dice
        rolls = new int[dice];

        // loop through the array
        for (int i = 0; i < dice; i++) {
            // generate random number between 1 and sides
            int roll = rand.nextInt(sides) + 1;
            rolls[i] = roll;
        }

        // loop through the array to print the rolls
        for (int i = 0; i < rolls.length; i++) {
            System.out.print("You rolled a: " + rolls[i] + " on die " + (i + 1) + "\n");
            total += rolls[i];
        }

        System.out.print("Total: " + total);

    }

}

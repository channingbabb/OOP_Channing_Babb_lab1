package Channing_Babb_lab1;

import java.util.Scanner;

/**
 * ChangeMaker Class
 * This class holds the function for the classmaker function
 */
public class ChangeMaker {

    /**
     * Get the amount needed by dividing the monetary value by the amount, casting (int)
     * @param monetaryValue The amount of money remaining
     * @param amount The quantity of the money type
     * @return int
     */
    public static int getAmountNeeded(double monetaryValue, double amount) {
        return (int) (monetaryValue / amount);
    }

    /**
     * Get the remainder of the monetary value by using the modulus divisor
     * @param monetaryValue The amount of money remaining
     * @param amount The quantity of the money type
     * @return double
     */
    public static double getRemainder(double monetaryValue, double amount) {
        return monetaryValue % amount;
    }

    /**
     * Returns monetary value of double inputted by user
     */
    public static void changeMaker() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter $ amount: ");
        double monetaryValue = sc.nextDouble();

        // new array with 20, 10, 5, 1, 0.50, 0.10, 0.05, 0.01
        double[] monetaryValues = {20, 10, 5, 1, 0.50, 0.10, 0.05, 0.01};
        String[] singularNames = {"twenty dollar note", "ten dollar note", "five dollar note", "one dollar note", "fifty cent piece", "dime", "nickel", "penny"};
        String[] pluralNames = {"twenty dollar notes", "ten dollar notes", "five dollar notes", "one dollar notes", "fifty cent pieces", "dimes", "nickels", "pennies"};

        // loop through the array
        for (int i = 0; i < monetaryValues.length; i++) {
            // get the amount needed
            int amountNeeded = getAmountNeeded(monetaryValue, monetaryValues[i]);
            // get the remainder
            double remainder = getRemainder(monetaryValue, monetaryValues[i]);
            // print the amount needed
            if (amountNeeded == 1) // if one, print the singular name of the note/coin
                System.out.println(amountNeeded + " " + singularNames[i]);
            else if (amountNeeded > 1) // if plural, print the plural name of the note/coin
                System.out.println(amountNeeded + " " + pluralNames[i]);
            // set the monetary value to the remainder
            monetaryValue = remainder;
        }
    }

}

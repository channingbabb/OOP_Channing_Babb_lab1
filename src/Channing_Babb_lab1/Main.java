package Channing_Babb_lab1;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // write your code here
        System.out.println("Which application would you like to use? ");
        System.out.println("1. Change Maker");
        System.out.println("2. Dice Roller");
        System.out.println("3. Card Dealer");
        int chosenInt = in.nextInt();

        switch (chosenInt) {
            case 1:
                ChangeMaker.changeMaker();
                break;
            case 2:
                DiceRoller.diceRoller();
                break;
            case 3:
                CardDealer.cardDealer();
                break;
        }
    }

}

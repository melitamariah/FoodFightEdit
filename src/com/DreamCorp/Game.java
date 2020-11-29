package com.DreamCorp;

import java.util.Scanner;

public class Game extends CheckHealth {

    public static boolean isPlaying = true;
    public static int computerHealth = 25;
    public static int playerHealth = 25;
    int gameRounds = 0;
    public static String playerName = "";
    public static String userChoice = "";

    public void startGame() {

        String playerOne;
        Scanner scanner = new Scanner(System.in);


        while (true) {

            System.out.println("------------------------------");
            System.out.print("Ready for a FooD FigHt!? Y/N? ");

            playerOne = scanner.nextLine().toUpperCase();

            if (playerOne.equals("N") || playerOne.equals("NO")) {
                System.out.println("Alright, next time.");
                break;
            } else if (!playerOne.equals("YES") && !playerOne.equals("Y")) {
                System.out.println("Lets run that back.. I said choose yes or no.");
                continue;
            } else if(gameRounds < 1) {
                System.out.print("Enter your name: ");
                playerName = scanner.nextLine();
                System.out.println("------------------------------\n");

                System.out.println("Alright, " + playerName + ", let's get started.");
                System.out.println("Make sure to type out the word of the food you're choosing to throw.");
                System.out.println("You may see " + "\"Smash a Snack\"" + ", if you choose this (& health is under 20HP)\n" +
                        "you will gain 5HP. If you misspell a food, it counts as a miss!");
                System.out.println("Good luck!\n");
            } else {
                System.out.println();
                System.out.println("------Round: " + (gameRounds + 1) + ", FIGHT!------\n");

            }
                isPlaying = true;

                while (isPlaying) {

                fightHealthCheck();

            }
                gameRounds++;
        }
    }
}




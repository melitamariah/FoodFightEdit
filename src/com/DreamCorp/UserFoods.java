package com.DreamCorp;

import java.util.Random;
import java.util.Scanner;

public class UserFoods extends Game {

    // a method to handle the users food options to throw
    // this generates random food options to display after every throw
    public static String foodGenerator(String[] foods) {

        Random generator = new Random();

        int random = generator.nextInt(foods.length);
        return foods[random];
    }

    // a method to hold all the options a user could choose and its outcome
    public static void userFoodOptions(String userChoice) {

        // scanner takes in what user types (in all caps so its not case sensitive)
        Scanner scanner = new Scanner(System.in);
        userChoice = scanner.nextLine().toUpperCase();

        if (userChoice.toUpperCase().equals("APPLE")) {
            // return what computer was hit by
            System.out.println("Computer was hit by an apple.");
            // return players health and the damage it took
            System.out.println("Computers " + computerHealth + "HP - 4HP\n");
            // subtract the damage from HP
            computerHealth -= 4;
        }
        else if (userChoice.toUpperCase().equals("TOMATO")) {
            System.out.println("Computer was hit by a tomato.");
            System.out.println("Computers " + computerHealth + "HP - 3HP\n");
            computerHealth -= 3;
        }
        else if (userChoice.toUpperCase().equals("TURKEY LEG")) {
            System.out.println("Computer was hit with a turkey leg.");
            System.out.println("Computers " + computerHealth + "HP - 5HP\n");
            computerHealth -= 5;
        }
        else if (userChoice.toUpperCase().equals("EGG")) {
            System.out.println("Computer was hit with an egg.");
            System.out.println("Computers " + computerHealth + "HP - 5HP\n");
            computerHealth -= 5;
        }
        else if (userChoice.toUpperCase().equals("PIZZA")) {
            System.out.println("Computer was hit with a piece of pizza.");
            System.out.println("Computers " + computerHealth + "HP - 2HP\n");
            computerHealth -= 2;
        }

        else if (userChoice.toUpperCase().equals("OATMEAL")) {
            System.out.println("Oatmeal, oatmeal. REALLY?!");
            System.out.println("Computers " + computerHealth + "HP - 2HP\n");
            computerHealth -= 2;
        }
        else if (userChoice.toUpperCase().equals("BISCUIT")) {
            System.out.println("That Biscuit was well done, ouch.");
            System.out.println("Computers " + computerHealth + "HP - 2HP\n");
            computerHealth -= 2;
        }
        else if (userChoice.toUpperCase().equals("SMASH A SNACK") && playerHealth >= 20) {
            System.out.println("You have too much health, you threw your snack!");
            System.out.println("Computers " + computerHealth + "HP - 1HP\n");
            computerHealth -= 1;
        }
        else if (userChoice.toUpperCase().equals("SMASH A SNACK")) {
            playerHealth += 5;
            System.out.println("Enjoy that +5HP!");
            System.out.println(Game.playerName + "'s new HP = " + playerHealth + "HP\n");
        } else {
            System.out.println("You misspelled!!! Therefore, a throw and a miss!\n");
        }

    }
}

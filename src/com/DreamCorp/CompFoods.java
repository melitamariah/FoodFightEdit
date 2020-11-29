package com.DreamCorp;

import java.util.Random;

public class CompFoods extends UserFoods {

    public static int computerChoice;

    // a method to hold all the options of computers choices and the outcome
    public static void computerFoodOptions(int computerChoice) {

        // generator for computers random choices of items to throw
        Random generator = new Random();
        // set variable computerChoice to a random integer from 0 - 7
        computerChoice = generator.nextInt(8);

        // all the options
        if (computerChoice == 0) {
            // return what comp. threw
            System.out.println("Computer threw an apple!");
            // return players health and the damage it took
            System.out.println(Game.playerName + "'s " + playerHealth + "HP - 4HP\n");
            // subtract the damage from HP
            playerHealth -= 4;
        }
        else if (computerChoice == 1) {
            System.out.println("HA! " + Game.playerName + ", take that tomato!");
            System.out.println(Game.playerName + "'s " + playerHealth + "HP - 3HP\n");
            playerHealth -= 3;
        }
        else if (computerChoice == 2) {
            System.out.println("Computer threw a hefty turkey leg!");
            System.out.println(Game.playerName + "'s " + playerHealth + "HP - 5HP\n");
            playerHealth -= 5;
        }
        else if (computerChoice == 3) {
            System.out.println("Computer, with the eggcellent aim!");
            System.out.println(Game.playerName + "'s " + playerHealth + "HP - 5HP\n");
            playerHealth -= 5;
        }
        else if (computerChoice == 4) {
            System.out.println("Computer threw a pizza at you!");
            System.out.println(Game.playerName + "'s " + playerHealth + "HP - 2HP\n");
            playerHealth -= 2;
        }
        else if (computerChoice == 5) {
            System.out.println("Computer threw a bowl of oatmeal!");
            System.out.println(Game.playerName + "'s " + playerHealth + "HP - 2HP\n");
            playerHealth -= 2;
        }
        else if (computerChoice == 6) {
            System.out.println("Computer pelted you with a biscuit!");
            System.out.println(Game.playerName + "'s " + playerHealth + "HP - 2HP\n");
            playerHealth -= 2;
        }
        else if (computerHealth >= 20) {
            System.out.println("Computer has too much health, it threw it's snack!");
            System.out.println(Game.playerName + "'s " + playerHealth + "HP - 1HP\n");
            playerHealth -= 1;
        }
        else {
            System.out.println("Computer ate a snack-");
            System.out.println("Computers " + computerHealth + "HP + 5HP\n");
            computerHealth += 5;
        }
    }

}

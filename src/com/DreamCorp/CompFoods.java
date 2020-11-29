package com.DreamCorp;

import java.util.Random;

public class CompFoods extends UserFoods {

    public static int computerChoice;

    public static void computerFoodOptions(int computerChoice) {

        Random generator = new Random();

        computerChoice = generator.nextInt(8);

        if (computerChoice == 0) {
            System.out.println("Computer threw an apple!");
            System.out.println(Game.playerName + "'s " + playerHealth + "HP - 4HP\n");
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

package com.DreamCorp;

public class CheckHealth {

    public static int wins = 0, losses = 0;

    public static void fightHealthCheck() {

        if (Game.computerHealth > 0 && Game.playerHealth > 0) {

            System.out.println("Computer = " + Game.computerHealth + "HP");
            System.out.println(Game.playerName + " = " + Game.playerHealth + "HP");


            System.out.println("What are you gonna throw?");
            System.out.println("A(n): " + UserFoods.foodGenerator(new String[]{"apple", "tomato", "turkey leg"}) + ", "
                    + UserFoods.foodGenerator(new String[]{"egg", "pizza", "oatmeal"}) + " or " +
                    UserFoods.foodGenerator(new String[]{"biscuit", "Smash a Snack"}) + "\n");

            UserFoods.userFoodOptions(Game.userChoice);
            CompFoods.computerFoodOptions(CompFoods.computerChoice);

        }
        if (Game.computerHealth <= 0) {
            System.out.println("--*Final Health*--");
            System.out.println("Computer = " + Game.computerHealth + "HP");
            System.out.println(Game.playerName + " = " + Game.playerHealth + "HP\n");
            System.out.println("Nice arm, " + Game.playerName + "! You win!");
            wins++;
            System.out.println(Game.playerName + "s " + "Wins: " + wins + " | Losses: " + losses);
            Game.isPlaying = false;
            Game.playerHealth = 25;
            Game.computerHealth = 25;
        }
        if (Game.playerHealth <= 0) {
            System.out.println("--*Final Health*--");
            System.out.println("Computer = " + Game.computerHealth + "HP");
            System.out.println(Game.playerName + " = " + Game.playerHealth + "HP\n");
            System.out.println(Game.playerName + ", take this L! Computer wins!");
            losses++;
            System.out.println(Game.playerName + "s " + "Wins: " + wins + " | Losses: " + losses);
            Game.isPlaying = false;
            Game.playerHealth = 25;
            Game.computerHealth = 25;
        }
    }
}





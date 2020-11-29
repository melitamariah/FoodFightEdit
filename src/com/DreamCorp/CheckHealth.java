package com.DreamCorp;

public class CheckHealth {
    // variables holding wins and losses tally
    public static int wins = 0, losses = 0;

    // method where the fight and health check happens
    public static void fightHealthCheck() {
            // resume play if both HPs are greater than zero
        if (Game.computerHealth > 0 && Game.playerHealth > 0) {
            // display HP stats
            System.out.println("Computer = " + Game.computerHealth + "HP");
            System.out.println(Game.playerName + " = " + Game.playerHealth + "HP");

            // generating random items for the user to choose from each throw
            System.out.println("What are you gonna throw?");
            System.out.println("A(n): " + UserFoods.foodGenerator(new String[]{"apple", "tomato", "turkey leg"}) + ", "
                    + UserFoods.foodGenerator(new String[]{"egg", "pizza", "oatmeal"}) + " or " +
                    UserFoods.foodGenerator(new String[]{"biscuit", "Smash a Snack"}) + "\n");

            // where all the if statements are stored for the computer and user gameplay
            UserFoods.userFoodOptions(Game.userChoice);
            CompFoods.computerFoodOptions(CompFoods.computerChoice);

        }

        // if computer heath is less/equal 0 and less than players health (bc both HPs can go negative)
        if (Game.computerHealth <= 0 && Game.computerHealth < Game.playerHealth) {
            // showcasing final score bc scores can go negative
            System.out.println("--*Final Health*--");
            System.out.println("Computer = " + Game.computerHealth + "HP");
            System.out.println(Game.playerName + " = " + Game.playerHealth + "HP\n");
            // congrats on the win statement
            System.out.println("Nice arm, " + Game.playerName + "! You win!");
            // add 1+ to total wins
            wins++;
            // showcase total wins & losses bc game keeps track of rounds
            System.out.println(Game.playerName + "s " + "Wins: " + wins + " | Losses: " + losses);
            // reset game
            Game.isPlaying = false;
            // reset player
            Game.playerHealth = 25;
            Game.computerHealth = 25;
        }
        if (Game.playerHealth <= 0 && Game.playerHealth < Game.computerHealth) {

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





package chapter4;

import java.util.Random;

public class RollDie {
    public static void main(String args[]){
        int maxRange = 20;
        int rolls = 5;

        System.out.println("Welcome to this game, lets see how you do");
        int total = 0;
        for(int i=1; i<=rolls; i++) {
            Random random = new Random();
            int die = random.nextInt(6) + 1;
            total = total + die;

            if (total == maxRange) {
                System.out.println("You rolled " + die + " and got to 20. Congrats you won!");
                break;
            } else if (total > maxRange) {
                System.out.println("Your rolled " + die + " your total is "+ total + ". Sorry you lost");
                break;
            } else if (i==5 && total<maxRange) {
                System.out.println("You rolled " + die + " You got " + total + " after " +i + " rolls. You lost" );
            } else {
                System.out.println("You rolled " +die +". You are on a roll "+ (i) + " you are on space " + total + " and have " + (maxRange-total) + " to go.");
            }

        }


    }
}

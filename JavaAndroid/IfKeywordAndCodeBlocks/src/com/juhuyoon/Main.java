package com.juhuyoon;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
//
//        if(score < 5000 && score > 1000) {
//            System.out.println("Your score less than 5000 but greater than 1000");
//        } else if( score < 1000) {
//            System.out.println("Your score was less than 1000");
//        }
//        else {
//            System.out.println("Your score was over 1000!");
//        }


        if(gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }

        //this is done to save memory by not creating new variables and to have the numbers now are just reassigned here.
        //this is also a negative because the primary numbers are not stored.
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your score was " + finalScore);
        }
    }
}

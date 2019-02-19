package com.juhuyoon;

public class Main {

    public static void main(String[] args) {

//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;
        String player = "Mark";
//
////        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
////        System.out.println("The final score is " + highScore);
//
//
//        calculateScore(true, 10000, 8, 200);

        //What I did
        System.out.println(displayHighScorePosition(player) + " managed to get into position " +
                calculateHighScorePosition(1500) + " on the high score table.");
        System.out.println(displayHighScorePosition(player) + " managed to get into position " +
                calculateHighScorePosition(900) + " on the high score table.");
        System.out.println(displayHighScorePosition(player) + " managed to get into position " +
                calculateHighScorePosition(400) + " on the high score table.");
        System.out.println(displayHighScorePosition(player) + " managed to get into position " +
                calculateHighScorePosition(50) + " on the high score table.");

        //Answer Key:
        int highScorePositions = calculateHighScorePositions(1000);
        displayingHighScorePosition("Tim", highScorePositions);

        highScorePositions = calculateHighScorePositions(900);
        displayingHighScorePosition("Tim", highScorePositions);

        highScorePositions = calculateHighScorePositions(500);
        displayingHighScorePosition("Tim", highScorePositions);

        highScorePositions = calculateHighScorePositions(50);
        displayingHighScorePosition("Tim", highScorePositions);


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        //void keyword = don't send any value back, and you're using a method and don't want it to return something.
        //you don't have to have the parameters here in the methods.
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }  //this is because when you set a method in Java, the value returned MUST be what data type you specify
                 // it to be.
            return -1;
            //-1 is used to indicate an error or that in an algorithm, it is an invalid value.
    }

    public static String displayHighScorePosition(String player) {
        return player;
    }

    public static int calculateHighScorePosition(int playerScore) {
        if(playerScore > 1000) {
            return 1;
        } else if(playerScore > 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore > 100 && playerScore < 500) {
            return 3;
        }
        return 4;
    }


    //procedure = a method that is void.
    public static void displayingHighScorePosition(String playerName, int highScorePositions) {
        System.out.println(playerName + " managed to get into position " + highScorePositions + " on the high score table");
    }

    public static int calculateHighScorePositions(int playerScore) {
//        if(playerScore >= 1000) {
//            return 1;
//
//        } else if(playerScore >= 500) {
//            return 2;
//
//        } else if (playerScore > 100) {
//            return 3;
//
//        }
//            return 4;

        //refactoring.
        int position =4; //assuming position 4 will be returned

        if(playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position; //this is done so that there are no repetitive returns.
    }


}

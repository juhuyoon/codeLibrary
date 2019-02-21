package com.juhuyoon;

public class Main {

    public static void main(String[] args) {
//        calculateScore("Jung", 20);
//        int newScore = calculateScore("Mark", 50);
//        System.out.println("New Score is " + newScore);
//
//        calculateScore(75);
//        calculateScore();
//    }
//
//    public static int calculateScore(String playerName, int score) {
//        System.out.println("Player " + playerName + " scored " + score + " points");
//        return score * 1000;
//    }
//    //Method Overloading: Using same method name but with diff. number of parameters.
//    public static int calculateScore(int score) {
//        System.out.println("Unnamed Player has scored " + score + " points");
//        return score * 1000;
//    }
//
//    public static int calculateScore() {
//        System.out.println("No player name, no player score");
//        return 0;
        calcFeetAndInchesToCentimeters(6, 13);
        calcFeetAndInchesToCentimeters(100);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet < 0 || (inches < 0 || inches > 12)) {
            System.out.println("Invalid Number");
            return -1;
        } else {
            double centimeters = (feet * 12) * 2.54;
            centimeters += inches * 2.54;
            System.out.println(feet + " feet " + inches + "inches " + centimeters + " centimeters.");
            return centimeters;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches >= 0) {
            double feet = (int)( inches / 12);
            double remainingInches = (int)(inches % 12);
            System.out.println(inches + " inches is equal to " + feet + "feet and " + remainingInches + " inches");
            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        }
        return -1;
    }
}

package com.juhuyoon;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println(result);

        int previousResult = result;
        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;
        result = result /5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        result += 2;
        System.out.println(result);


        boolean isAlien = true;
        if(isAlien == false) {
            System.out.println("It is not an alien");
        } else {
            System.out.println("It IS an alien");
        }

        boolean isCar = false;
        if(isCar == true) { //won't work with if(isCar = true)
            System.out.println("This is not supposed to happen!");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar) {
            System.out.println("wasCar is true");
        }

        double quizNumber = 20;
        double quizNumber2 = 80;
        double quizAdd = 25 * (quizNumber + quizNumber2);
        System.out.println(quizAdd);
        double quizModulo = (quizAdd % 40);

        if(quizModulo <= 20) {
            System.out.println("Total was over the limit " + quizModulo);
        }
    }
}


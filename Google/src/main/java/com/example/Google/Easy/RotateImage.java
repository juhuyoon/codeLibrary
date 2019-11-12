package com.example.Google.Easy;

public class RotateImage {
    public void rotate(int[][] matrix) {

        //Transpose matrix
        for(int i = 0; i < matrix.length; i++) {
            for(int j = i; j < matrix.length; j++) {
               int temp = matrix[j][i];
                System.out.println(temp);
                //transpose = flipping over the matrix
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }

        // Reverse each row
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - j - 1];
                matrix[i][matrix.length - j - 1] = temp;
            }
        }
    }
    public void rotateFourBoxes(int[][] matrix) {

    }
}

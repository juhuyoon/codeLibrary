//1.8
//Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to 0.

//Implement where we use two arrays to keep track of all the rows with zeros and all the columns with zeros.
//We then nullify rows and columns based on the values in these arrays.

void setZeros(int[][] matrix) {
    boolean[] row = new boolean[matrix.length];
    boolean[] column = new boolean[matrix[0].length];

    //Store the row and column index with value 0 
    for(int i = 0; i < matrix.length; i++) {
        for(int j = 0; j < matrix[0].length; j++) {
            if(matrix[i][j] == 0 ){
                row[i] = true;
                column[j] = true;
            }
        }
    }
    //Nullify rows
    for(int i = 0; i < row.length; i++) {
        if(row[i]) nullifyRow(matrix, i);
    }

    //Nullify columns
    for(int j = 0; j < column.length; j++) {
        if(column[j]) nullifyColumn(matrix, j);
    }
}

void nullifyRow(int[][] matrix, int row) {
    for(int j = 0; j < matrix[0].length; j++) {
        matrix[row][j] = 0;
    }
}

void nullifyColumn(int[][] matrix, int col) {
    for(int i = 0; i < matrix.length; i++) {
        matrix[i][col] = 0;
    }
}


//Still O(N) space, but can be somewhat more space efficient with bit vector

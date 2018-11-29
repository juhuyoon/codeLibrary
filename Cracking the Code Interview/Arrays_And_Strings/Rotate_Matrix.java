//1.7
//Given an image represented by NxN matrix, where each pixel in the image is 4 bytes, write a method to rotate the image by 90 degrees.

boolean rotate(int[][] matrix) {
    if(matrix.length == 0 || matrix.length != matrix[0].length) 
    return false;

    int n = matrix.length;
    for(int layer = 0; layer < n /2; layer++) {
        int first = layer;
        int last = n - 1 - layer;
        for(int i = first; i < last; i++) {
            int offset = i - first;
            int top = matrix[first][i]; //save top
            
            //left -> top
            matrix[first][i] = matrix[last-offset][first];

            //bottom -> left
            matrix[last - offset][first]  = matrix[last][last - offset];

            //right -> bottom
            matrix[last][last - offset] = matrix[i][last];

            //top -> right
            matrix[i][last] = top; //right <- saved top
        }
    }
    return true;
}

//Algorithm is O(N^2) , which is the best we can do since any algorithm must touch all N^2 elements. 
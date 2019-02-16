import java.io.*;

class SmallSecond {

    static void print2Smallest(int arr[]) {
        int first, second, arr_size = arr.length;
        if(arr_size < 2) {
            System.out.println(" Invalid Input ");
            return;
        }
        first = second = Integer.MAX_VALUE;
        for(int i = 0; i < arr_size; i++) {
            if(arr[i] < first) {
                second = first;
                first = arr[i];
            }
        else if(arr[i] <  second && arr[i] != first) {
            second = arr[i];
        }
        if(second == Integer.MAX_VALUE) {
            System.out.println("There is no second" + "smallest element");
        } else {
            System.out.println("The smallest element is " + first + " and second smallest " + "element is " + second);
        }
        }
    }



    public static void main(String[] args) {
        int arr[] = {12, 13, 1, 10, 34, 1};
        print2Smallest(arr);
    }
}
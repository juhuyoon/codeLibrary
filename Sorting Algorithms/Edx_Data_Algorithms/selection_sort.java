// Sorting is one of the fundamental and most useful algorithm. There are many situations where we might want to sort our data in some order. For example, we are given a group of kids and we want to line them up in order of age. The youngest at the front of the line, and the oldest at the back. Then, we would need to use some sorting algorithm to help us doing that. Usually, in computer programming, we are sorting a list of numbers in either ascending order, where the smallest(minimum) number is on the most left side (At the front of the line) and the largest(maximum) number is on the most right side(at the end of the line) or descending order which is the exact opposite; however, we could also sort other data types if needed, as long as we define an order by which rules how they should be sorted. An example of unsorted integer array could be:

int[] lst = {4,9,7,1,3,6,5};

//sort by:
Arrays.sort(lst);
//prints out [1,3,4,5,6,7,9]
System.out.println(Arrays.toString(lst));


//Selective Sort
// Find the smallest element in this array, by calling a function Minimum(or building our own) that iterates over the entire array from element 0 (lst[0]) till N-1 (lst[N-1]). In this case it is 1, and then we will position it at the first position of this array by swapping it with the first element of the array(lst[0], which is 4):
//merge sort
//note that this is a recursive algorithm

//This sorting method is faster, but takes up a lot more memory space.

//Consider: 4,9,7,6,5,3,1
//In merge sort, recursively split and sor the left half and the right half of an array, then sort, and finally combine them. 

//Applying the algorithm: 
//split into: 
//4,9,7 || 6,5,3,1
//Split again into:
//4 || 9,7 
//then:
//check if 9,7 is organized: 7,9

//then combine into: 4,7,9

//then recursive procedure for the right subarray:
//6,5 || 3,1
//5|6 || 1|3
//1,3,5,6 (via combination)

//then combine both at the end:
//1,3,4,5,6,7,9

//combining steps done by: 
//compare the front of the two subarrays and take the smaller one and recursive until there are no more elemntts left in either array.

// if the size of array < 2: //already sorted
//     return array
// else 
// sort left subarray
// sort right subarray
// combine


Static  int[] mergeSort(int[] lst) {
    int n = lst.length; 
    int[] left;
    int[] right;
    
    // create space for left and right subarrays
    if (n % 2 == 0) {
        left = new int[n/2];
        right = new int[n/2];
    } 
    else {
        left = new int[n/2];
        right = new int[n/2+1];
    }
    
    // fill up left and right subarrays
    for (int i = 0; i < n; i++) {
        if (i < n/2) {
            left[i] = lst[i];
        }
        else {
            right[i-n/2] = lst[i];
        }
    }
    
    // recursively split and merge
    left = mergeSort(left);
    right = mergeSort(right);
    
    // merge
    return merge(left, right);
}
// the function for merging two sorted arrays
static int[] merge(int[] left, int[] right) {
    // create space for the merged array
    int[] result = new int[left.length+right.length];
    
    // running indices
    int i = 0;
    int j = 0;
    int index = 0;
    
    // add until one subarray is deplete
    while (i < left.length && j < right.length) {
        if (left[i] < right[j]) {
            result[index++] = left[i++];
        {
        else {
            result[index++] = right[j++];
        }
    }
    
    // add every leftover elelment from the subarray 
    while (i < left.length) {
        result[index++] = left[i++];
    }
    
    // only one of these two while loops will be executed
    while (j < right.length) {
        result[index++] = right[j++];
    }
    
    return result;
}

//Merge Sort is faster than either Selection sort or bubble sort but takes up much more space during the processing.
//When limited with space, merge sort is not the best idea. 

//When doing merge sort, order of the subarray does not matter. Right subarray can be done first

//Consider the array [5,3,4,1]. What would it look like before the final merging step of Merge Sort?
//result: 3,5,1,4

//Although on average, merge sort is a lot faster than bubble sort. Suppose we have an array small enough that merge sort and bubble sort actually take equal number of steps.
//which one is better?

//bubble sort as space complexity makes bubble sort more efficient than merge sort. 
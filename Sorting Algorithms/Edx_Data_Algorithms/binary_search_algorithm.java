//binary search

//If the array is sorted, we can use binary search.

//Consider: 1,3,4,5,7,9,13,15,16,17,19 //compare 15 with 9
//To look for 15 in the array, compare with the median of the array, which is 9
//15 > 9, so search for the right side of the array as we know it can't be in the first half of the array.
//then search from : 13,15,16,17,19
//split again into two, with 15 as median. Since 15 < 16, discard the second half of the array
//have 13, 15 left, and 15 = 15.
//When there is an even number of elements, compare with (n/2)+1th element

// //pseudocode
//     compare with median:
//         if size of array is 1:
//             if the numbers match:
//                 return found
//             else:
//                 return not found
//         if greater than median:
//             compare with the second half
//         else if less than median:
//             compare with the first half
//         else:
//             return found


static boolean binarySearch(int v, int[] lst, int low, int high) {
    if (low > high) {
        System.out.println("not found");
        return false;
    }
    
    int middle = (low+high)/2;
    
    if (v == lst[middle]) {
        System.out.println("found! It is at " + middle);
        return true;
    }
    else if (v > lst[middle]) {
        return binarySearch(v, lst, middle+1, high);
    }
    else {
        return binarySearch(v, lst, low, middle-1);
    }
}
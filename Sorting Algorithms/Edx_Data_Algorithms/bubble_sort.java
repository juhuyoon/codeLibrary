//Bubble Sort
//A sorting algorithm called Bubble Sort which continuously swap the largest element in the unsorted portion to the right until it is in its right position; 
//the repetively swapping resembles the way bubbles rising to the surface.

//pseudocode: 
// repeat until no swaps
// 		for i from 0 to n-2
// 			if i'th and i+1'th elements are out of order
//                 swap them

static void bubbleSort(int[] lst) {
	int n = lst.length;
	boolean swapped;
	do 
	{
		swapped = false;
		for (int i = 0; i < n-1; i++) {
			if (lst[i] > lst[i+1]) {
				int temp = lst[i];
				lst[i] = lst[i+1];
				lst[i+1] = temp;
				swapped = true;
			}
		}
	} while (swapped == true)
	
	System.out.println(Arrays.toString(lst));
};
                
//Consider the following array for these exercises:
//9,5,7,3,6,2,1

//What does the array look like after going thorugh the entire array twice using the bubble sort algorithm(not completely sorted)?

//result: 5,3,6,2,1,7,9

//What about three times?
//result: 3,5,2,1,6,7,9

//For this array, which sorting algorithm takes fewer steps?
//Selection sort (of N)


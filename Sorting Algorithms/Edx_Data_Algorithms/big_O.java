//references: https://rob-bell.net/2009/06/a-beginners-guide-to-big-o-notation/

//Big O Notation and Concept
//Used to analyze the efficiency of an algorithm.

//Running Time: 
//Think of it as how many 'steps' an algorithm would take in relation to the size of its input. 

//For Space:
//Counting how much memory space the algorithm needs in relation to the size of its input. 

//Pseudocode for bubble sort as an example: 
//	repeat until no swaps
// for i from 0 to n-2
// if i'th and i+1'th elements are out of order
//     swap them

// We learned that after the first loop the largest element is guaranteed to be positioned last in the array, after the second loop the second largest element is guaranteed to be positioned second last, and so on. 
// Therefore, to have every number in the array sorted to their correct position, at worst, we would need n loops. 
// In every loop, we do n-1 comparisons. In total, there are n*(n-1) = n^2-n steps. 
// When n is very very large (think in the millions or even billions), then the -n factor is not significant anymore. 
// Thus, we call n^2-n in order of n^2, notated as O(n^2).

//Even if you optimize bubble sort, it will always be O(n^2).
//After the first for loop, only n-2 comparisons are needed, because we know that the largest element is already at the last position, so the last comparision that we would have done is unnecessary. 
//Following this logic, we would need (n-1)+(n-2)+...+1 = n*(n-1)/2. 
//This number is two times smaller than the expression we had before, but it is still in order of O(n^2).

//Merge Sort:
// if the size of array < 2: // already sorted
//      return array 
// else
//      sort left subarray
//      sort right subarray
//      combine them

//Let's start at the top. Suppose we are given an array of size n. 
//As we recursively split the array, at the bottom level, we can picture n arrays of size 1. 
//Because these arrays have size less than 2, we don't do anything to them. 
//So we move to the next step in the algorithm, where we combine them. How many steps do we take in "combining" them? 
//To combine two arrays of size 1, we need to compare the two elements(1 step), and then put them into a new array in order (2 steps).
// In total, 3 steps. Note that there are n/2 combinings in total we need to do, so in total, we need 3n/2 steps at this level.
// Now, as we finished sorting and combining these tiny arrays, we can move above a level and deal with n/2 arrays of size 2. 
//At this level, we are trying to combine n/2 arrays of size 2 into n/4 arrays of size 4. 
//To combine 2 arrays of size 2, we need 6 steps(can you work it out?), so in total, we need 6*n/4= 3n/2 steps.
// If we do similar analysis for every level in the algorithm, it's not difficult to show that at every level, we need to take about 3n/2 steps, which is linear to n. 
//This means that at every level, Merge Sort requires O(n) steps.

//So now the question is how many levels are there in Merge Sort in total?
//Initially, we have an array of size n. At every level, we cut the size of arrays we are dealing with by half. 
//Therefore, we are asking by how many times we can divide n by 2 until we reach 1? Mathematically, the exact answer would be log_2(n), but more often than not, this number would not be an integer.
// However, what we do know this is that the actual number of levels needed is in order O(log(n)).


//In sum, we have O(log(n)) levels and each level takes O(n) steps, so Merge Sort is in order of O(nlog(n)). 
//For a large input of n, an O(nlog(n)) algorithm outperforms an O(n^2) algorithm significantly, because nlog(n) grows much slower than n^2.

//While Merge Sort is a lot faster, it is important to note that it takes a lot more space. 
//In Bubble Sort, we don't utilize extra space at all; however, in Merge Sort, whenever we are trying to merge two arrays, we have to create a new array that is double the size of thest two arrays (remember that arrays are immutable).
// As such, at each level, we would need arrays that add up to size n, but because only one level of Merge Sort is running at a given time, we don't need to allocate space that's more than a n-sized array. 
//Thus, we call Merge Sort in order of O(n) space. As mentioned, Bubble Sort does not take extra space, so it is in order of O(1) space.
// That is, regardless of how big our input is, the amount of extra space it takes is constant. In this case, the amount is actually 0.



//Big Theta and Omega
    // Big Omega Ω
    //Big Omega is the best case scenario/super lucky scenario. 
    //The best case, for example, of sorting an array of size N using bubble sort is:
    //if it's already sorted, then Big Omega of Bubble sort is Ω(n)
    
    // Big Theta Θ
    //If the best case scenario and worst case scenario are the same, then Big Theta notation is used. 

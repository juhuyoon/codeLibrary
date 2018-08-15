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


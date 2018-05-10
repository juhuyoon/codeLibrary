// Big O time = language and metric used to describe the efficiency of algorithms. 

// Time complexity: Asymptotic runtime / big O time. 
//     Data transfer Algorithm runtime is:
//         1) Electronic Transfer: O(s), s = size of the file. Time to transfer the file increases linearly with the size of the file. 
//         2) Airplane Transfer: O(1) with respect to size of the file. As the size increases, will not take any longer to get the file to your friend. Time is constant.
        
// O: big(O): describes an upper bound on the time. 
// big omega: equivalent concept of the lower bound of the time.
// big theta: means both big O and big omega. Tight bound on runtime. 

//Description of runtimes for an algorithm is in three different ways: 
    //Best Case, Worst Case, Expected Case
//=============================================================================================================================

//Space Complexity
    //Must worry about both time and amount of memory/space is required for an algorithm.
    //Space complexity is in parallel with time cplexity. If an array of size n is needed, then it will require O(n) space.

//recursive call example:
int sum(int n) { /* Ex 1 */
    if(n <= 0) {
        return 0;
    }
        return n + sum(n-1);
    };

//Result: sum(4) -> sum(3) -> sum(2) -> sum(1) -> sum(0) 
// Each of these calls are added to the call stack and takes up actual memory. 

//However, you can have a different function which adds adjacent elements between 0 and n:
int pairSumSequence(int n) { /* Ex 2 */
    int sum = 0;
    for( int i = 0; i < n; i++) {
        sum += pairSum(i, i + 1);
    }
    return sum;
}

int pairSum(int a, int b) {
    return a + b;
}

//There will be O(n) calls to pairSum. HOWEVER, those calls do not exist simultaneously on the call stack, so only O(1) space is needed. [ASYNC CALL?]

//=============================================================================================================================
//Drop the Constants: 

    //It is possible for O(N) code to run faster than the O(1) code for specific inputs. Big O describes this rate of increase. 
    //So don't use constants in runtimes. O(2N) is just O(N).

    //Example:
    
        //MIN AND MAX 1
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
                for (int x: array) {
                    if (x < min) min = x;
                    if ( x > max) max = x;
                }

        //MIN AND MAX 2
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE; 
                for(int x : array) {
                    if (x < min) min = x;
                } for (int x: array) {
                    if ( x > max) max = x;
                }

    //Which one is faster? Frankly, it's hard to answer. So rather than going down a complicated route, just remove the constants and note that O(N) does not always mean it's better than O(N^2);

//=============================================================================================================================
//Drop the Non-Dominant Terms
    //Get rid of non-important terms:
    //Example 1: O(N^2 + N) becomes O(N^2)
    //Example 2: O(N + logN) becomes O(N)
    //Example 3: O(5*2^N + 1000N^100) becomes O(2^N)

    //If it's a sum of a runtime, such as O(B^2 + N) where the B and N are different variables, then additional information is needed. 

//=============================================================================================================================
//Multi-Part Algorithms: Add vs. Multiply
            //When do you multiply the runtimes and when do you add them when you have an algorithm with two steps? 

        //Example 1:
                for (int a: arrA) {
                    print(a)
                }

                for (int b: arrB) {
                    print(b)
                }
        
        //Example 2: 
                for(int a: arrA) {
                    for(int b: arrB) {
                        print(a + "," + b);
                    }
                }

//Example 1: do chunk A work then chunk B work. Thus, the amount of time  is: O(A + B) [so addition of runtimes]
//Example 2: Do chunk B work for each element in A. So, the total amount of worktime is: O(A * B) [so multiplication of runtimes]

//Do this, then when you're done do that = add
//Do this for each time you do that = multiply

//=============================================================================================================================
//Amortized TIme
        //ArrayList = dynamically resizing array that gives you flexibility as it never runs out of space. 
                //Implemented with an array. 
                //How do you describe runtime of insertions? 

        //Example: You have an ArrayList. When it hits capacity, the ArrayList class will create a new array with double the capacity and copy all the elements over to the new array. 
                    //What is the runtime of insertion?

            //Breakdown:
                //Array is full, contains N elements, then inserting a new element will take O(N) time. 
                //Then a new array would be created to a new array of size 2N and then copy N elements over. Insertion will take O(N) time. 
                //However, vast majority of time insertion will be O(1) time. 
                    //Amortized time: Worst case can happen every once in a while, but once it happens, it won't happen again for so long that cost is "amortized"

                //So as we insert the ellements, the size of the array is doubled: so 1, 2, 4, 8, 16 ... X. 
                    //What is the sum of 1 + 2 +4 + 8 + 16 ... + X = 2X. 
                    //Therefore, X insertions take O(2X) time. Amortized time for each insertion is O(1). 
                    